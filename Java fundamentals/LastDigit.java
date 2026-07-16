import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first % 10 == second % 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}