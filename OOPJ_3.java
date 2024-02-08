// A class called Employee, which models an employee with an ID, name and salary, 
// is designed as shown in the following class diagram. 
// The method raiseSalary (percent) increases the salary by the given percentage. 
// Develop the Employee class and suitable main method for demonstration

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
        sc.nextLine();
        System.out.println("Enter Employee name: ");
        name = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextDouble();
        System.out.println("-----------------------------");
        System.out.println();

        Employee e1 = new Employee(id, name, salary);

        System.out.println("Employee Id: " + e1.id + "\nName: " + e1.name + "\nSalary: " + e1.salary);

        System.out.println("\nEnter salary hike: ");
        e1.raiseSalary(sc.nextInt());

        System.out.println("After hike\n");
        System.out.println("Employee Salary: " + e1.salary);

        sc.close();
    }
}