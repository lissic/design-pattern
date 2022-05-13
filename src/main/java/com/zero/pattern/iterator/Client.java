package main.java.com.zero.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zero
 * @description Client
 * @date 2022/5/13 14:44
 */
public class Client {
    public static void main(String[] args) {
        // 输出所有学院下的所有系
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);
        for (College college: collegeList) {
            System.out.println("======" + college.getName() + "===========");
            Iterator iterator = college.createIterator();
            while (iterator.hasNext()) {
                Department department = (Department) iterator.next();
                System.out.println(department.getName() + "==" + department.getDesc());
            }
        }
    }
}
