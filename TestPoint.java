/**
 * This is the first assignment of APCSA 2024.
 */

/**
 * @author Noah Buster, Abram Deweese, Maddie Redden
 * Date: 2024 Aug 21
 * Description: class that tests point.java
 */
public class TestPoint {

	/** 
	 * main method that tests point.java
	 */
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point(0, 0.0);
		System.out.println("p1 is " + p1.toString()); //(0, 0.0)
		System.out.println("p2 is " + p2.toString()); //(0, 0.0)
		System.out.println("p1 equals p2 " + p1.equals(p2)); //true
		System.out.println("p2 equals p1 " + p2.equals(p1)); //true
		
		Point p3 = new Point(1, 3.0);
		Point p4 = new Point();
		System.out.println("p3 is " + p3.toString()); //(1, 3.0)
		System.out.println("p4 is " + p4.toString()); //(0, 0.0)
		System.out.println("p3 equals p4 " + p3.equals(p4)); //false
		System.out.println("p4 equals p3 " + p4.equals(p3)); //false
		
		Integer b = 5;
		System.out.println("p4 equals 5 " + p4.equals(b)); //false

		Point p5 = new Point(3, 0.0);
		Point p6 = new Point(0, 0.0);
		Point p7 = new Point(0, 3.0);
		System.out.println("p5 is " + p5.toString()); //(3, 0.0)
		System.out.println("p6 is " + p6.toString()); //(0, 0.0)
		System.out.println("p7 is " + p7.toString()); //(0, 3.0)
		System.out.println("p5 equals p6 " + p5.equals(p6)); //false
		System.out.println("p6 equals p7 " + p6.equals(p7)); //false
		System.out.println("p5 equals p7 " + p5.equals(p7)); //false
	}
}
