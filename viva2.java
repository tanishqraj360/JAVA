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

    int semester;
    double fees;
    float cgpa;
    double stipend;

    UGstudent(int USN, String name, int age, int semester, double fees, float cgpa, double stipend) {
        super(USN, name, age);
        this.semester = semester;
        this.fees = fees;
        this.cgpa = cgpa;
        this.stipend = stipend;
    }

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

        System.out.println("Enter Semester: ");
        int semester = sc.nextInt();
        System.out.println("Enter fees: ");
        double fees = sc.nextDouble();
        System.out.println("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        System.out.println("Enter Stipend: ");
        double stipend = sc.nextDouble();

        UGstudent s1_UG = new UGstudent(USN, name, age, semester, fees, cgpa, stipend);

        System.out.println("\nStudent Details:");
        s1_UG.display();

        sc.close();
    }
}
