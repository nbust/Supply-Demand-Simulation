/**
 * This is the first assignment of APCSA 2024.
 * Required for (quantity, price) ordered pair definition.
 */

/**
 * @author MARedden, Noah Buster
 * Date: 2024 Aug 21
 * Description: class that holds a quantity and price, and methods for equality.
 *
 */
public class Point {
	
	private int quantity;
	private double price;
	public static final double tolerance;
	
	public Point() {
		quantity = 0;
		price    = 0.0;
	}
	
	public Point(int q, double p) {
		quantity = q;
		price    = p;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		this.price = p;
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
		return p.quantity == this.quantity && Math.abs(d) < tolerance;
	}
	
	public boolean equals(Point p) {
		double d = p.price - this.price;
		return p.quantity == this.quantity && Math.abs(d) < tolerance;
	}
}
