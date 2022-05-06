package main.java.com.zero.pattern.builder;

/**
 * @author zero
 * @description HighBuilding
 * @date 2022/5/6 17:13
 */
public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基10m");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
