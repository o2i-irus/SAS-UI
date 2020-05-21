package aiframe;

import java.awt.Color;

import javax.swing.*;
public class barcpuram {
	 final int MAX = 100;
	 public int intcpu;
	 public static JProgressBar cpumeter;
	 public static JProgressBar rammeter;
	 public void main()
    
{
	 cpumeter = new JProgressBar();
	 cpumeter.setMinimum(0);
	 cpumeter.setMaximum(100);	
	 cpumeter.setBackground(null);
	 cpumeter.setForeground(Color.YELLOW);
	 cpumeter.setStringPainted(true);
	 cpumeter.setBounds(500,17,180,20);
	 cpumeter.setString("CPU");
	
	 cpumeter.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
     Frame.frame.getContentPane().add(cpumeter);
    
    rammeter = new JProgressBar();
    rammeter.setMinimum(0);
    rammeter.setMaximum(100);
    rammeter.setBackground(null);
    rammeter.setForeground(Color.YELLOW);
    rammeter.setStringPainted(true);
    rammeter.setBounds(500, 39,180,20);
    rammeter.setString("RAM");
    rammeter.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    Frame.frame.getContentPane().add(rammeter);
    
   
}
}