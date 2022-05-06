package main.java.com.zero.pattern.prototype;

/**
 * @author zero
 * @description Person
 * @date 2022/5/6 15:51
 */
public class Person  implements Cloneable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 对类中的基本数据类型及String类型的属性进行拷贝，涉及到其他类型属性，则为拷贝对象的引用
    @Override
    protected Person clone() {
        Person person = null;
        try {
            person = (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
