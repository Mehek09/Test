package MethodOverloading;

	public class Distance2 {
		public static void main(String[] args) {

			Point Origin = new Point(0, 0);

			Point p1 = new Point(2, 3);

			double distance = Origin.getDistance(p1);

			System.out.println("the Distance from Origin to point1 is: "+distance);
		}

	}