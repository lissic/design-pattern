package main.java.com.zero.pattern.composite;

/**
 * @author zero
 * @description Department
 * @date 2022/5/9 14:22
 */
public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
