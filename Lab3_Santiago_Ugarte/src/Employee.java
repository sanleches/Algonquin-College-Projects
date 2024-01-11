import java.util.Scanner;

class Employee {
    private int employeeNumber;
    private Person emp;
    private double numHours;
    private double hourlyPay;
 
    public Employee() {
    	this.employeeNumber = -1;
        this.emp = null;
        this.numHours = -1;
        this.hourlyPay = -1;
    }

    public Employee(int employeeNumber, Person emp, double numHours, double hourlyPay) {
        this.employeeNumber = employeeNumber;
        this.emp = emp;
        this.numHours = numHours;
        this.hourlyPay = hourlyPay;
    }

    public void readEmployee(Scanner scanner) {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter phone number: ");
        long phoneNumber = Long.parseLong(scanner.nextLine());
        
        emp = new Person(firstName, lastName, email, phoneNumber);
        
        System.out.print("Enter employee number: ");
        employeeNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number of hours worked: ");
        numHours = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter hourly pay: ");
        hourlyPay = Double.parseDouble(scanner.nextLine());
    }

    public void printEmployee() {
    	
    	double salary = numHours * hourlyPay;
    	System.out.printf("%20s | %20s | %20s | %20s | %20s \n","Name","Employee Number","Email","Phone Number","salary");
    	System.out.println("================================================================================================================");
    	System.out.printf("%20s | %20s | %20s | %20d | %20f ",emp.getName(),employeeNumber,emp.getEmail(),emp.getPhoneNumber(),salary);
  
    }
}