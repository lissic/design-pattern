package main.java.com.zero.pattern.singleton.enumeration;

/**
 * @author zero
 * @description EnumSingleton 使用枚举类的特性实现单例模式
 * @date 2022/4/25 16:35
 */
public class EnumSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.say();
    }
}

enum Singleton{
    /**
     * 单例对象
     */
    INSTANCE;
    public void say() {
        System.out.println("this is a enum class");
    }
}
