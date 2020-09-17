package shape;

public class ColorableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[2] = new Square(x, "melinda", true);
        for (Shape a : shapes) {
            System.out.println(a);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
