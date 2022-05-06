package main.java.com.zero.pattern.builder;

/**
 * @author zero
 * @description HouseDirector
 * @date 2022/5/6 17:14
 */
public class HouseDirector {
    HouseBuilder builder = null;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    // 具体产品的创建过程，过程是不对外暴露的
    public House constructHouse() {
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.buildHouse();
    }
}
