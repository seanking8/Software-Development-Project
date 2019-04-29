/* Filename: Months.java
	Author: Seán King
	Last modified: 29/04/19 */

public class Months{
    public static void main(String[] args){
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

		for(int i=0; i<12; i++){
			if(months[i].contains("r")){
				System.out.println(months[i]);
			}
		}
    } //end of main method
} //end of class