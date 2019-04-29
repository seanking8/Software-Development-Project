/* Filename: Number.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;

public class Number{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;

		System.out.print("Enter a number: ");
			number = input.nextInt();

		if(number > 0){
			System.out.println(number+" is a positive number.");
		}else if(number == 0){
			System.out.println(number+" is zero.");
		}else{
			System.out.println(number+" is a negative number.");
		}
    } //end of main method
} //end of class