import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(int per) {
        salary += salary * per / 100;
    }
}

public class OOPJ_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double salary;

        System.out.println("Enter Employee Id: ");
        id = sc.nextInt();
        System.out.println("Enter Employee name: ");
        name = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextDouble();

        Employee e1 = new Employee(id, name, salary);

        System.out.println("Employee Id: " + e1.id + " Name: " + e1.name + " Salary: " + e1.salary);

        e1.raiseSalary(5);

        System.out.println("After hike: ");
        System.out.println("Employee Salary: " + e1.salary);
    }
}