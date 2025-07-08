class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
    }
    void display(){
        System.out.println("employee naem"+name);
        System.out.println("employee id"+id);
        System.out.println("employee salary"+salary);
    }
}
class Manager extends Employee {
    int teamsize;
    Manager(String name,int id,double salary,int teamsize){
        super(name,id,salary);
        this.teamsize=teamsize;
    }
    void display(){
        super.display();
        System.out.println("team szie is"+teamsize);
    }
}
class Developer extends Employee{
    String programminglangugae;
    Developer(String name,int id,double salary,String programminglang){
        super(name, id, salary);
        this.programminglangugae=programminglang;
    }
    void display(){
        super.display();
        System.out.println("programming lang use"+programminglangugae);
    }
}
class Intern extends Employee{
    int durationinmonth;
    Intern(String name,int id,double salary,int durationinmonth){
        super(name, id, salary);
        this.durationinmonth=durationinmonth;
    }
    @Override
    void display(){
        super.display();
        System.out.println("douration of internsihip"+durationinmonth);
    }

}
public class EmployeeManagement {

    public static void main(String[] args) {
        Manager m1=new Manager("acli", 654, 65432, 4);
        m1.display();
        Developer dev1=new Developer("rachi", 5430, 54320, "cpp");
        dev1.display();
        Intern i1=new Intern("asdf", 4,54765, 4);
        i1.display();
    }
}
