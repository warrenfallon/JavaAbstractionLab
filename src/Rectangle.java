public class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        this.dimension1 = width;
        this.dimension2 = height;
    }

    @Override
    public double getArea() {
        return dimension1 * dimension2;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Rectangle with width " + dimension1 + " and height " + dimension2);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + dimension1 + ", height=" + dimension2 + ", " + super.toString() + "]";
    }
}

