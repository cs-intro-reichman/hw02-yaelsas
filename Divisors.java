/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// gets an integer from the user
		int x = Integer.parseInt(args[0]);
		// checks if x is positive or negative
		
		if ( x >= 0 ) {
		    for (int i = 1; i <= x; i++) { // checks if i is a divisor of x then prints i
			     if (x % i == 0) {
				    System.out.println(i); 
			    }
		    }
		} else {
			for (int i = -1; i >= x; i--) {
				if (x % i == 0) {
					System.out.println(i * (-1)); //checks if i is a divisor of x then prints i as positive value
				}
			}
		}
		
	}
}
