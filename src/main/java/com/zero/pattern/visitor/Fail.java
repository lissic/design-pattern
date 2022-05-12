package main.java.com.zero.pattern.visitor;

/**
 * @author zero
 * @description Success
 * @date 2022/5/12 15:16
 */
public class Fail extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("给男人的评价是失败的");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("给女人的评价是失败的");
    }
}
