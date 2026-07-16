import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt());

        if (num == 0) {
            System.out.println("Number of Digits = 1");
        } else {

            int count = 0;

            while (num > 0) {
                count++;
                num = num / 10;
            }

            System.out.println("Number of Digits = " + count);
        }

        sc.close();
    }
}