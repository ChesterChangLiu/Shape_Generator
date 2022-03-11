import java.awt.Color;
import java.awt.Graphics2D;
/*
 * Represents a rectangle 
 */
public class Rectangle extends Shape{
	
	public Rectangle(int w, int h, Color c) {
		super(w, h, c);
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		return getW()*getH();  //area of rectangle
	}
	
	public void draw(Graphics2D g,int gap) {
		g.fillRect(gap, gap, getW(), getH());
	}
}
