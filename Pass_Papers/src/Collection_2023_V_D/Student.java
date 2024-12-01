package Collection_2023_V_D;

public class Student implements IPerson {
    private String studentID;
    private int gender;

    public Student(String studentID, int gender){
        this.studentID = studentID;
        this.gender = gender;
    }
    @Override
    public String displayDetails(){
        return "Student ID:" +studentID + "\nGender:" +gender;
    }
}
