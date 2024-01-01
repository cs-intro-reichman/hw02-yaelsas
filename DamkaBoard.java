/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		// gets board size from the user
		int n = Integer.parseInt(args[0]);
		// prints the board
		for (int i = 1; i <= n ; i++ ) {
			// prints even lines
			if ( i % 2 == 0) {
			    for (int j = 0; j < n ; j++ ) {
				    System.out.print(" *");
			    }
			} else {     // prints odd lines
				for (int j = 0; j < n ; j++ ) {
					System.out.print("* ");
				} 
			}
			// moves to a new line
			System.out.println();
		}
	}
}
