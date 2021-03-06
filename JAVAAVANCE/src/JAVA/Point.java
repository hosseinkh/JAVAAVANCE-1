package JAVA;

public class Point {
	private int x; 
	private int y;
	private static int count=0;  
	
	
	
	public Point(int x, int y) {
		this.x = x; 
		this.y= y;
		count++; 
	}
	
	
	public Point (Point p2) {
		   this.x = p2.getX();
		   this.y = p2.getY();		  
		   count++; 
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	} 
	
	public static int getCount() {
		return count; 
	}
	
	public static boolean isSameAs(Point p1, Point p2) {

		if(p2.equals(p1))
			return true;
		else 
			return false; 
	}



	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	

}
