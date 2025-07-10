public class UniversitySystem {
    public static void main(String[] args) {
        
        Course course = new Course("Data Structures");

        Undergraduate ug = new Undergraduate("Raman");
        Postgraduate pg = new Postgraduate("Ana");

        ug.enroll(course);
        pg.enroll(course);

        Faculty faculty = new Faculty();

        faculty.assignGrade(ug, "A");
        faculty.assignGrade(pg, "B");

        course.displaycourse();

        System.out.println(ug.name + " GPA: " + ug.getGPA());
        System.out.println(pg.name + " GPA: " + pg.getGPA());
    }
}
