import java.awt.Color;
/*
 * Supports the instantiation of different shapes
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType,int w, int h, Color c){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle(w,h,c);
	         
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle(w,h,c);
	         
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square(w,h,c);
	      }
	      
	      return null;
	   }
}
