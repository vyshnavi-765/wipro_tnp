import java.util.Scanner;

public class UniqueDigitCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        boolean[] digits = new boolean[10];

        while (num > 0) {
            int digit = num % 10;
            digits[digit] = true;
            num = num / 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (digits[i])
                count++;
        }

        System.out.println("Unique Digits Count = " + count);

        sc.close();
    }
}