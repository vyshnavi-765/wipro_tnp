import java.util.Scanner;

public class OddDigitSumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 != 0)
                sum = sum + digit;

            num = num / 10;
        }

        System.out.println("Sum of Odd Digits = " + sum);

        sc.close();
    }
}