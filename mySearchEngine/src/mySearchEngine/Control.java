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
	
	public int termCount;
	public static String str;
	static String strSearch = "hello";
	static int count;
	
	public static void main(String[] args) throws IOException {
		
		try 
		{
			FileReader fr = new FileReader("temp.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while ((str = br.readLine()) !=null) //Reads the txt line by line
			{
				System.out.println(str);
				int lastIndex = 0;//Keeps track of the position 
				
				while(lastIndex != -1)
				{

				    lastIndex = str.indexOf(strSearch,lastIndex);

				    if(lastIndex != -1)
				    {
				        count ++;
				        lastIndex += strSearch.length();
				    }
				
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("file not found");
		}
		
		System.out.println("Number of matches = " + count);
	}
}


	
        

