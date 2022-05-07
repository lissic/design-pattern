package main.java.com.zero.pattern.bridge;

/**
 * @author zero
 * @description Vivo
 * @date 2022/5/7 22:26
 */
public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }
}
