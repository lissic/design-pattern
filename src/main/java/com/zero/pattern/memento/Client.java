package main.java.com.zero.pattern.memento;

/**
 * @author zero
 * @description Client 备忘录模式
 * @date 2022/5/16 15:05
 */
public class Client {
    public static void main(String[] args) {
        // 创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("原始战斗力");
        gameRole.display();
        // 保存当前状态
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(gameRole.createMemento());
        System.out.println("经过一段时间大战");
        gameRole.setVit(40);
        gameRole.setDef(50);
        gameRole.display();
        // 使用备忘录恢复状态a
        System.out.println("经过修养后的战斗力");
        gameRole.recoverGameRole(careTaker.getMemento());
        gameRole.display();
    }
}
