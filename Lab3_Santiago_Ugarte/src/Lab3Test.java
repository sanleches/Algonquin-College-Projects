import java.util.Scanner;

public class Lab3Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the number of employees: ");
        int numEmployees = Integer.parseInt(scanner.nextLine());

        Store store = new Store(numEmployees);
        store.readEmployeeDetails(scanner);

        Store.printTitle(storeName);
        store.printEmployeeDetails();

        scanner.close();
    }
}




