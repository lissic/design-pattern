package main.java.com.zero.pattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @description InfoCollegeIterator
 * @date 2022/5/13 14:32
 */
public class InfoCollegeIterator implements Iterator {
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() -1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
