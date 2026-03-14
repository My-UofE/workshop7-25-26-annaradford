public class Circle {
    // private instance variables
    private double radius;
    private String color;
 
    // Constructors
    public Circle() {
       this.radius = 1.0;
       this.color = "red";
    }
    public Circle(double radius) {
       this.radius = radius;
       this.color = "red";
    }
    public Circle(double radius, String color) {
       this.radius = radius;
       this.color = color;
    }
 
    // Getters and Setters
    public double getRadius() {
       return this.radius;
    }
    public String getColor() {
       return this.color;
    }
    public void setRadius(double radius) {
       this.radius = radius;
    }
    public void setColor(String color) {
       this.color = color;
    }
 
    // Describle itself
    public String toString() {
       return String.format("Circle[radius=%.2f,color=%s]", radius, color);
    }
 
   // Return the area of this Circle
   public double getArea() {
       return radius * radius * Math.PI;
    }

   public double getCircumference(){
      return 2 * Math.PI * radius;
    }

    // instance method
   public void printClassInfo(){
   System.out.println("It is a Circle class");
   }

   // static method
   public static void printClassInfoStatic(){
   System.out.println("It is a Circle class");
   }
 }