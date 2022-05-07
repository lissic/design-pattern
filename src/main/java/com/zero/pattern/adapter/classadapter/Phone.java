package main.java.com.zero.pattern.adapter.classadapter;

/**
 * @author zero
 * @description Phone
 * @date 2022/5/7 16:17
 */
public class Phone {
    public void charge(IVoltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压正常，可以充电。。。。");
        } else {
            System.out.println("电压不正常，无法充电");
        }
    }
}
