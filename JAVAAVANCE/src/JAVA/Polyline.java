package JAVA;

import java.util.ArrayList;

public class Polyline extends Point {

	
	public Polyline(Point p2) {
		super(p2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p2);
		
	}

}
