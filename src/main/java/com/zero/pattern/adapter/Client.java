package main.java.com.zero.pattern.adapter;

import main.java.com.zero.pattern.adapter.interfaceadapter.AbstractAdapter;
import main.java.com.zero.pattern.adapter.objectdapter.Phone;
import main.java.com.zero.pattern.adapter.objectdapter.Voltage220V;
import main.java.com.zero.pattern.adapter.objectdapter.VoltageAdapter;

/**
 * @author zero
 * @description Client
 * @date 2022/5/7 16:19
 */
public class Client {
    public static void main(String[] args) {
        // 类适配器模式
        /*Phone phone = new Phone();
        phone.charge(new VoltageAdapter());*/
        // 对象适配器模式
        /*Phone phone = new Phone();
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.setVoltage220V(new Voltage220V());
        phone.charge(voltageAdapter);*/
        // 接口适配器模式
        AbstractAdapter adapter = new AbstractAdapter(){
            @Override
            public void operation() {
                System.out.println("覆盖默认方法实现");
            }
        };
        adapter.operation();
    }
}
