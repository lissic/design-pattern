package main.java.com.zero.pattern.builder;

/**
 * @author zero
 * @description Client
 * @date 2022/5/6 17:17
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director = new HouseDirector(commonHouse);
        House house = director.constructHouse();
        System.out.println(house);
    }
}
