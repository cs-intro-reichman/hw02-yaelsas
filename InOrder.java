/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int last;
		// first random int
		int num = (int) (Math.random() * 10);
		do {
			// keeps the last random int
			last = num;
			System.out.print(num + " ");
			// randomizing new int
			num = (int) (Math.random() * 10) ;
		} while (num >= last); // checks if there is a non-decreasing sequence
	}
}
