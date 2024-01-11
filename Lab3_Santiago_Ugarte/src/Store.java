import java.util.Scanner;

class Store {
    private Employee[] employees;

    public Store(int numEmployees) {
        employees = new Employee[numEmployees];
    }

    public void readEmployeeDetails(Scanner scanner) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            Employee employee = new Employee();
            employee.readEmployee(scanner);
            employees[i] = employee;
        }
    }

    public void printEmployeeDetails() {
        for (int i = 0; i < employees.length; i++) {
            employees[i].printEmployee();
            System.out.println();
        }
    }

    public static void printLine() {
        System.out.println("================================================================================================================");
    }

    public static void printTitle(String storeName) {
    	System.out.println();
        printLine();
        System.out.printf("%55s \n", storeName);
        printLine();
    }
}