package main.java.com.zero.pattern.singleton.staticclass;

/**
 * @author zero
 * @description StaticInnerClassSingleton 静态内部类的方式实现
 * @date 2022/4/25 16:22
 */
public class StaticInnerClassSingleton {

    public static void main(String[] args) {
        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }


}
class Singleton{
    private Singleton() {}
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}


