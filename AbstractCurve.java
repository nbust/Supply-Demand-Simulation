

package phase2;
import java.util.ArrayList;

public abstract class AbstractCurve {

	private ArrayList<Point> curve = new ArrayList<Point>();
	
	/**
	 * default constructor instantiates curve of size ten
	 */
	public AbstractCurve() {
		this(10);
	}
	
	/**
	 * constructor method instantiates curve of size n with ascending points
	 */
	public AbstractCurve(int n) {
		
		int	   x = 1;
		double y = 1.0;
		
		for (int i = n; i > 0; i--) {
			curve.add(new Point(x++, y++));
		}
	}
	
	/**
	 * constructor that creates an ArrayList with specified size, 
	 * start point, x slope, and y slope
	 * @param n
	 * @param startPoint
	 * @param dx
	 * @param dy
	 */
	public AbstractCurve(int n, Point startPoint, int dx, double dy) {
		
		int startQuantity = startPoint.getQuantity();
		double startPrice = startPoint.getPrice();
		
		for (int i = 0; i < n; i++) {
			curve.add(new Point(startQuantity + (i*dx), startPrice + (i*dy)));
		}
	}
	
	/**
	 * Adds specified point to the ArrayList at the closest price,
	 * if point exists at the price, update that point instead
	 * @param p
	 * @return whether operation was successful
	 */
	public boolean add(Point p) {
		if (p.getPrice() > 0 && p.getQuantity() > 0) {
			for (int i = 0; i < curve.size();) {
				if (curve.get(i).getQuantity() == p.getQuantity()) {
					curve.set(i, p);
					return true;
				}	
				else if (curve.get(i).getQuantity() < p.getQuantity())
					i++;
				else {
					curve.add(i, p);
					return true;
				}
			}
			return false;
		}
		else return false;
	}
	
	/**
	 * Removes specified point from the ArrayList
	 * @param p
	 * @return whether operation was successful
	 */
	public boolean remove(Point p) {
		int index = curve.indexOf(p);
		if (index == -1) return false;
		curve.remove(index);
		return true;
	}
	
	/**
	 * Checks if the specified point is on the Curve
	 * @returns whether point is on curve
	 * @param p 
	 */
	public boolean isOnCurve(Point p) {
		return (curve.indexOf(p) >= 0);
	}
	
	/**
	 * Returns a string of each element within the ArrayList curve
	 * @return result
	 */
	public String toString() {
		
		String result = "[";
		for (int i = 0; i < curve.size(); i++) {
				result += curve.get(i).toString();
			if (i < curve.size() - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;	
	}
	
	public abstract void sort();
}