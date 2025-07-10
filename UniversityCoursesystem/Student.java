public class Student {
    String name;
    Course course;
    private String grade; 
    private double gpa;

    Student(String name) {
        this.name = name;
    }
  
    void enroll(Course c) {
        this.course = c;
    }

    void setGrade(String grade) {
        this.grade = grade;
        calculateGPA();
    }

    double getGPA() {
        return gpa;
    }

    private void calculateGPA() {
        if (grade.equals("A")) 
        gpa = 4.0;
        else if (grade.equals("B")) 
        gpa = 3.0;
        else if (grade.equals("C")) 
        gpa = 2.0;
        else 
        gpa = 0.0;
    }
}
