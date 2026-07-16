import java.util.Scanner;

public class StringWeightCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int weight = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                weight = weight + (ch - 'a' + 1);
            }
        }

        System.out.println("Weight of String = " + weight);

        sc.close();
    }
}