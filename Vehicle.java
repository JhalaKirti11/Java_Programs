class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }

    public void start(){
        System.out.println("Vehicle started");
    }

    public String getBrand(){
        return brand;
    }
}

class Car extends Vehicle{

    public Car(String brand){
        super(brand);
    }
    public void start(){
        System.out.println("Car started");
    }
}

class Bike extends Vehicle{

    public Bike(String brand){
        super(brand);
    }
    public void start(){
        System.out.println("Bike started");
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Vehicle c = new Car("Suzuki");
        System.out.println("Brand of the car is "+c.getBrand());
        c.start();

        Vehicle b = new Bike("Hero");
        System.out.println("Brand of the bike is "+b.getBrand());
        b.start();
    }
}
