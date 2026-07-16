import java.util.Scanner;

public class RemoveStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        int index = str.indexOf('*');

        if (index != -1) {
            String left = str.substring(0, Math.max(0, index - 1));
            String right = "";

            if (index + 2 < str.length())
                right = str.substring(index + 2);

            System.out.println(left + right);
        } else {
            System.out.println(str);
        }

        sc.close();
    }
}