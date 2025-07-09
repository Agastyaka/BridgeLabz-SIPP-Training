class Course{
    String coursenaem;
    int duration;
    Course(String coursename,int duration){
        this.coursenaem=coursename;
        this.duration=duration;
    }
    void display(){
        System.out.println("course anem"+coursenaem);
        System.out.println("course duration"+duration);
    }
}
class Onlinecoures extends Course{
    String plateform;
    boolean isrecorded;
    Onlinecoures(String coursename,int duration,String plateform,boolean isrecorded){
        super(coursename, duration);
        this.plateform=plateform;
        this.isrecorded=isrecorded;

    }
    void display(){
        super.display();
        System.out.println("plateform name"+plateform);
        System.out.println("is recorded"+(isrecorded ? "no":"yes"));
    }
}
class PaidOnline extends Onlinecoures{
    double fee;
    double discount;
    PaidOnline(String coursename,int duration,String plateform,boolean isrecorded,double fee,double discount){
        super(coursename, duration, plateform, isrecorded);
        this.fee=fee;
        this.discount=discount;
    }
    void display(){
        super.display();
        System.out.println("fee of course"+fee);
        System.out.println("discournt on course"+discount);
        System.out.println("final price"+(fee -(fee*discount/100)));
    }

}
public class EducationalCourse {

    public static void main(String[] args) {
        Course c1=new Course("java", 3);
        c1.display();
        Onlinecoures o1=new Onlinecoures("data structure", 3, "youtube", true);
        o1.display();
        PaidOnline p1=new PaidOnline("dsa", 3, "udemy", false, 334, 23);
        p1.display();
    }
}