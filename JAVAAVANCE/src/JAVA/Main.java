package JAVA;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		
	Point p1 = new Point(15,55);
	Point p2 = new Point(8,10);
	Point p3 = new Point(9,15);
	Polyline pl = new Polyline(p2);
	
	
	

	
	ArrayList<Point> list = new ArrayList<>();
	list.add(p1);
	list.add(p2);
	list.add(p3);

	System.out.println(list.indexOf(p1));
	System.out.println(list.indexOf(p2));
	System.out.println(list.indexOf(p3));
	
	System.out.println(pl.toString());

//	System.out.println(p3.getX()+" "+p3.getY());
//	System.out.println(Point.getCount()); 
//	System.out.println(p1==p2);
//	System.out.println(p1==p3);
//	System.out.println(Point.isSameAs(p1,p2));


 }
	
	}



