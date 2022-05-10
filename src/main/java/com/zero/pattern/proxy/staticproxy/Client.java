package main.java.com.zero.pattern.proxy.staticproxy;

/**
 * @author zero
 * @description Client
 * @date 2022/5/10 16:36
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.tech();
    }
}
