package OOP_V_B_2023;

import java.util.LinkedList;
import java.util.Queue;

public class order {
    private int orderID;
    private String customerName;
    private String orderDate;
    private Queue<product> productQueue;

    //a default constructor
    public order(){
        productQueue = new LinkedList<>();
    }

    // overloaded constructor
    public order(int orderId, String customerName, String orderDate){
        this();
        this.orderID = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }

    //create method for AddProduct
    public void AddProduct(product p){
        productQueue.add(p);
    }

    //method display the Order details
    public void ProcessOrder(){
        System.out.println("Order ID :" +orderID);
        System.out.println("Customer Name :" + customerName);
        System.out.println("Order Date :" + orderDate);
        System.out.println("Products in the order :");

        for(product p : productQueue){
            p.display();
        }
    }

}
