public class ShapeApp {
    public static void main(String[] args) {
        //They are all declared as shapes,
        //but instantiated with different subclasses’ objects
        Shape s1,s2,s3,s4;
        s1 = new Rectangle(3.0,4.0,"green");
        System.out.println(s1.toString());
        s2 = new Rectangle(3.0,4.0,"green");
        s3 = new Triangle(3.0,4.0,5.0,"green");
        System.out.println(s3);
        //compare the shapes
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
    } 
}
