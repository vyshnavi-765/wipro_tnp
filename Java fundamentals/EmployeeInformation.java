import java.util.Scanner;

public class EmployeeInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String empName = sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        System.out.println("Enter Designation:");
        String designation = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("\n------ Employee Details ------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department    : " + department);
        System.out.println("Designation   : " + designation);
        System.out.println("Salary        : " + salary);

        sc.close();
    }
}