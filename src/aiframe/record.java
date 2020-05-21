package aiframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class record {
	public static JButton strec;
	public static JButton stprec;
public void recordmain() 
{

    strec = new JButton("RECORD ON");
    strec.setBounds(764, 374, 100, 40);
    strec.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	
    strec.setFocusPainted(false);
    strec.setBackground(null);
    strec.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
    strec.setForeground(Color.YELLOW);
    strec.setVisible(false);
	Frame.frame.getContentPane().add(strec);
	strec.addActionListener(
	         new ActionListener() {
	            public void actionPerformed( ActionEvent e )
	            {
	            	notifications.notif.setText(null);
	            	notifications.notif.setText("RECORDING");
	            }
	              
	         });
	
	
	stprec = new JButton("RECORD OFF");
    stprec.setBounds(900, 374, 100, 40);
    stprec.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	
    stprec.setFocusPainted(false);
    stprec.setBackground(null);
    stprec.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
    stprec.setForeground(Color.YELLOW);
    stprec.setVisible(false);
	Frame.frame.getContentPane().add(stprec);
	stprec.addActionListener(
	         new ActionListener() {
	            public void actionPerformed( ActionEvent e )
	            {
	            	notifications.notif.setText(null);
	            	notifications.notif.setText("RECORDING STOPPED");
	            }
	              
	         });
}
}
