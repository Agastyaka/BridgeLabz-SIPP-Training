class Student{
    String name;
    int rollno;
    double marks;
    Student(String name1,int rollno1,double marks1){
       name=name1;
        rollno=rollno1;
        marks=marks1;
    }
    void displayDetails(){
        System.out.println("Name: "+name+"rollno: "+rollno+"marks "+marks);
    }

}
public class DeateilOfStudent{
     public static void main(String[] args){
        Student Student=new Student("Agastya",101,99.5);
        Student.displayDetails();
     }
}