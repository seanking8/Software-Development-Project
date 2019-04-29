/* Filename: ForLoop.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;

		for(int i=1; i<=10; i++){
			System.out.print("Enter number "+i+": ");
				number = input.nextInt();
			if((number % 2) != 0){
				sum += number;
			}
		}
		System.out.println("\nSum of odd numbers is "+sum);
    } //end of main method
} //end of class