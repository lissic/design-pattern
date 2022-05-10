package main.java.com.zero.pattern.proxy.staticproxy;

/**
 * @author zero
 * @description TeacherDao
 * @date 2022/5/10 16:34
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void tech() {
        System.out.println("开始教书。。。。");
    }
}
