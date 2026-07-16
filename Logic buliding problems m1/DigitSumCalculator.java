import java.util.Scanner;

public class DigitSumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("Sum of Digits = " + sum);

        sc.close();
    }
}