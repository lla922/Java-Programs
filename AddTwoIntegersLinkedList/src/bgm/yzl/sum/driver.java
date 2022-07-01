package bgm.yzl.sum;

import java.util.LinkedList;

public class driver {

	public static void main(String[] args) {

		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();

		a.add(9);

		a.add(9);

		a.add(9);

		b.add(8);

		b.add(3);

		b.add(2);

		b.add(0);

		System.out.println(ListNodeSum.addTwoNumbers(a, b).toString());

	}

}
