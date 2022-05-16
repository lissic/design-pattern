package main.java.com.zero.pattern.interpreter;

import java.util.HashMap;

/**
 * @author zero
 * @description Expression
 * @date 2022/5/16 17:14
 */
public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
