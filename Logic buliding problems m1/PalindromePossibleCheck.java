import java.util.Scanner;

public class PalindromePossibleCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        int[] count = new int[10];

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            count[digit]++;
        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (count[i] % 2 != 0)
                oddCount++;
        }

        if (oddCount <= 1)
            System.out.println("Palindrome Possible");
        else
            System.out.println("Palindrome Not Possible");

        sc.close();
    }
}