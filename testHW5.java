/**
 *
 */
package homework5;

/**
 * @author Kotaro
 *
 */
import java.util.Random;

public class testHW5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rnd = new Random();

		int r1 = rnd.nextInt(26);
		int r2 = rnd.nextInt(26);
		int r3 = rnd.nextInt(26);
		int r4 = rnd.nextInt(26);
		int r5 = rnd.nextInt(26);

		int[] data = { r1, r2, r3, r4, r5 };
		System.out.println("Unsorted list");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

		System.out.println("");
		System.out.println("");

		System.out.println("Sorted list");
		// Bubble sort
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					int asc = data[j];
					data[j] = data[j + 1];
					data[j + 1] = asc;
				}
			}
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}

	}

}
