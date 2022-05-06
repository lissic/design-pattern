package main.java.com.zero.pattern.builder;

/**
 * @author zero
 * @description HouseBuilder
 * @date 2022/5/6 17:09
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse() {
        return house;
    }
}
