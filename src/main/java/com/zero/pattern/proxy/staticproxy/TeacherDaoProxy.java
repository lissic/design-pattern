package main.java.com.zero.pattern.proxy.staticproxy;

/**
 * @author zero
 * @description TeacherDaoProxy
 * @date 2022/5/10 16:34
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void tech() {
        System.out.println("代理之前。。。。");
        target.tech();
        System.out.println("代理之后。。。。");
    }
}
