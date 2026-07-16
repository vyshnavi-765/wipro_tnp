import java.util.Scanner;

public class FibonacciSeriesNth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int first = 0, second = 1, next = 0;

        if (n == 1)
            System.out.println("Nth Fibonacci = 0");
        else if (n == 2)
            System.out.println("Nth Fibonacci = 1");
        else {
            for (int i = 3; i <= n; i++) {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.println("Nth Fibonacci = " + next);
        }

        sc.close();
    }
}