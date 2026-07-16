interface Test {

    int myFunction(int a, int b, int c);
}

public class LambdaDemo {

    public static void main(String[] args) {

        // Addition
        Test t1 = (a, b, c) -> a + b + c;

        // Multiplication
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(2, 3, 4));
        System.out.println("Multiplication = " + t2.myFunction(2, 3, 4));
    }
}