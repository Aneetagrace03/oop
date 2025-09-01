import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    float salary;

    Employee(int id, String name, float sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

 
    void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            float sal = sc.nextFloat();
            emp[i] = new Employee(id, name, sal);
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : emp) {
            e.displayEmployee();
        }

       
    }
}
