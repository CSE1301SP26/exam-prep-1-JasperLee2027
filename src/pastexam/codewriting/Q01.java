package pastexam.codewriting;

import java.util.Scanner;

public class Q01 {

	/*
	 * Linear algebra often uses “triangular” arrays. 
	 * An upper triangular array is a square 2D
	 * array with zero values below the diagonal 
	 * and non-zero values at and above it, like:
	 * 
	 *    1 1 1 1 1
	 *    0 1 1 1 1
	 *    0 0 1 1 1
	 *    0 0 0 1 1
	 *    0 0 0 0 1
	 *    
	 * Provide code that will create an n x n
	 * upper triangular array with all non-zero
	 * elements initialized to 1.0.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Array size: ");
		int n = in.nextInt();
		in.close();

		//start changes
		double triangle[][] = new double [n][n];
		for (int row=0; row<n;row++) {
			 for (int col=0; col<n;col++) {
			 if (row>col) {
				 triangle [row][col] = 0.0;
			 }
				else {
					triangle [row][col] = 1.0;
				 }
				 }
		}
		//end changes
	}
}
