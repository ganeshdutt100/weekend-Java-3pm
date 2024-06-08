package intro.oops;
class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand = brand ;
    }
    void start() {
        System.out.println("Starting the " + brand + " vehicle.");
    }
    void stop() {
        System.out.println("Stopping the " + brand + " vehicle.");
    }

}


class Car extends Vehicle{
    int numDoors;
    Car(String brand , int numDoors){
        super(brand);
        this.numDoors = numDoors;
    }
    void honk(int shivang) {
        System.out.println("Honking the horn of the " + brand + " car." + shivang);
    }
}

class motorcycle extends Vehicle{
    motorcycle(String brand){
        super(brand);
    }
    void wheelie() {
        System.out.println("Performing a wheelie on the " + brand + "motorcycle.");
    }
    }

public class class2 {
    public static void main(String[] args) {
        Car car = new Car("Honda",6 );
        motorcycle motor = new motorcycle("Hero ");
        car.honk(3);
        car.start();
        car.stop();


        motor.start();
        motor.stop();
        motor.wheelie();
    }
}
