import java.awt.Color;
import java.awt.Graphics2D;
/*
 * Represents a circle
 */
public class Circle extends Shape {

	public Circle(int w, int h, Color c) {
		super(w, h, c);
		// TODO Auto-generated constructor stub
	}

	public double getArea() {
		
		return (getW()/2)*(getW()/2)*3.141592653589793238; //area of circle
	}
	
	public void draw(Graphics2D g,int gap) {
		
		g.fillOval(gap, gap, getW(), getH());
		
	}
	
}
