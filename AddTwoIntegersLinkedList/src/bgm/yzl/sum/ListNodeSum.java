package bgm.yzl.sum;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListNodeSum {

	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

		LinkedList<Integer> result = new LinkedList<>();
		ListIterator<Integer> oneIterator = l1.listIterator();
		ListIterator<Integer> twoIterator = l2.listIterator();
		int currentIndexOne = oneIterator.nextIndex();
		int currentIndexTwo = twoIterator.nextIndex();
		int carry = 0;

		while (oneIterator.hasNext() && twoIterator.hasNext()) {

			int x = ((l1.get(currentIndexOne) + l2.get(currentIndexTwo)) % 10) + carry;

			if (x <= 9) {
				result.add(x);
			}
			carry = (((l1.get(currentIndexOne) + l2.get(currentIndexTwo))
					- ((l1.get(currentIndexOne) + l2.get(currentIndexTwo)) % 10)) / 10);
			oneIterator.next();
			twoIterator.next();
			currentIndexOne = oneIterator.nextIndex();
			currentIndexTwo = twoIterator.nextIndex();

		}

		while (oneIterator.hasNext() && !twoIterator.hasNext()) {
			int x = l1.get(currentIndexOne) + carry;
			if (x <= 9)
				result.add(x);
			else {
				result.add(x % 10);
				carry = 1;
			}
			oneIterator.next();
			currentIndexOne = oneIterator.nextIndex();
		}

		while (twoIterator.hasNext() && !oneIterator.hasNext()) {
			int x = l2.get(currentIndexTwo) + carry;
			if (x <= 9) {
				result.add(x);
			}
			twoIterator.next();
			currentIndexTwo = twoIterator.nextIndex();
		}

		return result;

	}

}
