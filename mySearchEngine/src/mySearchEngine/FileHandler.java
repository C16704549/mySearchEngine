/**************************************************
 * C16704549, Max Blennerhassett
 * 
 * File class, opens and closes files
 **************************************************/

package mySearchEngine;

import java.io.File; // For managing files
import java.io.FileNotFoundException; // For managing file errors
import java.util.Scanner; 

public class FileHandler 
{

	String fileName; // To store the file name in
	File myFile; // File type
	Scanner myScanner;

	// Constructor
	FileHandler (String fileName)
	{
		
		this.fileName = fileName;
		
	}
	
	// Connection
	void establishConnection()
	{
		myFile = new File(fileName);
	}
	
	// Read and return (test)
	String [] readFile()
	{
		
		String[] values = new String[6];
	    try
		{
	    	int i = 0;
	    	myScanner = new Scanner(myFile); 
			 while (myScanner.hasNextLine())
			    {
			      
				 values[i] = myScanner.nextLine();
			      i++;
			    }
		}
		catch (FileNotFoundException e)
		{
			System.out.println("run time error " + e.getMessage());
		}
	    finally
	    {
	        return values;
	    }
		
	}

}
