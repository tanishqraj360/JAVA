import java.util.Scanner;

class Student {
    int USN;
    String name;
    int age;

    Student(int USN, String name, int age) {
        this.USN = USN;
        this.name = name;
        this.age = age;
    }

}

class UGstudent extends Student {

    UGstudent(int USN, String name, int age) {
        super(USN, name, age);
    }

    int semester;
    double fees;
    float cgpa;
    double stipend;

    void display() {
        System.out.println("Name: " + name + " USN: " + USN + " Age: " + age);
        System.out.println("Semester: " + semester + " Fees: " + fees + " CGPA: " + cgpa + " Stipend: " + stipend);
    }
}

public class viva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter USN: ");
        int USN = sc.nextInt();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        UGstudent s1_UG = new UGstudent(USN, name, age);

        System.out.println("Enter Semester: ");
        s1_UG.semester = sc.nextInt();
        System.out.println("Enter fees: ");
        s1_UG.fees = sc.nextDouble();
        System.out.println("Enter CGPA: ");
        s1_UG.cgpa = sc.nextFloat();
        System.out.println("Enter Stipend: ");
        s1_UG.stipend = sc.nextDouble();

        System.out.println("\nStudent Details:");
        s1_UG.display();

        sc.close();
    }
}
