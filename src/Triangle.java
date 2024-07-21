public class Triangle extends Shape {

    public Triangle(double base, double height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    @Override
    public double getArea() {
        return 0.5 * dimension1 * dimension2;
    }

    @Override
    public void displayShapeName() {
        System.out.println("I am a Triangle with base " + dimension1 + " and height " + dimension2);
    }

    @Override
    public String toString() {
        return "Triangle[base=" + dimension1 + ", height=" + dimension2 + ", " + super.toString() + "]";
    }
}
