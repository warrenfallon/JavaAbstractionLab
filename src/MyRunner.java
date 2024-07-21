public class MyRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of Circle: " + circle.getArea());
        circle.displayShapeName();
        System.out.println(circle);

        System.out.println("+++++++++++++++++");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
        rectangle.displayShapeName();
        System.out.println(rectangle);

        System.out.println("+++++++++++++++++");

        Triangle triangle = new Triangle(4, 7);
        System.out.println("Area of Triangle: " + triangle.getArea());
        triangle.displayShapeName();
        System.out.println(triangle);
    }
}
