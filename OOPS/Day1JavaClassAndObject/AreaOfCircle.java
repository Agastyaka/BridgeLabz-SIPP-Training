class circle{
        double radius;

        public void displayarea(){

            System.out.println("area of circle"+3.14*radius*radius);
            System.out.println("circle cirumference"+2*3.14*radius);
        }

    }


public class AreaOfCircle {
    
    public static void main(String[] args) {
        circle circle1=new circle();
        circle1.radius=55;
        circle circle2=new circle();
        circle2.radius=33;
        circle1.displayarea();
        circle2.displayarea();
        
    }

    
}