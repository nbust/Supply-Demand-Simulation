
public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println(p1.toString());
				
		Point p2 = new Point(1,1.0);
		System.out.println(p2);
		
		p1.setQuantity(1);
		p1.setPrice(1.0);
		System.out.println("p1 is "+p1.toString());
		
		System.out.println("p1 quantity is "+p1.getQuantity());
		System.out.println("p1 price is "+p1.getPrice());
		
		System.out.println(p1.equals(p2));
	}

}
