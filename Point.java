package phase2;

/**
 * @author Noah Buster, Abram Deweese, Maddie Redden
 * Date: 2024 Aug 21
 * Description: class that holds a quantity and price, and methods for equality.
 */
public class Point {

	private int                quantity;
	private double             price;
	public static final double TOLERANCE = 0.01;

	/** 
	 * constructor declares quantity and price
	 */
	public Point() {
		quantity = 0;
		price    = 0.0;
	}

	/** 
	 * constructor declares quantity and price with safety checks
	 */
	public Point(int q, double p) {
		
		if (q < 0) {
			q = 0;
		}
		if (p < 0.0) {
			p = 0.0;
		}

		quantity = q;
		price = p;
	}
	
	/** 
	 * returns quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/** 
	 * returns price
	 */
	public double getPrice() {
		return price;
	}

	/** 
	 * returns string with ordered pair of quantity, price
	 */
	@Override
	public String toString() {
		return "(" + quantity + ", " + String.format("%.2f", price) + ")";
	}

	/** 
	 * checks equality with object o
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point)o;
		return this.equals(p);
	}

	/** 
	 * checks equality with point p
	 */
	// Overload
	public boolean equals(Point p) {
		double d = p.price - this.price;
		return (p.quantity == this.quantity) && (Math.abs(d) < TOLERANCE);
	}
}