// Inheritance....
public class Vehicle {
    String brand = "TVS";
}

class Bike extends Vehicle {
    String model = "Wego";

    public static void main(String[] args) {
        Bike my_bike = new Bike();
        System.out.println(my_bike.brand + "-" + my_bike.model);
    }
}