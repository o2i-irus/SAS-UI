package aiframe;
import javax.swing.Timer;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import aiframe.Frame;
public class calender {
	public static JTextField dateField;
	 static void calendermain()
	{
		   dateField= new JTextField();
		  
		  
		    dateField.setForeground(Color.YELLOW);
		   	dateField.setBounds(1050, 22, 100, 40);
		    dateField.setVisible(true);
		    dateField.setEditable(false);
		   
		    dateField.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		    dateField.setColumns(10);
		    dateField.setHighlighter( null );
		    dateField.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    dateField.setBackground(null);
		 	Frame.frame.getContentPane().add( dateField);
	
		 	Timer timer = new Timer(1000, new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		 	Calendar now = Calendar.getInstance();
            int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            dateField.setText("" + (month + 1) + "/" + day + "/" + year);
           
		        }
		    });
			timer.setRepeats(true);
			 timer.setCoalesce(true);
		     timer.start();
		 	
		 	
		 	
		 	
		 	
}
}
