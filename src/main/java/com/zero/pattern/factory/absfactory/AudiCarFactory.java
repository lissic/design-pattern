package main.java.com.zero.pattern.factory.absfactory;

/**
 * @author zero
 * @description ModifyAudiCarFactory
 * @date 2022/4/26 16:30
 */
public class AudiCarFactory extends CreateAudiCarFactory{
    @Override
    public void modifyCar(Car car) {
        System.out.println("修理奥迪汽车！！！");
    }
}
