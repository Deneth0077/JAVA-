package OOP_V_B_2023;

public class orderProcessingApp {
    public static void main(String[] args) {

        //instances
        product product1 = new product();
        product1.read();

        product product2 = new product();
        product2.read();

        product product3 = new product();
        product3.read();

        product product4 = new product();
        product4.read();

        //order instances
        order order1 = new order( 1, "Jhon","2024/11/21" );
        order order2 = new order( 2, "Jhon","2024/11/21" );

        order1.AddProduct(product1);
        order2.AddProduct(product2);
        order1.AddProduct(product3);
        order2.AddProduct(product4);

        System.out.println("Ordre 1 Details");
        order1. ProcessOrder();

        System.out.println("Ordre 2 Details");
        order2. ProcessOrder();

    }
}
