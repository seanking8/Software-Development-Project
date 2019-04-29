/* Filename: BigNumber.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;

public class BigNumber{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;

		System.out.print("Enter a number: ");
			number = input.nextInt();
		if(number > 1000000){
			System.out.println("That is a big number.");
		}
    } //end of main method
} //end of class