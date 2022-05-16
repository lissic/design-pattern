package main.java.com.zero.pattern.memento;

/**
 * @author zero
 * @description GameRole
 * @date 2022/5/16 15:05
 */
public class GameRole {
    private int vit;
    private int def;

    // 创建备忘录对象
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    // 从备忘录对象中恢复对象状态
    public void recoverGameRole(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void display() {
        System.out.println("游戏角色当前的攻击力：" + this.vit + ", 防御力：" + this.def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
