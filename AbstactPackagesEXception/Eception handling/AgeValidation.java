class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class AgeValidation {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                System.out.println("Please enter Name and Age");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be >=18 and <60");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Registration Successful");

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Age");
        }
    }
}