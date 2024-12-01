package Collection_2023_V_D;

public class Lecturer implements IPerson{
    private String employeeID;
    private String department;

    public Lecturer(String employeeID, String department ){
        this.employeeID = employeeID;
        this.department = department;
    }
    public String displayDetails(){
        return "employeeID" +employeeID+"department" +department;
    }
}
