package main.java.com.zero.pattern.singleton.hungry;

/**
 * @author zero
 * @description HungrySingleton 饿汉模式--静态常量
 * @date 2022/4/25 15:09
 */
public class HungrySingleton1 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

class Singleton{
    // 1、构造器私有化
    private Singleton() {

    }

    // 2、提前创建好对象
    private final static Singleton singleton = new Singleton();

    // 3、提供访问对象的方法
    public static Singleton getInstance() {
        return singleton;
    }
}
