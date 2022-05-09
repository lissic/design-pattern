package main.java.com.zero.pattern.facade;

/**
 * @author zero
 * @description Client
 * @date 2022/5/9 15:03
 */
public class Client {
    public static void main(String[] args) {
        // 外观模式只需提供统一的接口供客户端调用即可实现复杂功能的实现
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade();
        theaterFacade.open();
        System.out.println("漫威的电影真好看....");
        theaterFacade.close();
    }
}
