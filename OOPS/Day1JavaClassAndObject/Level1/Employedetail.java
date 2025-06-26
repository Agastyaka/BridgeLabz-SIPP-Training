class employe{
    String name;
    int id;
    double Salary;
    employe(String nam,int idd,double salar){
        name=nam;
        id=idd;
        Salary=salar;
    }
    public void displaydetails(){
        System.out.println("employ name: "+name);
        System.out.println("employ id: "+id);
        System.out.println("employ salary:"+Salary);
        System.out.println("----------------------");
    }
}

public class Employedetail {
    public static void main(String[] args) {
     employe detail= new employe("Aman", 229, 20000);
    employe detail2=new employe("Avinash",123 , 250000);
    detail.displaydetails();
    detail2.displaydetails();
    }
    
}