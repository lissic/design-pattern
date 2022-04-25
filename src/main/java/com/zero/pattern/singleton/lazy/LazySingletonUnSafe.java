package main.java.com.zero.pattern.singleton.lazy;

/**
 * @author zero
 * @description LazySingleton 懒汉式，线程非安全
 * @date 2022/4/25 15:23
 */
public class LazySingletonUnSafe {
    public static void main(String[] args) {
        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        // 在使用的时候才进行实例化
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
