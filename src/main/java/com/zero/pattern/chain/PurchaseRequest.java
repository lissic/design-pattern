package main.java.com.zero.pattern.chain;

/**
 * @author zero
 * @description PurchaseRequest
 * @date 2022/5/17 16:32
 */
public class PurchaseRequest {
    private int type;
    private float price = 0.0f;
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
