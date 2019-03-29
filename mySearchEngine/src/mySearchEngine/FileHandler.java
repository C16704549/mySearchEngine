/**************************************************
 * C16704549, Max Blennerhassett
 * 
 * File class, opens and closes files
 **************************************************/

package mySearchEngine;

import java.io.File; // For managing files
import java.io.FileNotFoundException; // For managing file errors


public class FileHandler 
{

	String fileName; // To store the file name in
	File myFile; // File type

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
	

}
