package OOP_V_F_2023;

// Main application class
public class InstitutionManagementApp {
    public static void main(String[] args) {
        // Create instances of Student
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Create instances of Teacher
        Teacher teacher1 = new Teacher(101, "Dr. Smith");
        Teacher teacher2 = new Teacher(102, "Prof. Johnson");

        // Create courses
        Course course1 = new ConcreteCourse("C101", "Mathematics");
        Course course2 = new ConcreteCourse("C102", "Physics");
        Course course3 = new ConcreteCourse("C103", "Chemistry");

        // Students enrolling in courses
        student1.EnrollCourse(course1);
        student1.EnrollCourse(course2);
        student2.EnrollCourse(course2);
        student2.EnrollCourse(course3);

        // Teachers teaching courses
        teacher1.TeachCourse(course1);
        teacher1.TeachCourse(course3);
        teacher2.TeachCourse(course2);

        // Display details of students and teachers
        System.out.println("Student Details:");
        student1.DisplayDetails();
        System.out.println();
        student2.DisplayDetails();
        System.out.println();

        System.out.println("Teacher Details:");
        teacher1.DisplayDetails();
        System.out.println();
        teacher2.DisplayDetails();
    }
}
