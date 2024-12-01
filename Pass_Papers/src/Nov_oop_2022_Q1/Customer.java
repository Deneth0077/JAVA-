package Nov_oop_2022_Q1;

public abstract class  Customer{
    private int id;
    private String name;

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Customer id"+id);
        System.out.println("Customer name"+name);
    }

    public abstract double calculateBill();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
