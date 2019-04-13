/**************************************************
 * C16704549, Max Blennerhassett
 * 
 * File class, opens and closes files
 **************************************************/

package mySearchEngine;

import java.io.BufferedReader; 
import java.io.File; // For managing files 
import java.io.FileNotFoundException; // For managing file errors
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner; 

public class FileHandler extends IOException
{
	
	private String str;
	private int count;
	private String strSearch;
	private File tempFile;
	private String fileName;
		
	//Constructor
	public FileHandler(String strSearch, String fileName) 
	{
		this.strSearch 	= strSearch;
		this.fileName 	= fileName;
	}


	public int scanFile()
	{
		strSearch = strSearch.toLowerCase(Locale.ENGLISH);// Converting the searched term to lower case
		setCount(0);//resets count
		
		try 
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			while ((str = br.readLine()) !=null) //Reads the txt line by line 
			{
				System.out.println(str);
				int lastIndex = 0;//Keeps track of the position 
				str = str.toLowerCase(Locale.ENGLISH);// Converting each line to lowercase to be compared
				
				while(lastIndex != -1) // Will loop if the index does not equal -1
				{
				    lastIndex = str.indexOf(strSearch,lastIndex);
				    
				    if(lastIndex != -1)
				    {
				        setCount(getCount() + 1);
				        lastIndex += strSearch.length();
				        System.out.println(getCount());
				    }//end of if
				    
				 
				}//end of nested while
				
			}//end of while
			
		}//end of try
		catch(IOException e)
		{
			System.out.println("file not found");
		}//end of catch()
		
		System.out.println("Number of matches = " + getCount());
		
		return getCount();
	
	}//end of scanFile()


	public int getCount() 
	{
		return count;
	}


	public void setCount(int count) 
	{
		this.count = count;
	}
}//end of FileHandler()

	

