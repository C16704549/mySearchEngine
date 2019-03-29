/**************************************************
 * C16704549, Max Blennerhassett
 * 
 * Main class of the program, takes User input
 **************************************************/

package mySearchEngine;

import java.util.Scanner; // To read user input

public class Control 
{

	public static void main(String[] args) 
	{
		
		Scanner object = new Scanner(System.in); // Object to read user input
		System.out.println("Please enter a term to be searched for ");
		
		String searchTerm = object.nextLine(); // Reads input
		System.out.println("Desired search term is: " + searchTerm); // Outputs it
	}

}

