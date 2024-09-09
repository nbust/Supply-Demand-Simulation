public class TestProducerCurve {
	
	/**
	 * tests ProducerCurve methods
	 * @param args
	 */
	public static void main(String[] args)
	{
		ProducerCurve p1 = new ProducerCurve(3,   1.2,  20,  30.0);
		ProducerCurve p2 = new ProducerCurve(3,  -1.0,  20,  30.0);
		ProducerCurve p3 = new ProducerCurve(-3,  1.2,  20,  30.0);
		ProducerCurve p4 = new ProducerCurve(3,   1.2, -20,  30.0);
		ProducerCurve p5 = new ProducerCurve(3,   1.2,  20, -30.0);
		ProducerCurve p6 = new ProducerCurve(3,  -1.2, -20, -30.0);
		ProducerCurve p7 = new ProducerCurve(-3, -1.2, -20, -30.0);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
		System.out.println(p7);
		ProducerCurve p8 = new ProducerCurve(2, 1, 20, 30);
		p8.add(new Point(2, 4.0));
		System.out.println(p8);
		p8.remove(new Point(21, 31.00));
		System.out.println(p8);
		p8.remove(new Point(0, 0.0));
		System.out.println(p8);
		p8.remove(new Point(20, 30.005));
		System.out.println(p8);
	}
}
