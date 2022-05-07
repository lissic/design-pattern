package main.java.com.zero.pattern.bridge;

/**
 * @author zero
 * @description Phone
 * @date 2022/5/7 22:28
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void call() {
        this.brand.call();
    }

    protected void close() {
        this.brand.close();
    }
}
