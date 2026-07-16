import java.util.Random;

abstract class Compartment {
    abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class: Luxury coach. Please maintain silence.";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment: Reserved only for women.";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment: Please travel with a valid ticket.";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment: Goods only. Passengers are not allowed.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] arr = new Compartment[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {

            int choice = rand.nextInt(4) + 1;

            if (choice == 1)
                arr[i] = new FirstClass();
            else if (choice == 2)
                arr[i] = new Ladies();
            else if (choice == 3)
                arr[i] = new General();
            else
                arr[i] = new Luggage();

            System.out.println("Compartment " + (i + 1));
            System.out.println(arr[i].notice());
            System.out.println();
        }
    }
}