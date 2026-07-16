import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.nextLine();

                int sum = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter Mark " + j + ":");

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new InvalidMarksException("Negative Marks");

                    if (mark > 100)
                        throw new InvalidMarksException("Marks Out of Range");

                    sum += mark;
                }

                System.out.println(name + " Average = " + (sum / 3.0));
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}