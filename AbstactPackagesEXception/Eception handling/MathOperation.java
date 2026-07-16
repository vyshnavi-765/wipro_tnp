public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                System.out.println("Please enter 5 integers");
                return;
            }

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + (sum / 5.0));

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}