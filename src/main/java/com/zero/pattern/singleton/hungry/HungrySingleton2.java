package main.java.com.zero.pattern.singleton.hungry;

/**
 * @author zero
 * @description HungrySingleton 饿汉模式--静态代码块
 * @date 2022/4/25 15:09
 */
public class HungrySingleton2 {

    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton2{
    private static Singleton2 instance;
    // 1、构造器私有化
    private Singleton2() {}
    static {
        // 2、提前创建好对象
        instance = new Singleton2();
    }
    // 3、提供访问对象的方法
    public static Singleton2 getInstance() {
        return instance;
    }
}

