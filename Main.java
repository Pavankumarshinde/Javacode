
// Create a program to model a "Vehicle" system using parent and child classes in Java.

// Define a parent class Vehicle with the following properties and methods:

// brand (String): Represents the brand of the vehicle.
// speed (int): Represents the speed of the vehicle.
// Constructor to initialize the brand and speed.
// A method displayInfo() to display the brand and speed of the vehicle.
// A method move() that prints a generic message, "The vehicle is moving."
class Vehicle{
    String brand;
    int speed;

    public Vehicle(String brand, int speed)
    {
        this.brand=brand;
        this.speed=speed;
    }
    // A method displayInfo() to display the brand and speed of the vehicle.
    public void displayInfo()
    {
        System.out.println("brand of vehicle :"+ this.brand + " Speed " + this.speed);
    }
    // A method move() that prints a generic message, "The vehicle is moving."
    public void move()
    {
        System.out.println("The vehicle is moving");
    }
}


// Define two child classes:

// Car:
// Adds a property fuelType (String) (e.g., "Petrol" or "Diesel").
// Overrides the move() method to print "The car is driving."

class Car extends Vehicle{
    String fuelType;
    public Car(String fuelType,String brand, int speed)
    {
        super(brand,speed);
        this.fuelType=fuelType;

    }

    public void move()
    {
        System.out.println("The car is driving.");

    }
}
// Bike:
// Adds a property type (String) (e.g., "Mountain Bike" or "Sports Bike").
// Overrides the move() method to print "The bike is riding."
class Bike extends Vehicle{
    String type;
    public Bike(String type, String brand, int speed)
    {
        super(brand, speed);
        this.type=type;
    }
    
    public void move()
    {
        System.out.println("The bike is riding.");
    }

}

// In the main class:

// Create objects for Car and Bike.
// Call their displayInfo() and move() methods.
public class Main{
    public static void main(String[] args) {
        Car car= new Car("diesel", "BMW", 60);
        Bike bike= new Bike("mountain bike", "xyz",80);
        car.displayInfo();
        car.move();
        bike.displayInfo();
        bike.move();
    }
}
