import java.util.HashMap;
import java.util.Scanner;

class Employee {

    // Field declaration

    String name;
    String department;
    double salary;

    // Constructor

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EMPLOYEE NAME : " + name + ", DEPARTMENT : " + department + ", SALARY : " + salary;
    }

}

public class EmployeeManager {

    // Main method

    public static void main(String[] args) {

        // HashMap declaration

        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding employees

        employeeMap.put(101, new Employee("HARISH PALASPAGAR", "HR", 60000));
        employeeMap.put(102, new Employee("JAYWANT MHALA", "IT", 75000));
        employeeMap.put(103, new Employee("RAHUL KUMAR", "FINANCE", 70000));

        // Displaying all employees

        System.out.println("EMPLOYEE LIST :");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID : " + id + ", " + employeeMap.get(id));
        }

        // Retrieving employee details by ID

        System.out.print("ENTER EMPLOYEE ID : ");
        int searchId = scanner.nextInt();
        Employee employee = employeeMap.get(searchId);

        // Displaying employee details if found

        if (employee != null) {
            System.out.println("EMPLOYEE WITH ID " + searchId + ": " + employee);
        } else {
            System.out.println("EMPLOYEE WITH ID " + searchId + " NOT FOUND.");
        }

        scanner.close();
    }
}
