class employee{
    static String Companyname="Nvidea";
    static int totalemployee;
    String name;
   final int id;
    String degination;
    employee(String name,int id,String degination){
        this.name=name;
        this.id=id;
        this.degination=degination;
        totalemployee++;
    }
    public void totalnoofemploye(){
        System.out.println("total emplooye"+totalemployee);
    }
    public void display(){
        System.out.println("companyname"+Companyname);
        System.out.println("name of employe");
        System.out.println("id of employe"+id);
        System.out.println("degination of employe"+degination);
    }


}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        employee employee1=new employee("rahul", 543, "manager");
        if(employee1 instanceof employee){
            employee1.display();
        }
        
    }
    
    

    
}