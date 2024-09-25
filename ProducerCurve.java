package phase2;

/**
 * @author Noah Buster, Justin Dial, Olivia Sayuk
 * Date: 2024 Sep 24
 * Description: ProducerCurve extends abstract curve
 * for producer class
 */
public class ProducerCurve extends AbstractCurve {
	
	
	/**
	 * sorts AbstractCurve from lowest to highest quantity
	 */
	@Override
	public void sort()
	{
		int g = 0;
		for (int i = 0; i < myCurve.size(); i++)
		{
			int h = 0;
			for (int j = 0; j < myCurve.size() - g; j++)
			{
				if (myCurve.get(j).getQuantity() > myCurve.get(h).getQuantity())
				{
					h = j;
				}
			}
			Point p = myCurve.get(h);
			myCurve.set(h,  myCurve.get((myCurve.size() - g) - 1));
			myCurve.set((myCurve.size() - g) - 1, p);
			g++;
		}
	}
}