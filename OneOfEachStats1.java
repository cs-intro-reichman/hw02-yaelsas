/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		// number of experiments given by the user
		int T = Integer.parseInt(args[0]);
		double sum = 0;
		// counters for number of families with x children
		int twoChildCount = 0;
		int threeChildCount = 0;
		int fourPlusChildCount = 0;
		String mode = "2.";
		// loop of T experiments
		for (int i = 0; i < T ; i++) {
			boolean isBoy = false;
		    boolean isGirl = false;
		    int count = 0;
			// loop running until there are 1 boy and 1 girl
		    while (!isBoy || !isGirl) {
			    double child = Math.random();    // randomizing a child
			    if (child > 0.5) {    // checks if child is a girl
				    isGirl = true;
			    } else {           
				     isBoy = true;
			    }
				// counts how many children were born
			    count++;
		    }
			
			// count how many families were born with the same number of children
			if (count >= 4) {
				fourPlusChildCount++;
			} else if (count == 3) {
				threeChildCount++;
			} else {
				twoChildCount++;
			}
			// sum of all children that were born in T experiments
			sum += count;
		}
		// checks mode
		if (threeChildCount > twoChildCount && threeChildCount > fourPlusChildCount) {
			mode = "3.";
		} else if (fourPlusChildCount > threeChildCount && fourPlusChildCount > twoChildCount) {
			mode = "4 or more.";
		}
		// prnts the results
		System.out.println("Average: " + (sum / T) +
		" children to get to at least one of each gender");
		System.out.println("Number of families with 2 children: " + twoChildCount);
		System.out.println("Number of families with 3 children: " + threeChildCount);
		System.out.println("Number of families with 4 or more children: " + fourPlusChildCount);
		System.out.println("The most common number of children is " + mode);
		
	}
}
