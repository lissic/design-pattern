package main.java.com.zero.pattern.facade;

/**
 * @author zero
 * @description DVDPlayer
 * @date 2022/5/9 15:01
 */
public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("dvd打开");
    }

    public void off() {
        System.out.println("dvd关闭");
    }
    public void play() {
        System.out.println("dvd is playing");
    }
}
