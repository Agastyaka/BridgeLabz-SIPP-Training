 class CircleClass{
    double radius;
    CircleClass(){
        radius=3;
    }
    public void display(){
        System.out.println("radius is"+radius);
    }

}
public class Circle {

    public static void main(String[] args) {
        CircleClass radius1=new CircleClass();
        radius1.display();
        CircleClass radius2= new CircleClass();
        radius2.radius=4;
        radius2.display();
    }
}