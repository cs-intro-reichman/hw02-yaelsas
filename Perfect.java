/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = 1;
		String str = n + " is a perfect number since " + n + " = " + 1;
		// checks for all of n's divisors 
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sum += i; // sums all the divisors
				str += " + " + i; // adds every divisor to the answer
			}
		}
		// checks if n is perfect and prints the answer
		if (sum == n) {
			System.out.println(str);
		} else {
			System.out.println(n + " is not a perfect number");
		}
	}
}
