import java.util.Scanner;

public class EvenOddCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.println("Enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {

            int num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);

        sc.close();
    }
}