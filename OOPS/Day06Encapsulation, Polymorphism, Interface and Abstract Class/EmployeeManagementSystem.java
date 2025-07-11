abstract class Employe{
    private int employeid;
    private String name;
    private double basesalary;
    Employe(int employeid,String name,double base){
        this.basesalary=base;
        this.name=name;
        this.employeid=employeid;
    }
    int getemployedid(){
        return employeid;
    }
void employeif(int employeed){
    employeid=employeed;
}
String getname(){
    return name;
}
void setname(String name){
    this.name=name;
}
double getbasesalary(){
    return basesalary;
}
void setbasesalary(double basesalaryy){
    basesalary=basesalaryy;
}

    abstract double calculatesalary();
    void display(){
        System.out.println("employe id"+employeid);
        System.out.println("name of employe"+name);
        System.out.println("base salary of employe"+basesalary);
    }


 }
 interface Department{
    void assigndepartment(String depart);
    void deptdetail(String department);

 }
 class Fulltime extends Employe implements Department{
    private String department;
    Fulltime(int employeid,String name,double bas){
        super(employeid, name, bas);

    }
    double calculatesalary(){
        return getbasesalary();
    }
    void assidepartment(String deptname){
        department=deptname;
    }
    String deptdetail(){
        return "department :"+ department;
    }
    void displaydetail(){
        super.display();
        System.out.println("total salary"+getbasesalary());
        System.out.println(deptdetail());

    }

 }
 
