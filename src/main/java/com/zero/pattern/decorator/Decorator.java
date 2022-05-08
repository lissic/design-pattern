package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Decorator
 * @date 2022/5/8 21:38
 */
public class Decorator extends Drink{
    private Drink drink;
    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDesc() {
        return super.getDesc() + super.getPrice();
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }
}
