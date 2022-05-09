package main.java.com.zero.pattern.facade;

/**
 * @author zero
 * @description DVDPlayer
 * @date 2022/5/9 15:01
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("投影仪打开");
    }

    public void off() {
        System.out.println("投影仪关闭");
    }
    public void focus() {
        System.out.println("投影仪在聚焦");
    }
}
