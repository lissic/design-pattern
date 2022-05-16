package main.java.com.zero.pattern.interpreter;

/**
 * @author zero
 * @description SymbolExpression
 * @date 2022/5/16 17:15
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    //所有的解析公式都应只关心自己左右两个表达式的结果
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
