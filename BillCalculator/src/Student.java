public class Student {
    private static int max = 100;

    private int studentID;
    private String name;
    private String degree;
    private String mobile;

    // Constructor
    public Student(String name, String degree, String mobile) {
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
        this.studentID = getNextStudentID();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getStudentID() {
        return studentID;
    }

    // Print details
    public void print() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Degree: " + degree);
        System.out.println("Mobile: " + mobile);
    }

    public static int getNextStudentID() {
        return max++;
    }
}

class StudentApp {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("John Doe", "Computer Science", "1234567890");
        students[1] = new Student("Jane Smith", "Electrical Engineering", "9876543210");
        students[2] = new Student("Alice Johnson", "Mechanical Engineering", "4561237890");
        students[3] = new Student("Bob Williams", "Civil Engineering", "7894561230");
        students[4] = new Student("Eva Brown", "Chemical Engineering", "3216549870");

        for (Student student : students) {
            student.print();
            System.out.println();
        }
    }
}
