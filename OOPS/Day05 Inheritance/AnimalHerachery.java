class Animal{
    String name;
    int age;
    public Animal(String naem,int age){
        this.name=naem;
        this.age=age;
    }
    void MakeSound(){
        System.out.println("animal sound");
    }

}
class Dog extends Animal{
    
    Dog(String name,int age){
        super(name,age);
        
    }
    void MakeSound(){
        System.out.println("dog barks");
    }

}
class Cat extends Animal{
    Cat(String name,int age){
        super(name, age);

    }
    void MakeSound(){
        System.out.println("cat mew");
    }

}
class Bird extends Animal{
    Bird(String name,int age){
        super(name, age);
    }
    @Override
    void MakeSound(){
        System.out.println("bird chirp");
    }

}
public class AnimalHerachery {

    public static void main(String[] args) {
        Animal bird=new Bird("parrot", 3);
    Dog dog=new Dog("pit", 5);
    Animal cat=new Cat("tew", 6);
    bird.MakeSound();
    dog.MakeSound();
    cat.MakeSound();
    }
}