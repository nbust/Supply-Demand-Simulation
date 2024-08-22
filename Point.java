/**
 * This is the first assignment of APCSA 2024.
 * Required for (quantity, price) ordered pair definition.
 */

/**
 * @author MARedden
 * Date: 2024Aug21
 * Description:
 *
 */

public class Point {
	private int quantity;
	private double price;
	
	public Point(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public Point() {
		this.quantity = 0;
		this.price = 0.0;
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
	
	public boolean equals(Point otherPoint)
	{
		return (this.quantity == otherPoint.quantity && this.price == otherPoint.price);
	}
	
}
