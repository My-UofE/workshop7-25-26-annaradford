/*
 * A test driver for the Cylinder class.
 */
public class TestCylinder1 {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.0, "blue");
        System.out.printf("Class: %s, Radius: %.2f, Colour: %s, Area: %.2f\n", 
            c1.getClass(), c1.getRadius(), c1.getColor(), c1.getArea());

        Cylinder cy1 = new Cylinder(5.0, 2.0);
        System.out.printf("Class: %s, Height: %.2f, Radius: %.2f, Colour: %s, Area: %.2f, Volume: %.2f\n", 
            cy1.getClass(), cy1.getHeight(), cy1.getRadius(), cy1.getColor(), cy1.getArea(), cy1.getVolume());

        // add extra code below 
        double surfaceArea = cy1.getArea();
        double baseArea = cy1.getBaseArea();
        System.out.printf("Surface Area: %.2f, Base Area: %.2f\n", surfaceArea, baseArea);

    }
}  