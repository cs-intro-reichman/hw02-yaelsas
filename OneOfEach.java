
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isBoy = false;
		boolean isGirl = false;
		// children counter
		int count = 0;
		// loop running until there are 1 boy and 1 girl
		while (!isBoy || !isGirl) {
			// randomizing a child
			double child = Math.random();
			// checks if child is a girl
			if (child > 0.5) {
				isGirl = true;
				System.out.print("g ");
			} else {     // checks if child is a boy
				isBoy = true;
				System.out.print("b ");
			}
			// counts how many children were born
			count++;
		}
		System.out.println();
		// prints to the user howm many children were born
		System.out.println("You made it... and you now have " + count + " children.");
	}
}
