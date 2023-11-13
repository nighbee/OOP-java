package shit;

public class Triangle extends Shape{
	public Triangle(int pos, Color color) { 
		super(pos, color); 
	}
	public void draw() {
        String symbol = color == Color.RED ? "^" : " ";
        System.err.println(getIndentation() + symbol);
    }

    private String getIndentation() {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < pos; i++) {
            indentation.append(" ");
        }
        return indentation.toString();
    }
}
