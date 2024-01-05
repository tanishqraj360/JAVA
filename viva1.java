import java.util.Scanner;

class Employee {
    String name;
    int EmpID;
    char gender;
}

class Department extends Employee {
    String dname;
    String work_assigned;
}

class Loan_Information extends Employee {
    String loan_details;
    double loan_amount;

}

public class viva1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Department e1_department = new Department();
        Loan_Information e1_loan = new Loan_Information();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        e1.name = sc.next();
        System.out.println("Enter EmpID: ");
        e1.EmpID = sc.nextInt();
        System.out.println("Enter Gender(M/F): ");
        e1.gender = sc.next().charAt(0);

        System.out.println("Enter Department Name: ");
        e1_department.dname = sc.next();
        System.out.println("Enter Work Assigned: ");
        e1_department.work_assigned = sc.next();

        System.out.println("Enter Loan Details: ");
        e1_loan.loan_details = sc.next();
        System.out.println("Enter Loan Amount: ");
        e1_loan.loan_amount = sc.nextDouble();

        System.out.println("Name: " + e1.name + " EmpID: " + e1.EmpID + " Gender: " + e1.gender);
        System.out
                .println("Department Name: " + e1_department.dname + " Work Assigned: " + e1_department.work_assigned);
        System.out.println("Loan Details: " + e1_loan.loan_details + " Loan Amount: " + e1_loan.loan_amount);

        sc.close();
    }

}
