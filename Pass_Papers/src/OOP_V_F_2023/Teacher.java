package OOP_V_F_2023;

import java.util.ArrayList;
import java.util.List;

// Concrete class Teacher
class Teacher extends Person {
    private List<Course> coursesTaught;  // List to hold courses taught

    // Default constructor
    public Teacher() {
        super();
        this.coursesTaught = new ArrayList<>();
    }

    // Overloaded constructor to initialize attributes
    public Teacher(int id, String name) {
        super(id, name);
        this.coursesTaught = new ArrayList<>();
    }

    // Method to add a course to the list of courses taught
    public void TeachCourse(Course c) {
        coursesTaught.add(c);
    }

    // Override method to display teacher's details
    @Override
    public void DisplayDetails() {
        System.out.println("Teacher ID: " + ID);
        System.out.println("Teacher Name: " + name);
        System.out.println("Courses Taught:");
        for (Course course : coursesTaught) {
            course.DisplayCourseDetails();
        }
    }
}

