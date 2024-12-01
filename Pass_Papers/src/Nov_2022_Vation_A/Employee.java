package Nov_2022_Vation_A;

public abstract class Employee {
    private int id;
    private  String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display(){
        System.out.println("Employee Id :" +id);
        System.out.println("Employee Name :" +name);
    }

    public abstract double calculateNetSalary();

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

}
