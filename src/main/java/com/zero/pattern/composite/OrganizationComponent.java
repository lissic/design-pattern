package main.java.com.zero.pattern.composite;

/**
 * @author zero
 * @description OrganizationComponent
 * @date 2022/5/9 14:12
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    protected void add(OrganizationComponent component) {
        // 默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponent component) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 需要子类实现的方法
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "OrganizationComponent{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}
