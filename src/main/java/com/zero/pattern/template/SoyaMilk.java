package main.java.com.zero.pattern.template;

/**
 * @author zero
 * @description SoyaMile
 * @date 2022/5/11 14:27
 */
public abstract class SoyaMilk {
    // 模板方法(固定流程/算法)可以声明成final，不让子类重写
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }
   private void select() {
        System.out.println("选择新鲜黄豆");
    }

    // 添加不同的配料，抽象方法，让子类去实现
    protected abstract void addCondiments();

    private void soak() {
        System.out.println("黄豆和配料开始浸泡");
    }

    private void beat() {
        System.out.println("将黄豆和配料放到豆浆机中打碎");
    }
}
