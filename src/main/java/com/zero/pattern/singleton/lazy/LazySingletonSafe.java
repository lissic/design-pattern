package main.java.com.zero.pattern.singleton.lazy;

/**
 * @author zero
 * @description LazySingleton 懒汉式，线程安全
 * @date 2022/4/25 15:23
 */
public class LazySingletonSafe {
    public static void main(String[] args) {
        Singleton1 instance1 =Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton1{
    private static Singleton1 instance;

    private Singleton1() {}

    public static synchronized Singleton1 getInstance() {
        // 加synchronized使得实例化的过程线程安全
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
