class Student{
    static String universityname;
    static int totalstudent;
    public static void totalstudent(){
        System.out.println("the total student "+totalstudent);
    }
    String name;
    final int rollno;
    String grade;
    Student(String name,String grade,int rollno){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
        totalstudent++;
    }
    public void display(){
        System.out.println("name of student"+name);
        System.out.println("rollno"+rollno);
        System.out.println("grade"+grade);
    }
}
public class UniversityStudentManagement {

    public static void main(String[] args) {
        Student student1=new Student("rahul", "B", 654);
        if(student1 instanceof Student){
            System.out.println("student1 instanceof Student");
            student1.display();
            Student.totalstudent();
        }
        
    }
}