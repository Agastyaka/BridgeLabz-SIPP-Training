class person{
    String name;
    int age;
    person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name"+name);
        System.out.println("age "+age);
    }
}
class Teacher extends person{
    String subject;
    Teacher(String name,int age,String subject){
        super(name, age);
        this.subject=subject;
    }
    void display(){
        System.out.println("teacher");
        super.display();
        System.out.println("subject teaches"+subject);
    }
}
class Student extends person{
    String grade;
    Student(String name,int age,String grade){
        super(name, age);
        this.grade=grade;
    }
    void display(){
        System.out.println("student");
        super.display();
        System.out.println("grade of student"+grade);

    }
}
class Staff extends person{
    String department;
    Staff(String name,int age,String department){
        super(name, age);
        this.department=department;
    }
    void display(){
        System.out.println("Staff");
        super.display();
        System.out.println("staff department"+department);
    }

}

public class SchoolSystem {

    public static void main(String[] args) {
        Teacher t1=new Teacher("gfads", 20, "chemistry");
        Student s1=new Student("sadjf", 22, "A");
        Staff S1=new Staff("sadf", 23,"cs");
        t1.display();
        s1.display();
        S1.display();
        
    }
}