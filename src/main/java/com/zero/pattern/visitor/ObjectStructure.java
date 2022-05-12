package main.java.com.zero.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zero
 * @description ObjectStructure
 * @date 2022/5/12 15:33
 */
public class ObjectStructure {
    // 数据管理
    private List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }
    public void detach(Person p) {
        persons.remove(p);
    }
    public void display(Action action) {
        for (Person p : persons) {
            p.accept(action);
        }
    }
}
