class Car {
    // Attributes
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

}
   public class Mar{
    
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Tesla", 200);
        myCar.displayDetails();  // Output: Brand: Tesla, Speed: 200 km/h
    }
}
