package main.java.com.zero.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @description College
 * @date 2022/5/9 14:19
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> components = new ArrayList<>();

    public College(String name, String desc) {
        super(name, desc);
    }

    @Override
    protected void add(OrganizationComponent component) {
        components.add(component);
    }

    @Override
    protected void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    protected void print() {
        System.out.println("------------" + getName() + "-----------");
        components.forEach(OrganizationComponent::print);
    }
}
