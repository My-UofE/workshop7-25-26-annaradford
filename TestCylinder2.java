/*
 * Another test driver for the Cylinder class.
 */
public class TestCylinder2 {
    public static void main(String[] args) {
       Circle cy2 = new Cylinder(5.0, 2.0);

       double h = ((Cylinder)cy2).getHeight();
       double r = cy2.getRadius();
       double a = cy2.getArea();
       double v = ((Cylinder)cy2).getVolume();

       System.out.printf("Height: %.2f, Radius: %.2f, Area: %.2f, Volume: %.2f\n", h, r, a, v);

       System.out.println("\nrunning\nCircle c3 = new Circle();\nc3.printClassInfo();");
        Circle c3 = new Circle();
        c3.printClassInfo();
        
        System.out.println("\nrunning\nCylinder cy4 = new Cylinder();\ncy4.printClassInfo();");
        Cylinder cy4 = new Cylinder();
        cy4.printClassInfo();
        
        System.out.println("\nrunning\nCircle cy5 = new Cylinder();\ncy5.printClassInfo();");
        Circle cy5 = new Cylinder(); // upcasting
        cy5.printClassInfo();
        
        // this will give a compiler warning; but can compile and run
        System.out.println("\nrunning\ncy4.printClassInfoStatic();");
        cy4.printClassInfoStatic();

        // this will give a compiler warning; but can compile and run
        System.out.println("\nrunning\ncy5.printClassInfoStatic();");
        cy5.printClassInfoStatic();
    }
}