package main.java.com.zero.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zero
 * @description WebSiteFactory
 * @date 2022/5/10 15:11
 */
public class WebSiteFactory {
    private Map<String, ConcreteWebSite> websites = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!websites.containsKey(type)) {
            websites.put(type, new ConcreteWebSite(type));
        }

        return websites.get(type);
    }

    public int getWebSiteCount() {
        return websites.size();
    }
}
