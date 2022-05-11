package main.java.com.zero.pattern.template;

/**
 * @author zero
 * @description PeanutSoyaMike
 * @date 2022/5/11 14:32
 */
public class PeanutSoyaMilk extends SoyaMilk{
    @Override
    protected void addCondiments() {
        System.out.println("加入花生");
    }
}
