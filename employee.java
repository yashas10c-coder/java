package train;

import java.util.Scanner;

class employee {
    int id;
    String name;
    String designation;
    double salary;

    // Create employee
    void createEmployee(Scanner sc) {
    	System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter  Age: ");
        id = sc.nextInt();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();

        System.out.println("\nEmployee created successfully!");
        
    }
   
public class BankEmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        employee employee = new employee();

        int choice;
        boolean created = false;

        do {
            System.out.println("\n================================");
            System.out.println(" BANK EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Rise Salary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    employee.createEmployee(sc);
                    created = true;
                    char choie = sc.next().charAt(0);
                    sc.nextLine();

                    if (choie == 'Y' || choie == 'y') {
                        System.out.println("\nPlease enter the details again.\n");
                    }
                    else if (choie == 'N' || choie == 'n') {
                        System.out.println("\nAccount created successfully!");
                        break;
                    }
                    break;

                case 2:
                    if (created) {
                    	System.out.println("Display - Coming soon");
                    } else {
                        System.out.println("Please create an employee first!");
                    }
                    break;

                case 3:
                    if (created) {
                    	System.out.println("Withdraw/Deposit - Coming soon");
                    } else {
                        System.out.println("Please create an employee first!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Bank Employee Management System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
}