import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
//import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPanel extends JPanel {
	private static MyPanel instance; //singleton pattern
	public static MyPanel getInstance() {
		if(instance == null)
			instance = new MyPanel();
		return instance;
	}
	
	static ArrayList<Shape> shapes = new ArrayList<Shape>();
	/**
	 * This method displays the created shapes.
	 */
	public void paintComponent(Graphics g) { //paint shapes
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		int gap = 0;
		//set gap between shape
		for(Shape s:shapes) {
			gap+=75;
			g2d.setColor(s.getColor());
			s.draw(g2d, gap);		
		}
		this.repaint(); //refresh
	} 
	 /**
	    * This is the main method of the class.
	    * @param args
	    */
	public static void main(String[] args) {
		//apply singleton pattern
		MyPanel rects = MyPanel.getInstance();
		ShapeFactory shapeFactory = new ShapeFactory();
		
		JFrame frame = new JFrame("Display shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b1 = new JButton("Load shapes");
		JButton b2 = new JButton("Sort shapes");
		rects.add(b1);
		rects.add(b2);
		b1.addActionListener(new ActionListener() { 
			//each time click the load button, generate 6 random shape, size and color of circles, rectangles and squares
			  public void actionPerformed(ActionEvent e) {
			//	  Random num = new Random(); //generate random  width and height
			//	  int w = 30 + (int) (Math.random()*50);
			//	  int h = 30 + (int) (Math.random()*20);
				  Random rand = new Random(); //generate random color for shapes
			//	  float r = rand.nextFloat();
			//	  float g = rand.nextFloat();
			//	  float b = rand.nextFloat();
				  
				  Random ran = new Random();
				  int i = 0;
				  boolean bl = true;
				  while(bl) {   //generate random shape, random size and random color
					 while(i<6) { 	
						int a = ran.nextInt(10);
				        if (a <= 3) {
				        	int R = 30 + (int) (Math.random()*48);
						//	int h = 30 + (int) (Math.random()*20);
							float r = rand.nextFloat();
						    float g = rand.nextFloat();
						    float b = rand.nextFloat();
				        	Shape s = shapeFactory.getShape("CIRCLE",R,R,new Color(r, g, b));
					    	shapes.add(s);
					    	i++;
					    
				        } 
				        else if (a > 3 && a <= 6) {
				        	int w = 30 + (int) (Math.random()*26);
							int h = 30 + (int) (Math.random()*46);
							float r = rand.nextFloat();
						    float g = rand.nextFloat();
						    float b = rand.nextFloat();
				        	Shape s = shapeFactory.getShape("RECTANGLE",w,h,new Color(r, g, b));
							shapes.add(s);
							i++;
							
				        } 
				        else {
				        	int w = 20 + (int) (Math.random()*46);
						//	int h = 30 + (int) (Math.random()*20);
				        	float r = rand.nextFloat();
						    float g = rand.nextFloat();
						    float b = rand.nextFloat();
				        	Shape s = shapeFactory.getShape("SQUARE",w,w,new Color(r, g, b));
				        	shapes.add(s);
				        	i++;
				        	
				        }
				     
					 }
					 while(i>=6) {
						 bl = false;
					//	 b1.addActionListener(this::actionPerformed);
						 break; 
					 	}
				  }
				
				
			   
			  }
		});
		
		b2.addActionListener(new ActionListener() {
			//each time the user click on the Sort Shapes button, sort the six shapes
			  public void actionPerformed(ActionEvent e) { 
				SortingTechnique sortingTechnique = new SortingTechnique();
				sortingTechnique.bubbleSort(shapes);
			  } 
		});
		
		frame.add(rects);
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	

}
