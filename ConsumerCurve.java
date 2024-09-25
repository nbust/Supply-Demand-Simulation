package phase2;

/**
 * @author Noah Buster, Justin Dial, Olivia Sayuk
 * Date: 2024 Sep 24
 * Description: ConsumerCurve extends abstract curve
 * for consumer class
 */
public class ConsumerCurve extends AbstractCurve {
	
	
	/**
	 * sorts AbstractCurve from lowest to highest quantity
	 */
	@Override
	public void sort()
	{
        for (int i = 1; i < myCurve.size(); i++) {
            Point key = myCurve.get(i);
            int j = i - 1;

            // Insert myCurve[i] into the sorted sequence myCurve[0..i-1]
            while (j >= 0 && !myCurve.get(j).equals(key)) {
                // Swap points if they are not considered equal
                myCurve.set(j + 1, myCurve.get(j));
                j = j - 1;
            }
            myCurve.set(j + 1, key);
        }
    }
}
