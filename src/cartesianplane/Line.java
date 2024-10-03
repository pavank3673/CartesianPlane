package cartesianplane;

public class Line {

	Point point1;
	Point point2;
	
	public Line(Point point1, Point point2) {
		this.point1 = point1;
		this.point2 = point2;
	}
	
	public double findCartesianDistance() {
		return Math.sqrt(Math.pow(this.point2.x-this.point1.x,2) + Math.pow(this.point2.y-this.point1.y, 2));
	}
}
