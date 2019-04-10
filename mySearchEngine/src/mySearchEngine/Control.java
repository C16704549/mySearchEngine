/**************************************************
 * C16704549, Max Blennerhassett
 * 
 * Main class of the program, takes User input
 **************************************************/

package mySearchEngine;

import java.util.Scanner; // To read user input
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;

public class Control {
	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("temp.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while ((str = br.readLine()) !=null)
			{
				System.out.println(str);
			}
		}
		catch(IOException e){
			System.out.println("file not found");
		}


	}
}
	
        

