public class Calculator {

    // Method to calculate integer power
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Method to calculate double power
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Power Int = " + powerInt(2, 5));
        System.out.println("Power Double = " + powerDouble(2.5, 3));
    }
}