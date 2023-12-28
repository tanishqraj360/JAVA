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
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}
