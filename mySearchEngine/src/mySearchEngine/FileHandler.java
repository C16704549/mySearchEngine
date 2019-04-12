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
import java.util.Scanner; 

public class FileHandler extends IOException
{
	
	private String str;
	private int count;
	private String strScan;
	private File tempFile;
	private String fileName;
		
	
	public FileHandler(String strSearch) 
	{
		this.strScan = strSearch;
	}


	public void scanFile()
	{
		try 
		{
			FileReader fr = new FileReader("LottoWinnerSurprisesWife.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while ((str = br.readLine()) !=null) //Reads the txt line by line
			{
				System.out.println(str);
				int lastIndex = 0;//Keeps track of the position 
				
				while(lastIndex != -1)
				{
				    lastIndex = str.indexOf(strScan,lastIndex);
				    
				    if(lastIndex != -1)
				    {
				        count ++;
				        lastIndex += strScan.length();
				    }//end of if
				
				}//end of nested while
				
			}//end of while
			
		}//end of try
		catch(IOException e)
		{
			System.out.println("file not found");
		}//end of catch()
		
		System.out.println("Number of matches = " + count);
	}//end of scanFile()
}//end of FileHandler()

	

