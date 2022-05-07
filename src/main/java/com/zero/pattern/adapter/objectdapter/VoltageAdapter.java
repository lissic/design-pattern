package main.java.com.zero.pattern.adapter.objectdapter;

/**
 * @author zero
 * @description VoltageAdapter
 * @date 2022/5/7 16:15
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    @Override
    public int output5V() {
        int dstv = 0;
        if (voltage220V != null) {
            int srcV = voltage220V.output220v();
            int dstV = srcV / 44;
        }
        return dstv;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
}
