import java.util.ArrayList;
/*
 * Allows sorting shapes based on their surfaces area
 * Reference from https://www.geeksforgeeks.org/bubble-sort/
 */
public class SortingTechnique {
	 void bubbleSort(ArrayList<Shape> shapes) {
		 int n = shapes.size();
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (shapes.get(j).compareTo(shapes.get(j+1))==1)
					//Comparable interface
				{
					// swap arr[j+1] and arr[j]
					Shape temp = shapes.get(j);	
					shapes.set(j, shapes.get(j+1));
					shapes.set(j+1, temp);
					
				}
	}
	
}
