
class Animal {
    String name; // variables.

    // Constructor for the parent class
    public Animal(String name) {
        this.name = name; // animal->name = "generic name"
    }

    // Method to display information about the animal
    public void display() {
        System.out.println("I am an animal. My name is " + name);
    }


    public void newname(String name)
    {
        this.name=name;
    }

    // Method that can be overridden by the child class
    public void sound() {
        System.out.println("Animals make sounds.");
    }
}





// Child Class
class Dog extends Animal {
    int NumberOfLeg;

    // Constructor for the child class
    public Dog(String name,int NumberOfLeg) {
        super(name); // Call the parent class constructor
        this.NumberOfLeg=NumberOfLeg; // 
    }

    public void movement()
    {
        System.out.println("running");
    }

    // Method overriding: Providing specific implementation for Dog
    // @Override
    // public void sound() {
    //     System.out.println(name + " says Woof Woof!");
    // }
}

// Another Child Class
class Cat extends Animal {
    
    String Habit;
    String color;
    // Constructor for the child class
    public Cat(String name,String Habit) {  
        super(name); // Call the parent class constructor
        this.Habit=Habit;
        this.color="black";
    }

    // Method overriding: Providing specific implementation for Cat
    @Override
    public void sound() {
        System.out.println(name + " says Meow!");
    }
}

// Main Class to Test
public class child_and_parent_classes {
    public static void main(String[] args) {
        // Create an Animal object
        // Animal animal = new Animal("Generic Animal");
        // animal.display();
        // animal.newname("Camel");
        // animal.display();
        // animal.sound();
        // animal.name
        

        // animal.sound

        // Dog dog = new Dog("rokky",4);
        // System.out.println( dog.name);
        // System.out.println(dog.NumberOfLeg);
        // dog.display(); // method from parent class
        // dog.sound(); // call for method from child class 
        // dog.movement();  // call for movement method in dog class.



        Dog dog2= new Dog("teddy",4);
        System.out.println("Name :"+dog2.name + " legs :" +dog2.NumberOfLeg);
        dog2.newname("tiger");
        dog2.name="new_name";
        dog2.display();
        dog2.sound();












        // animal.display();
        // animal.sound();

        // // Create a Dog object
        // Dog dog = new Dog("Buddy");
        // dog.display();
        // dog.sound();

        // // Create a Cat object
        // Cat cat = new Cat("Kitty");
        // cat.display();
        // cat.sound();
    }
}
