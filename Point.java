/**
 * This is the first assignment of APCSA 2024.
 * Required for (quantity, price) ordered pair definition.
 */

/**
 * @author Noah Buster, Abram Deweese, Maddie Redden
 * Date: 2024 Aug 21
 * Description: class that holds a quantity and price, and methods for equality.
 */
// use overload correctly
public class Point {

	private int 				quantity;
	private double 				price;
	public static final double 	TOLERANCE = 0.01;

	/** 
	 * Method which declares quantity and price
	 */
	public Point() {
		quantity = 0;
		price    = 0.0;
	}

	/** 
	 * Method which confirms q and p are greater than 0
	 */
	public Point(int q, double p) {
		quantity = q;
		price = p;
		if(q<=0)
		{
			q = 0;
		}
		if(p<=0.0)
		{
			p = 0.0;
		}
	}
	
	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "(" + quantity + ", " + price + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point)o;
		double d = p.price - this.price;
		return p.quantity == this.quantity && Math.abs(d) < TOLERANCE;
	}

	/** 
	 * uses overload
	 */
	// @Overload
	// need to chose order in line 72
	public boolean equals(Point p) {
		double d = p.price - this.price;
		return p.quantity == this.quantity && Math.abs(d) < TOLERANCE;
	}
}
