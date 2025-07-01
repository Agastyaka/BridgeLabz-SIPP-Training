class Course{
    String coursename;
    int durationinmonth;
    double fee;
    static String instituteName;
    Course(String course,int duration,double fe){
        coursename=course;
        durationinmonth=duration;
        fee=fe;
        instituteName="Udemy";

    }

    public static String updateInstitutename(String newname){
        instituteName=newname;
        return instituteName;
        

    }
    public void dispaly(){
        System.out.println("course name"+coursename);
        System.out.println("course duration in month"+durationinmonth);
        System.out.println("course fee "+fee);
        System.out.println("institute name"+instituteName);
    }


}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1=new Course("dsa", 2, 2345);
        course1.dispaly();
        Course.updateInstitutename("Blab");
        course1.dispaly();

        
    }
    

    
}