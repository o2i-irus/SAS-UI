package aiframe;




import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.*;
import java.util.Calendar;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Font;
//import aiframe.Frame;


public class clock {
	public static JTextField txt;
	public static JTextPane del;
	public static  int formattedDate1;
	public static  int formattedDate2;
	public static  int delay;
	public static String d;
//	{
     //   new clock();
 // }
    public static JPanel clpanel;
    public void clockmain() {
    	

    	 txt = new JTextField();
    	txt.setBackground(null);
    	txt.setForeground(Color.BLACK);
    	txt.setVisible(true);
    	txt.setEditable(false);
    	txt.setBounds(1160, 22, 100, 40);
    	txt.setBackground(null);
        txt.setForeground(Color.YELLOW);
        txt.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
	    txt.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    	Frame.frame.getContentPane().add(txt);
    	
    	
    	Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
     	     
            	LocalTime t = LocalTime.now();
            	
        	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        	   String formattedDate = t.format(myFormatObj);
        	     txt.setText("  "+formattedDate);
        	
            }
        });
    	timer.setRepeats(true);
    	 timer.setCoalesce(true);
         timer.start();
    	
  
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    	
    	
    	
}
 

