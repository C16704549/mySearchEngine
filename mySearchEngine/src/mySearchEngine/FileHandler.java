/**************************************************
 * C16704549, Max Blennerhassett 
 * 
 * File class, opens and closes files
 **************************************************/

package mySearchEngine;

import java.io.BufferedReader;  
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class FileHandler extends IOException
{
	
	//Variables
	private String str;
	private int count;
	private String strSearch;
	private String fileName;
	
		
	//Constructor
	public FileHandler(String strSearch, String fileName) 
	{
		this.strSearch 	= strSearch;
		this.fileName 	= fileName;
	}

	//Method that does all of the work
	public void scanFile()
	{
		strSearch = strSearch.toLowerCase(Locale.ENGLISH);// Converting the searched term to lower case
		setCount(0);//resets count
		
		try 
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			while ((str = br.readLine()) !=null) //Reads the txt line by line 
			{
				int lastIndex = 0;//Keeps track of the position 
				str = str.toLowerCase(Locale.ENGLISH);// Converting each line to lowercase to be compared
				
				while(lastIndex != -1) // Will loop if the index does not equal -1
				{
				    lastIndex = str.indexOf(strSearch,lastIndex);
				    
				    if(lastIndex != -1)
				    {
				        setCount(getCount() + 1);
				        lastIndex += strSearch.length();
				     // DELETE THIS System.out.println(getCount());
				    }
				    
				}
					
			}
			
			br.close(); //closes the reader to avoid memory leaks
			
		}
		//in case of error 
		catch(IOException e)
		{
			System.out.println("file not found");
		}
		
		
	
	}


	//Getters and setters
	public int getCount() 
	{
		return count;
	}


	public void setCount(int count) 
	{
		this.count = count;
	}


}//end of FileHandler()

	

