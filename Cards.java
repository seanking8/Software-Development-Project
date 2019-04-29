/* Filename: Cards.java
	Author: Seán King
	Last modified: 29/04/19 */

import  java.util.Random;

public class Cards{
	public static void main(String[] args){
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