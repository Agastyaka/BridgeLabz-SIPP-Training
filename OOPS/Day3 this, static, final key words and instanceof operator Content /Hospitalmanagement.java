class hospital{
    static String Hospitalname="JB hospital";
    static int totalcountofpatient;
    public static void countppl(){
        System.out.println("total patient"+totalcountofpatient);

    }
    String patentname;
    int age;
    String illness;
    final int patientid;
    hospital(String patname,int age,String illness,int id){
        this.patentname=patname;
        this.age=age;
        this.illness=illness;
        this.patientid=id;
        totalcountofpatient++;
    }
    void display(){
        System.out.println("patient name"+patentname);
        System.out.println("patient id"+patientid);
        System.out.println("pateent illness"+illness);
        System.out.println("patient age"+age);
        
    }
}

public class Hospitalmanagement {
    public static void main(String[] args) {
        hospital patient1=new hospital("tehs", 22, "pain in stot", 5678);
        if(patient1 instanceof hospital){
            patient1.display();
        }
        hospital patient2=new hospital("dsjhfga", 77, "weakness", 6789);
        patient2.display();
        hospital.countppl();
    }

    
}