package main.java.com.zero.pattern.bridge;

/**
 * @author zero
 * @description FoldedPhone
 * @date 2022/5/7 22:29
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
    }

    public void call() {
        super.call();
    }

    public void close() {
        super.close();
    }
}

