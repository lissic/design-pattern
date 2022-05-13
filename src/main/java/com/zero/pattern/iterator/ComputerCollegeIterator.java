package main.java.com.zero.pattern.iterator;

import java.util.Iterator;

/**
 * @author zero
 * @description ComputerCollegeIterator
 * @date 2022/5/13 14:28
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position++];
        return department;
    }
}
