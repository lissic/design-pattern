package main.java.com.zero.pattern.composite;

/**
 * @author zero
 * @description Client
 * @date 2022/5/9 14:24
 */
public class Client {
    public static void main(String[] args) {
        // 实现一个大学有多个学院，每个学院有多个系，类似于一个树状结构
        University university = new University("北京大学", "中国最牛逼的大学");
        College college = new College("计算机学院", "");
        College college1 = new College("通讯学院", "");
        college.add(new Department("软件工程",""));
        college.add(new Department("网络工程",""));
        college.add(new Department("计算机科学与技术",""));
        college1.add(new Department("信息工程",""));
        college1.add(new Department("通讯工程",""));
        university.add(college);
        university.add(college1);
        university.print();
    }
}
