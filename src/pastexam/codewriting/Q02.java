package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//start of changes
		System.out.println("input width");
			int width = in.nextInt();

		System.out.println("input length");	
			int length = in.nextInt();
		
		int area= length*width;

		System.out.println(area);


		while (area != 0) {
			System.out.println("input width");
			width = in.nextInt();

			System.out.println("input length");	
			length = in.nextInt();

			area= length*width;
			
			System.out.println(area);
		}
	}
}
