class Student{
    public int rollno;
    protected String Name;
    private double cgpa;
    Student(int rollno,String Name,double cgpa){
        this.rollno=rollno;
        this.Name=Name;
        this.cgpa =cgpa;
    }
    public void display(){
        System.out.println("roll no of student"+rollno);
        System.out.println("name of student"+Name);
        System.out.println("cgpa of student "+cgpa);
    }
    public double accessAndDisplayCgpa(double newcgpa){
        cgpa =newcgpa;
        return cgpa;
    }
}
class postgraduate extends Student{
     postgraduate(int rollno, String Name, double cgpa) {
        super(rollno, Name, cgpa);
    }

}


public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1=new Student(2215000, "rohna", 7.9);
        student1.display();
        student1.accessAndDisplayCgpa(8.8);
        student1.display();
        postgraduate student2=new postgraduate(2254, "rugh", 8.8);
        student2.display();
        

    }

    
}