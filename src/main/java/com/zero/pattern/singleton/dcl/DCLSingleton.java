package main.java.com.zero.pattern.singleton.dcl;

/**
 * @author zero
 * @description DCSingleton 双重检查单例模式，解决了线程安全问题，同时解决懒加载问题，推荐使用
 * @date 2022/4/25 15:50
 */
public class DCLSingleton {
    public static void main(String[] args) {
        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
