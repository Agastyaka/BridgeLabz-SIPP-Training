    class MyClass {
    static void greet() {
        System.out.println("Hello from static method!");
    }
    void sayNonStatic() {
        System.out.println("This is a non-static method");
    }
}

public class Newclass {

    public static void main(String[] args) {
        MyClass.greet();
        MyClass c=new MyClass();
        c.sayNonStatic();
        
    }
}