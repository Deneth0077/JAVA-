package OOP_V_F_2023;

abstract class Course {
    protected String code;
    protected String courseName;

    public Course(){
        this.code = "";
        this.courseName = "";
    }

    public Course(String code, String courseName){
        this.code = code;
        this.courseName = courseName;
    }

    public abstract void DisplayCourseDetails();
}
