/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String originalStr = args[0];
		String reverseStr = "";
		char mid = '0';
		int n = originalStr.length();
		
		for (int i = n - 1 ; i >= 0 ; i--) {
			// reverse the orginal string
			reverseStr += originalStr.charAt(i) ;
			// find the middle character in the original string
			if ( i == (n - 1) / 2) {
				mid = originalStr.charAt(i);
			}
		}
		
		// prints the reversed string
		System.out.println(reverseStr);
		// prints the mid character
		System.out.println("The middle character is " + mid);
		
	}
}
