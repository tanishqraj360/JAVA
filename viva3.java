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

class Cuboid implements Shape {
    int l, b, h;

    @Override
    public void calsurface() {
        System.out.println("Surface area of Cuboid: " + (2 * (l * b + b * h + l * h)));
    }

    @Override
    public void calvolume() {
        System.out.println("Volume of Cuboid: " + (l * b * h));
    }

    Cuboid(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }
}

class Sphere implements Shape {
    int r;

    @Override
    public void calsurface() {
        System.out.println("Surface area of Sphere: " + (4 * 3.14 * r * r));
    }

    @Override
    public void calvolume() {
        System.out.println("Volume of Sphere: " + ((4 / 3) * 3.14 * r * r * r));
    }

    Sphere(int r) {
        this.r = r;
    }
}

public class viva3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, l, b, h, r;

        System.out.println("Enter edge of Cube: ");
        a = sc.nextInt();

        System.out.println("Enter length of Cuboid: ");
        l = sc.nextInt();
        System.out.println("Enter breadth of Cuboid: ");
        b = sc.nextInt();
        System.out.println("Enter height of Cuboid: ");
        h = sc.nextInt();

        System.out.println("Enter radius of Sphere");
        r = sc.nextInt();

        Cube c = new Cube(a);
        Sphere s = new Sphere(r);
        Cuboid cub = new Cuboid(l, b, h);

        c.calsurface();
        c.calvolume();

        s.calsurface();
        s.calvolume();

        cub.calsurface();
        cub.calvolume();

        sc.close();
    }
}
