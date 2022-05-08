package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Chocolate
 * @date 2022/5/8 21:43
 */
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(2.0f);
    }
}
