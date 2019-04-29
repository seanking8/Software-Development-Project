/* Filename: NameAge.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;

public class NameAge{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		int i = 1;

		System.out.print("Enter your name: ");
			name = input.nextLine();
		System.out.print("Enter your age: ");
			age = input.nextInt();

		while(i <= age){
			System.out.println(i+". "+name);
			i++;
		}
    } //end of main method
} //end of class