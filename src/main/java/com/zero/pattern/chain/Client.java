package main.java.com.zero.pattern.chain;

/**
 * @author zero
 * @description Client 责任链模式
 * @date 2022/5/17 16:29
 */
public class Client {
    public static void main(String[] args) {
        // 创建请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 7000, 1);
        // 创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("李主任");
        CollegeApprover collegeApprover = new CollegeApprover("孙院长");

        // 设置审批流程
        departmentApprover.setApprover(collegeApprover);
        departmentApprover.processRequest(purchaseRequest);
    }
}
