package main.java.com.zero.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @description University
 * @date 2022/5/9 14:15
 */
public class University extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public University(String name, String desc) {
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
        System.out.println("-------------" + getName() + "-------------");
        components.forEach(OrganizationComponent::print);
    }
}
