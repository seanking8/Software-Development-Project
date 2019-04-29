/* Filename: Two.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;

public class Two{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num1, num2;

		System.out.print("Enter first number: ");
			num1 = input.nextInt();
		System.out.print("Enter second number: ");
			num2 = input.nextInt();

		if((num1 == 2)&&(num2 == 2)){
			System.out.println("Both numbers equal 2.");
		}else if((num1 == 2)||(num2 == 2)){
			if(num1 == 2){
				System.out.println("The first number is equal to 2.");
			}else{
				System.out.println("The second number is equal to 2.");
			}
		}else{
			System.out.println("Neither of the numbers is equal to 2.");
		}
    } //end of main method
} //end of class