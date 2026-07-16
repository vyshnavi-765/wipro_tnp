import java.util.Scanner;

public class LastDigitSum {

    static int addLastDigits(int input1, int input2) {

        int last1 = Math.abs(input1 % 10);
        int last2 = Math.abs(input2 % 10);

        return last1 + last2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int input2 = sc.nextInt();

        System.out.println("Sum = " + addLastDigits(input1, input2));

        sc.close();
    }
}