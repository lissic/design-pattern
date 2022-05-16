package main.java.com.zero.pattern.interpreter;

import java.util.HashMap;

/**
 * @author zero
 * @description VarExpression
 * @date 2022/5/16 17:15
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    //从map中取之
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
