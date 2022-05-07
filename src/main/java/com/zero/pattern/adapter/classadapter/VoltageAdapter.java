package main.java.com.zero.pattern.adapter.classadapter;

/**
 * @author zero
 * @description VoltageAdapter
 * @date 2022/5/7 16:15
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int srcV = output220v();
        int dstV = srcV / 44;
        return dstV;
    }
}
