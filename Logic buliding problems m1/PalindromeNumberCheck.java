import java.util.Scanner;

public class PalindromeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = Math.abs(num);
        int temp = original;
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }

        if (original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

        sc.close();
    }
}