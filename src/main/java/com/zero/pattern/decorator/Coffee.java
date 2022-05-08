package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Coffee
 * @date 2022/5/8 21:24
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
