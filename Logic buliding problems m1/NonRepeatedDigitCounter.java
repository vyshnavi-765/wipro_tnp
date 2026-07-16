import java.util.Scanner;

public class NonRepeatedDigitCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        int[] count = new int[10];

        while (num > 0) {
            int digit = num % 10;
            count[digit]++;
            num = num / 10;
        }

        int nonRepeated = 0;

        for (int i = 0; i < 10; i++) {
            if (count[i] == 1)
                nonRepeated++;
        }

        System.out.println("Non-Repeated Digits Count = " + nonRepeated);

        sc.close();
    }
}