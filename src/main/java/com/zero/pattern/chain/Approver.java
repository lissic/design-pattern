package main.java.com.zero.pattern.chain;

/**
 * @author zero
 * @description Approver
 * @date 2022/5/17 16:34
 */
public abstract class Approver {
    // 下一个处理者
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    // 处理审批请求
    public abstract void processRequest(PurchaseRequest request);
}
