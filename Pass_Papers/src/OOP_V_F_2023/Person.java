package OOP_V_F_2023;

abstract class  Person {
    protected int ID;
    protected String name;

    public Person(){
       this.ID = 0;
       this.name = "null";
    }

    public  Person(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    public abstract void DisplayDetails();

}
