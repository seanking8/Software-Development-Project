/* Filename: Index.java
	Author: Seán King
	Last modified: 29/04/19 */

import java.util.Scanner;
import  java.util.Random;

public class Index{
    public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int choice = 0;

	while(choice != -1){
		System.out.println("\nPlease select a program to run (-1 to quit): ");
		System.out.println("\n1. Lisa\n2. BigNumber\n3. Number\n4. Two\n5. NameAge\n6. ForLoop\n7. Months\n8. Cards\n");
		System.out.print("Selection: ");

		choice = input.nextInt();

		if(choice == 1){
			String name = "Lisa";
			int age = 9;
			double heightCM = 133.3;
			double weightKG = 27.8;

			System.out.println(name+" is "+age+" years old and is "+heightCM+" centimetres tall.\n"+name+" weighs "+weightKG+" kilograms.");

		}else if(choice == 2){
			int number;

			System.out.print("Enter a number: ");
				number = input.nextInt();
			if(number > 1000000){
			System.out.println("That is a big number.");
			}
		}else if(choice == 3){
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

		}else if(choice == 4){
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

		}else if(choice == 5){
			String name;
			int age;
			int i = 1;

			System.out.print("Enter your name: ");
				name = input.next();
			System.out.print("Enter your age: ");
				age = input.nextInt();

			while(i <= age){
				System.out.println(i+". "+name);
				i++;
			}

		}else if(choice == 6){
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

		}else if(choice == 7){
			String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

			for(int i=0; i<12; i++){
				if(months[i].contains("r")){
					System.out.println(months[i]);
				}
			}

		}else if(choice == 8){
			String[] suit = {"_of_diamonds", "_of_clubs", "_of_hearts", "_of_spades"};
			String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
			String[] deck = new String[52];

			for(int i=0; i < deck.length; i++){
				deck[i] = rank[i%13] + suit[i/13]; //building deck array
			}

			deck = shuffle(deck); //passing deck to shuffle method which returns the deck shuffled
			for(int i=0; i < deck.length; i++){
				System.out.println(deck[i]);
			}

		}else if(choice == -1){
			return;
		}else{
			System.out.println("Selection invalid.");
		}
	}

    } //end of main method

    public static String[] shuffle(String[] deck){
			Random rnd = new Random();
			for(int i = deck.length - 1; i>=0; i--){
				int index = rnd.nextInt(i + 1);
				//simple swap
				String a = deck[index];
				deck[index] = deck[i];
				deck[i] = a;
			}
			return deck;
    } //end of shuffle method
} //end of class