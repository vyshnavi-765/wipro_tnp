import java.util.Scanner;

public class AlternateMerge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        String result = "";

        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            result += s1.charAt(i);
            result += s2.charAt(i);
        }

        result += s1.substring(min);
        result += s2.substring(min);

        System.out.println("Result: " + result);

        sc.close();
    }
}