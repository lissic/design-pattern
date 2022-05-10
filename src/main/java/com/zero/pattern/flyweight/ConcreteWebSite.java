package main.java.com.zero.pattern.flyweight;

/**
 * @author zero
 * @description ConcreteWebSite
 * @date 2022/5/10 15:10
 */
public class ConcreteWebSite extends WebSite {
    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站的发布形式为：" + type);
    }
}
