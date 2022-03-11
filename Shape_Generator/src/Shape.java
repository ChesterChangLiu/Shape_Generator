import java.awt.Color;
import java.awt.Graphics2D;
/*
 * Class that embodies the generic concept of Shape
 */
public class Shape implements Comparable<Shape>, Interface{
	private double area;
	private int w;//width
	private int h;//height
	private String type;
	private Color color;
	public Shape(int w,int h, Color c){
		color = c;
		this.w=w;
		this.h=h;
	}
	
	public int getW() {
		return w;
	}
	
	public int getH() {
		return h;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public Color getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
	/*
	 * Comparable interface
	 * TO allow sorting the shapes by comparing their surfaces, each shape should be able to
	 * compare itself to another shape using the compare method of the Comparable interface.
	 */
	@Override
	public int compareTo(Shape p) { 
		// TODO write the right Java code here to support the comparison
		if(this.getArea()>p.getArea())
			return 1;
		if(this.getArea()<p.getArea())
			return -1;
		if(this.getArea()==p.getArea())
			return 0;
		return 0;
	}
	
	public void draw(Graphics2D g,int gap) {
	}
}
