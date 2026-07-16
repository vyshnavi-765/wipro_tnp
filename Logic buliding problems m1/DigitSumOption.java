import java.util.Scanner;

public class DigitSumOption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        System.out.print("Enter E for Even or O for Odd: ");
        char choice = sc.next().charAt(0);

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            if ((choice == 'E' || choice == 'e') && digit % 2 == 0)
                sum += digit;

            if ((choice == 'O' || choice == 'o') && digit % 2 != 0)
                sum += digit;

            num = num / 10;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}