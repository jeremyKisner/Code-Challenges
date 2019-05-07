package challenges;

public class ShapeArea {

	/*
	 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
	 * A 1-interesting polygon is just a square with a side of length 1. 
	 * An n-interesting polygon is obtained by taking the n - 1-interesting polygon 
	 * and appending 1-interesting polygons to its rim, side by side.
	 */
	
	public static void main(String[] args) {
		System.out.println(shapeArea(5));
	}
	
	public static int shapeArea(int n) {
		if (n == 1) {
			return n;
		}
		else {
			return (int)Math.pow(n,2)+(int)Math.pow(n-1,2);
		}
	}
}
