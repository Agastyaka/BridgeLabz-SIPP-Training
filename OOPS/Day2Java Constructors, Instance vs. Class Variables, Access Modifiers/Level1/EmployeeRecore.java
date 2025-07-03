class Emplaye{
   public int Employeid;
   protected String departemene;
   private double Salary;
   Emplaye(int employeid,String deprtment,double salary){
    Employeid=employeid;
    departemene=deprtment;
    Salary=salary;
   }
  public double newsalary(double lary){
    Salary=lary;
    return Salary;
  }

   public void display(){
    System.out.println("employe id"+Employeid);
    System.out.println("department"+departemene);
    System.out.println("enter salary"+Salary);
   }

}
class Manager extends Emplaye{
     Manager(int employeid, String department, double salary){
        super(employeid, department, salary);
     }
    void showdetail(){
        System.out.println("employe id"+Employeid);
        System.out.println("department"+departemene);
    }


}

public class EmployeeRecore {

    public static void main(String[] args) {
        Emplaye employe1=new Emplaye(23423, "it", 2345);
        employe1.display();
        employe1.newsalary(5432);
        employe1.display();
        Manager manager1=new Manager(6543221, "cs", 65432);
        manager1.showdetail();
        
    }
}