package cartesianplane;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Enter the Point 1 co-ordinates: ");
			System.out.println("X: ");
			double x1 = userInput.nextDouble();
			System.out.println("Y:");
			double y1 = userInput.nextDouble();
			
			Point point1 = new Point(x1, y1);
			
			System.out.println("Enter the Point 2 co-ordinates: ");
			System.out.println("X: ");
			double x2 = userInput.nextDouble();
			System.out.println("Y:");
			double y2 = userInput.nextDouble();
			
			Point point2 = new Point(x2, y2);
			
			userInput.close();

			Line line = new Line(point1, point2);

			double cartesianDistance = line.findCartesianDistance();
			
			System.out.println("The Cartesian Distance of the given points x1:" + point1.x + " ,y1:" + point1.y +""
					+ " and x2:" + point2.x + " , y2:" + point2.y + " is " + cartesianDistance);
	}
}
