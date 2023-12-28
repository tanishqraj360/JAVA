//Develop a JAVA program to implement basic arithmetic operations

public class OOPJ_1b {
    public static void main(String[] args) {
        System.out.println(args[0] + " + " + args[1] + " = " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));
        System.out.println(args[0] + " - " + args[1] + " = " + (Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
        System.out.println(args[0] + " * " + args[1] + " = " + (Integer.parseInt(args[0]) * Integer.parseInt(args[1])));
        System.out.println(args[0] + " / " + args[1] + " = " + (Integer.parseInt(args[0]) / Integer.parseInt(args[1])));
    }
}
