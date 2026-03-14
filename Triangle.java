public class Triangle extends Shape {
    double a;
    double b;
    double c;

    public Triangle(){
        a = 1.0;
        b = 1.0;
        c = 1.0;
    }

    public Triangle(double a,double b, double c, String color){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSideA(){
        return this.a;
    }

    public double getSideB(){
        return this.b;
    }
    
    public double getSideC(){
        return this.c;
    }

    public double area(){
        return Math.sqrt(perimeter()*(perimeter()-a)*(perimeter()-b)*(perimeter()-c));
    }

    public double perimeter(){
        return (a + b + c) / 2;
    }

    @Override
    public String toString(){
        return String.format("Triangle[side a=%.2f,side b=%.2f,side c=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
            this.a,
            this.b,
            this.c,
            getColor(),
            area(),
            perimeter());
    }

    public boolean equals(Object obj){
        if (obj instanceof Triangle){
            Triangle tri = (Triangle) obj;
            if (Double.compare(this.a,tri.getSideA()) == 0 && 
                Double.compare(this.b,tri.getSideB()) == 0 && 
                Double.compare(this.c,tri.getSideC()) == 0 &&
                getColor().equals(tri.getColor())){
                return true;
            }
        } 
        return false;
    }
}
