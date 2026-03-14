public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double area(){
        return this.height * this.width;
    }

    public double perimeter(){
        return this.height * 2 + this.width * 2;
    }

    @Override
    public String toString(){
        return String.format("Rectangle[width=%.2f,height=%.2f,color=%s,area=%.2f,perimeter=%.2f]",
            this.width,
            this.height,
            getColor(),
            area(),
            perimeter()
        );
    }


    public boolean equals(Object obj){
        if (obj instanceof Rectangle){
            Rectangle rec = (Rectangle) obj;
            if (Double.compare(this.height,rec.getHeight()) == 0 && 
                Double.compare(this.width,rec.getWidth()) == 0 && 
                getColor().equals(rec.getColor())){
                return true;
            }
        } 
        return false;
    }
}
