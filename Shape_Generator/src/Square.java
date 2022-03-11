import java.awt.Color;
import java.awt.Graphics2D;
/*
 * Represents a rectangle whose height and width are equal
 */
public class Square extends Shape{
	
	public Square(int w, int h, Color c) {
		super(w, h, c);
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return getW()*getH(); //area of square
	}
	
	public void draw(Graphics2D g,int gap) {
		g.fillRect(gap, gap, getW(), getH());
	}

}
