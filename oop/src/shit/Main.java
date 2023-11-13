package shit;
import java.util.Scanner; 
import java.util.Vector; 
public class Main {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int pos1= scanner.nextInt();
        shapes.add(new Circle(pos1, Color.RED));
        shapes.add(new Rect(pos1, Color.RED));
        shapes.add(new Triangle(pos1, Color.RED));

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}          