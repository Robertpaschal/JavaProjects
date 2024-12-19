// Base Class
class Car {
   private String make;
   private String model;
   private int year;

   // Constructor
   public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
   }

   // Getters and Setters
   public String getMake() {
    return make;
   }

   public void setMake(String make) {
    this.make = make;
   }

   public void setModel(String model) {
    this.model = model;
   }

   public int getYear() {
    return year;
   }

   public void setYear(int year) {
    this.year = year;
   }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

// Derived Class
class ElectricCar extends Car {
    private int batteryLife;

    public ElectricCar(String make, String model, int year, int batteryLife) {
        super(make, model, year);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create an object using constructor
        ElectricCar tesla = new ElectricCar("Tesla", "model S", 2018, 24);
        tesla.displayDetails();
    }
}
