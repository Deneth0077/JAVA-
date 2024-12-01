package OOP_V_F_2023;

// Concrete class for Course implementation
class ConcreteCourse extends Course {
    // Constructor to initialize course attributes
    public ConcreteCourse(String code, String courseName) {
        super(code, courseName);
    }

    // Override method to display course details
    @Override
    public void DisplayCourseDetails() {
        System.out.println("Course Code: " + code + ", Course Name: " + courseName);
    }
}

