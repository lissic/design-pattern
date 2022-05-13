package main.java.com.zero.pattern.iterator;

import java.util.Iterator;

/**
 * @author zero
 * @description College
 * @date 2022/5/13 14:34
 */
public interface College {
    String getName();
    void addDepartment(String name, String desc);
    Iterator createIterator();
}
