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

        //System.out.println(ug.name + " GPA: " + ug.getGPA());
        //System.out.println(pg.name + " GPA: " + pg.getGPA());
        Undergraduate[] ugs=new Undergraduate[3];
        ugs[0]=new Undergraduate("rahul");
        ugs[1]=new Undergraduate("ranam");
        ugs[2]=new Undergraduate("pryan");
        faculty.assignGrade(ugs[0], "A");
        faculty.assignGrade(ugs[1], "B");
        faculty.assignGrade(ugs[2], "C");
        for (int i = 0; i < ugs.length - 1; i++) {
    for (int j = 0; j < ugs.length - i - 1; j++) {
        if (ugs[j].getGPA() > ugs[j+1].getGPA()) {
            
            Undergraduate temp = ugs[j];
            ugs[j] = ugs[j+1];
            ugs[j+1] = temp;
        }
    }
}

         for (int i=0;i<=ugs.length-1;i++) {
            System.out.println(ugs[i].name + " GPA: " + ugs[i].getGPA());
        }

        
        
    }
}
