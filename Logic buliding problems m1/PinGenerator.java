import java.util.Scanner;

public class PinGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alpha: ");
        int alpha = sc.nextInt();

        System.out.print("Enter Beta: ");
        int beta = sc.nextInt();

        System.out.print("Enter Gamma: ");
        int gamma = sc.nextInt();

        int pin = (alpha % 10) * 100 + (beta % 10) * 10 + (gamma % 10);

        System.out.println("Generated PIN = " + pin);

        sc.close();
    }
}