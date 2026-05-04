// Task 2: StringBuffer – Order Tracking System
//  Scenario:
//  An online shopping app updates order status step by step.
//  Task:
// ●	Start with: "Order Placed"
//  Use StringBuffer to:
// 1.	Append " -> Packed"
// 2.	Append " -> Shipped"
// 3.	Append " -> Delivered"
//  Expected Output:
//  Order Placed -> Packed -> Shipped -> Delivered

public class OrderTracking {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Order Placed");
        sb.append(" -> Packed");
        sb.append(" -> Shipped");
        sb.append(" -> Delivered");
        System.out.println(sb.toString());

    }
}
