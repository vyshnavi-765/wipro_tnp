import java.util.Scanner;

public class PrimeRangeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int count = 0;

        for (int n = start; n <= end; n++) {

            if (n <= 1)
                continue;

            boolean prime = true;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                count++;
        }

        System.out.println("Number of Prime Numbers = " + count);

        sc.close();
    }
}

 