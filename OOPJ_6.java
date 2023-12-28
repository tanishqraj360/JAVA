// Develop a JAVA program to create an interface Resizable with methods 
// resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. 
// Create a class Rectangle that implements the Resizable interface and implements the resize methods

interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void resizeWidth(int width) {
        this.width = width;
    }

    public void resizeHeight(int height) {
        this.height = height;
    }

    public void displaySize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class OOPJ_6 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(100, 150);

        r1.displaySize();

        r1.resizeHeight(200);
        r1.resizeWidth(200);

        r1.displaySize();
    }
}
