import java.util.Arrays;

public class ShellSort {

	public static void shellSort(int[] array) {

		int gap = (array.length / 2);

		while (gap >= 1) {
			for (int j = gap, i = j - gap; (i < array.length && j < array.length); i++, j++) {
				System.out.println(Arrays.toString(array));
				int unsorted = array[j];
				while (i > -1 && unsorted < array[i]) {
					int temp = array[i];
					if (gap != 1) {
						array[i] = unsorted;
						array[j] = temp;
					} else {
						array[i + 1] = temp;
						i--;
						array[i + 1] = unsorted;
					}

				}
				if (gap == 1) {
					i = j - 1;
				}
			}
			gap = gap / 2;

		}

	}

	public static void main(String[] args) {

		int[] array = { 8, 3, 4, 2, 7, 1, 0 };
		shellSort(array);
	}

}
