package OOP_V_B_2023;

import java.util.Scanner;

public class product {
    private int productID;
    private String productName;
    private double productPrice;
    private int stockQuantity;

    //  default constructor
    public product(){}

    //overloaded  constructor
    public product(int productID, String productName, double productPrice, int stockQuantity){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.stockQuantity = stockQuantity;

    }

    public void read(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        this.productID = scanner.nextInt();

        System.out.print("Enter product name: ");
        this.productName = scanner.next();

        System.out.print("Enter product price: ");
        this.productPrice = scanner.nextDouble();

        System.out.print("Enter stock quantity: ");
        this.stockQuantity = scanner.nextInt();

    }

    public void display(){
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Stock Quantity: " + stockQuantity);
    }
}
