import java.util.Scanner;

public class FrequentDigitFinder {

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

        int max = 0;
        int digit = 0;

        for (int i = 0; i < 10; i++) {
            if (count[i] > max) {
                max = count[i];
                digit = i;
            }
        }

        System.out.println("Most Frequent Digit = " + digit);

        sc.close();
    }
}