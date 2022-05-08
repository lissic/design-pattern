package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Milk
 * @date 2022/5/8 21:44
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(1.0f);
    }
}
