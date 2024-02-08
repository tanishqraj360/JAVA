// Develop a JAVA program to create a class named shape. 
// Create three sub classes namely: circle, triangle and square, 
// each class has two member functions named draw () and erase (). 
// Demonstrate polymorphism concepts by developing suitable methods, defining member data and main program

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void erase() {
        System.out.println("Erasing a shape");
    }
}

class Circle extends Shape {
    @Override // Override not required
    public void draw() { // Override anotation gives error if the superclass is not overriden
        System.out.println("Drawing a Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Triangle");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public void erase() {
        System.out.println("Erasing a Square");
    }
}

public class OOPJ_5 {
    public static void main(String[] args) {
        Circle cir = new Circle();
        Triangle tri = new Triangle();
        Square sq = new Square();

        cir.draw();
        cir.erase();
        System.out.println();

        tri.draw();
        tri.erase();
        System.out.println();

        sq.draw();
        sq.erase();

    }
}
