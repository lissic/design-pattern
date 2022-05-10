package main.java.com.zero.pattern.flyweight;

/**
 * @author zero
 * @description Client
 * @date 2022/5/10 15:15
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSite("新闻");
        webSite.use();

        WebSite webSite1 = factory.getWebSite("博客");
        webSite1.use();
    }
}
