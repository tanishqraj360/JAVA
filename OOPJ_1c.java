//Develop a JAVA program to count and display the number of arguments

public class OOPJ_1c {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println((i + 1) + " : " + args[i]);
        }
    }
}