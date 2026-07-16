interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}

interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        Vehicle.super.message(); // Calls Vehicle's default method
    }
}

public class TestCar {

    public static void main(String[] args) {

        Car c = new Car();
        c.message();
    }
}