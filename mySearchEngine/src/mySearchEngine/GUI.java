/**************************************************
 * C16704549, Max Blennerhassett 
 * 
 * GUI Class, creates the user interface
 **************************************************/

package mySearchEngine;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener, MouseListener
{

	//GUI Components
	private JButton search;
	private JPanel panel;
	private JLabel label;
	private JTextField textF;
	
	//The desired term
	private String strSearch;
	 
	//Temporary variables for program function
	private String fileName;
	public int finCount;
	private int i = 1;
	 
	//For listing/storage
	private String file1 = "Brexit.txt";
	private String file2 = "JulianAssange";
	private String file3 = "LottoWinnerSurprisesWife.txt";
	private String file4 = "OmarAlBashir";
	private String file5 = "SouthKoreaCriminalisingAbortion";
	
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	 
	 
	 GUI(String name)
	 {
		 super(name);
		 setSize(800,800);
		 
		 setLayout(new FlowLayout());
		 
		 search = new JButton("Search");
		 search.addActionListener(this);

		 textF = new JTextField("                          "); 
		 textF.setToolTipText("Enter desired search term");
		 textF.addActionListener(this);
		 
		 add(textF);
		 add(search);
		 
		 
		 setVisible(true);
	 }

	//Actions 
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		//User hits search 
		if 	(event.getSource() == search)
		    {	
		    	strSearch = textF.getText();
		    	strSearch = strSearch.replace(" ","");//Removes spaces from the search term
		    	JOptionPane.showMessageDialog(this, "You entered " + strSearch);	
		    	
		    	FileHandler fileSearch 	= new FileHandler(strSearch, file1, count1);
		    	FileHandler fileSearch2 = new FileHandler(strSearch, file2, count2);
		    	FileHandler fileSearch3 = new FileHandler(strSearch, file3, count3);
		    	FileHandler fileSearch4	= new FileHandler(strSearch, file4, count4);
		    	FileHandler fileSearch5	= new FileHandler(strSearch, file5, count5);
		    	
		    	JOptionPane.showMessageDialog(this, "Your search term was: " + strSearch + "\n" + 
			    		file1 + "returned it " + count1 + " times\n" +
			    		file2 + "returned it " + count2 + " times\n" +
			    		file3 + "returned it " + count3 + " times\n" +		
			    		file4 + "returned it " + count4 + " times\n" +											
			    		file5 + "returned it " + count5 + " times");
		    	
		    }
		    	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	 
	
}
