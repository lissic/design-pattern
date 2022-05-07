package main.java.com.zero.pattern.bridge;

/**
 * @author zero
 * @description Client
 * @date 2022/5/7 22:31
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("=================");
        Phone phone1 = new FoldedPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
