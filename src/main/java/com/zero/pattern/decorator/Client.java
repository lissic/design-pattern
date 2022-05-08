package main.java.com.zero.pattern.decorator;

/**
 * @author zero
 * @description Client
 * @date 2022/5/8 21:44
 */
public class Client {
    public static void main(String[] args) {
        // 获取加了一份牛奶两份巧克力的美式咖啡
        Drink longBlack = new LongBlack();
        System.out.println(longBlack.getDesc() + "--" + longBlack.getPrice());
        Drink milk = new Milk(longBlack);
        System.out.println("加了牛奶的美式："+ milk.cost() + milk.getDesc());
        Drink chocolate = new Chocolate(milk);
        System.out.println("加了一份巧克力的美式：" + chocolate.cost() + chocolate.getDesc());
        Drink chocolate2 = new Chocolate(chocolate);
        System.out.println("加了两份巧克力的美式：" + chocolate2.cost() + chocolate2.getDesc());
    }
}
