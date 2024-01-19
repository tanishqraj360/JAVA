import java.util.Scanner;

interface Shape {
    void calvolume();

    void calsurface();
}

class Cube implements Shape {
    int a;

    @Override
    public void calsurface() {
        System.out.println("Surface area of Cube: " + (6 * a * a));
    }

    @Override
    public void calvolume() {
        System.out.println("Volume of cube: " + (a * a * a));
    }

    Cube(int a) {
        this.a = a;
    }
}

class Rectangle implements Shape {
    int l, b;

    @Override
    public void calsurface() {
        System.out.println("Surface area of Rectangle: " + (2 * (l + b)));
    }

    @Override
    public void calvolume() {
        System.out.println("Volume of Rectangle: " + (l * b));
    }

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class Circle implements Shape {
    int r;

    @Override
    public void calsurface() {
        System.out.println("Surface area of Circle: " + (2 * 3.14 * r));
    }

    @Override
    public void calvolume() {
        System.out.println("Volume of Circle: " + (3.14 * r * r));
    }

    Circle(int r) {
        this.r = r;
    }
}



public class viva3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, l, b, r;

        System.out.println("Enter edge of Cube: ");
        a = sc.nextInt();

        System.out.println("Enter length of Rectangle: ");
        l = sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        b = sc.nextInt();

        System.out.println("Enter radius of Circle: ");
        r = sc.nextInt();

        Cube c = new Cube(a);
        Rectangle rec = new Rectangle(l, b);
        Circle cir = new Circle(r);

        c.calsurface();
        c.calvolume();

        rec.calsurface();
        rec.calvolume();

        cir.calsurface();
        cir.calvolume();
    }
}
