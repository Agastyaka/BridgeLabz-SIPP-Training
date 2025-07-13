import java.util.*;
abstract class Empploye{
    private int employeid;
    private String name;
    private double basesalary;
    Empploye(int employeid,String name,double salary){
        this.employeid=employeid;
        this.basesalary=salary;
        this.name=name;
    }
    int getemployeid(){
        return employeid;
    }
    public void setEmployeid(int employeid){
        this.employeid=employeid;
    }
    String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public double getbasesalray(){
        return basesalary;
    }
    public void setbasesalary(double salary){
        this.basesalary=salary;
    }
    public abstract double calculateSalary();
    public void display(){
        System.out.println("id"+employeid);
        System.out.println("name"+name);
        System.out.println("base salary"+basesalary);
    }


}
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetatils();
}
class FullTImeEmploye extends Empploye implements Department{
    private double bonus;
    private String department;
    public FullTImeEmploye(int employeid,String name,double basesalary,double bonus){
        super(employeid, name, basesalary);
        this.bonus=bonus;
    }
    double getbonus(){
        return bonus;
    }
    void setbonus(double bonus){
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary(){
        return getbasesalray()+bonus;
    }
    @Override
    public void assignDepartment(String depname){
        this.department=depname;
    }
    @Override
    public String  getDepartmentDetatils(){
        return "depatment"+department;
    }
    public void display(){
        super.display();
        System.out.println("banus"+bonus);
        System.out.println("total salary"+calculateSalary());
        System.out.println(getDepartmentDetatils());
    }
}
class PartTime extends Empploye implements Department{
    private int workhours;
    private double hourlyRate;
    private String department;
    public PartTime(int employeid,String name,double hourlyRate,int workhours){
        super(employeid, name,0);
        this.hourlyRate=hourlyRate;
        this.workhours=workhours;
    }
    public int getworkhour(){
        return workhours;
    }
    public void setworkhour(int workhour){
        this.workhours=workhour;
    }
    public double gethourlyrate(){
        return hourlyRate;
    }
    public void sethourlyrate(double hourlyRate){
        this.hourlyRate=hourlyRate;
    }
    @Override
    public double calculateSalary(){
        return hourlyRate*workhours;
    }
    @Override
    public void assignDepartment(String departname){
        this.department=departname;
    }
    @Override
    public String  getDepartmentDetatils(){
        return "department"+department;
    }
    public void display(){
        super.display();
        System.out.println("hourly rate"+hourlyRate);
        System.out.println("work hour"+workhours);
        System.out.println("total salary"+calculateSalary());
        System.out.println(getDepartmentDetatils());

    }

}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        List<Empploye> empployes=new ArrayList<>();
        FullTImeEmploye fte=new FullTImeEmploye(123, "aman", 2323, 1234);
        fte.assignDepartment("It");
        PartTime pte=new PartTime(1234, "askdfn", 123, 10);
        pte.assignDepartment("Suport");
        empployes.add(fte);
        empployes.add(pte);
        for(int i=0;i<empployes.size();i++){
            empployes.get(i).display();
        }

        
    }
}
