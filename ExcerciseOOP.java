class Car {
    private String brand; // private: Only this class can access this variable
    private int speed;
    private String model;

    // Default constructor because Car c = new Car(); can crash
    Car() {
        this.brand = "Unknown";
        this.speed = 0;
        this.model = "Unknown";
    }

    /*OR
    Car() {
        this("Unknown", 0, "Unknown");
    }
     */

    // Full Constructor
    Car(String brand, int speed, String model) {
        this.brand = brand;
        this.speed = speed;
        this.model = model;
    }

    // Partial constructor
    Car(String brand) {
        this.brand = brand;
        this.speed = 100; // default speed
        this.model = "Standard";
    }

    /* OR
    Car(String brand) {
        this(brand, 100, "Standard");
    }*/

    void drive() {
        System.out.println(brand + " " + model + " is driving at " + speed + " km/h");
    }

    void showDetails() {
        System.out.println(brand + " " + model + " | Speed: " + speed + " km/h");
    }
}

public class ExcerciseOOP {
    public static void main(String[] args) {
        Car bmwM4 = new Car("BMW", 270, "M4");
        Car audiA3 = new Car("Audi", 220, "A3");
        Car c = new Car();
        Car d = new Car("Mercedes");

        bmwM4.showDetails();
        bmwM4.drive();

        audiA3.showDetails();
        audiA3.drive();

        c.showDetails();
        d.showDetails();
    }
;}
