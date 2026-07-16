import java.io.*;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void addEmployee(Scanner sc) {
        try {
            FileWriter fw = new FileWriter("employees.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            bw.write(id + "," + name + "," + age + "," + salary);
            bw.newLine();

            bw.close();

            System.out.println("\nEmployee Added Successfully!\n");

        } catch (IOException e) {
            System.out.println("Error while writing file.");
        }
    }

    public static void displayEmployees() {
        try {
            File file = new File("employees.txt");

            if (!file.exists()) {
                System.out.println("No Employee Records Found.\n");
                return;
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\n-----------REPORT-----------");
            System.out.printf("%-8s %-15s %-8s %-10s\n",
                    "ID", "NAME", "AGE", "SALARY");
            System.out.println("---------------------------------------------");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.printf("%-8s %-15s %-8s %-10s\n",
                        data[0], data[1], data[2], data[3]);
            }

            System.out.println("---------------------------------------------");
            System.out.println("---------END OF REPORT---------\n");

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("====== Employee Management System ======");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    System.out.println("Exiting the System...");
                    break;

                default:
                    System.out.println("Invalid Choice!\n");
            }

        } while (choice != 3);

        sc.close();
    }
}