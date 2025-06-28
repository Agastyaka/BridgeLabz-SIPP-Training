class PersonAttributes{
    String name;
    int age;
    double height;
    PersonAttributes(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;  
    }
    PersonAttributes(PersonAttributes copy){
        this.name=copy.name;
        this.age=copy.age;
        this.height=copy.height;
    }
    public void display(){
        System.out.println("Name of person"+name);
        System.out.println("age of person"+age);
        System.out.println("height of person"+height);

    }
}
public class Person {
    public static void main(String[] args) {
        PersonAttributes person1=new PersonAttributes("RAhul", 20, 170);
        person1.display();
        PersonAttributes person2=new PersonAttributes(person1);
        person2.display();
    }

    
}