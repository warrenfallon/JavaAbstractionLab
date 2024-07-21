public abstract class Shape {
    protected String color;
    protected double dimension1;
    protected double dimension2;

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayShapeName() {
        System.out.println("I am a Shape.");
    }
}

