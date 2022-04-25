package main.java.com.zero.pattern.singleton.lazy;

/**
 * @author zero
 * @description LazySingletonBlock 同步代码块的方式实现，但此方式是非线程安全的
 * @date 2022/4/25 15:42
 */
public class LazySingletonBlock {

    private static LazySingletonBlock instance;

    private LazySingletonBlock() {
    }

    public static LazySingletonBlock getInstance() {
        if (instance == null) {
            // 此处加锁是不能保证线程安全的
            synchronized (LazySingletonBlock.class) {
                instance = new LazySingletonBlock();
            }
        }
        return instance;
    }
}
