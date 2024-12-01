package OOP_V_F_2023;

import java.util.ArrayList;
import java.util.List;

class Student extends Person{
    private List<Course> enrolledCourses;

    // Default constructor
    public Student(){
        super();
        this.enrolledCourses = new ArrayList<>();
    }

    // Overloaded constructor to initialize attributes
    public Student(int id, String name) {
        super(id, name);
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void EnrollCourse(Course c) {
        enrolledCourses.add(c);
    }

    // Override method to display student's details
    @Override
    public void DisplayDetails() {
        System.out.println("Student ID: " + ID);
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            course.DisplayCourseDetails();
        }
    }
}
