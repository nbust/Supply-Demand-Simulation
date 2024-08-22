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
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Changes the price of the specific Point object
	 */
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + quantity + "," + price + "]";
	}
	
	public boolean equals(Point otherPoint)
	{
		if (this.quantity == otherPoint.quantity) return true;
		return false;
	}
	
}
