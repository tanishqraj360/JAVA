public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 5);
        MyPoint p2 = new MyPoint(7, 8);

        System.out.println("Point 1: " + p1.toString());
        System.out.println("Point 2: " + p2.toString());

        System.out.println("Distance between Point 1 and (0,0): " + p1.distance());
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));

        p1.setXY(1, 2);
        System.out.println("New Coordinates for Point 1: " + p1.toString());

        int[] coordinates = p2.getXY();
        System.out.println("Coordinates of Point 2: " + coordinates[0] + " and " + coordinates[1]);

        System.out.println("Distance between Point 1 and (0,0): " + p1.distance());
        System.out.println("Distance between Point 1 and Point 2: " + p1.distance(p2));
    }
}
