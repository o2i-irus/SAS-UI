package aiframe;




import java.awt.event.ActionListener;
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
//	{
     //   new clock();
 // }
    public static JPanel clpanel;
    public void clockmain() {
    	
    	 
    	
    	
    	
    	
    // EventQueue.invokeLater(new Runnable() {
          // @Override
         // public void run() {
                 //clpanel= new JPanel();
            	//clpanel.add(new TestPane());
                //clpanel.setBounds(1160, 22, 100, 40);
                //clpanel.setVisible(true);
                //clpanel.setBackground(null);
                //clpanel.setForeground(Color.YELLOW);
                //clpanel.setVisible(true);
    		    //clpanel.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
    		    //clpanel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
                //Frame.frame.getContentPane().add(clpanel);
                Frame.frame.getContentPane().add(new TestPane());
               
                
    		
    		    
               
  //          }

//        }); 
   
        }   

     class TestPane extends JPanel {

        private DigitPane hour;
        private DigitPane min;
        private DigitPane second;
        private JLabel[] seperator;

        private int tick = 0;

        public TestPane() {
            setBackground(null);
            setBounds(1160, 22, 100, 40);
            setBorder(BorderFactory.createLineBorder(Color.YELLOW));
          
            hour = new DigitPane();
            min = new DigitPane();
            second = new DigitPane();
            seperator = new JLabel[]{new JLabel(":"), new JLabel(":")};
           
            add(hour);
            add(seperator[0]);
            add(min);
            add(seperator[1]);
            add(second);
           
            hour.setBackground(null);
            min.setBackground(null);
            second.setBackground(null);
            seperator[0].setBackground(null);
            seperator[1].setBackground(null);
            seperator[0].setForeground(Color.yellow);
            seperator[1].setForeground(Color.yellow);
            
           
            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Calendar cal = Calendar.getInstance();
                    hour.setValue(cal.get(Calendar.HOUR_OF_DAY));
                    min.setValue(cal.get(Calendar.MINUTE));
                    second.setValue(cal.get(Calendar.SECOND));

                    if (tick % 2 == 1) {
                        seperator[0].setText(":");
                        seperator[1].setText(":");
                    } else {
                        seperator[0].setText(":");
                        seperator[1].setText(":");
                    }
                    tick++;
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.start();
        }

    }

     class DigitPane extends JPanel {
    	
    	
        private int value;
        
        @Override
        public Dimension getPreferredSize() {
            FontMetrics fm = getFontMetrics(getFont());
            return new Dimension(fm.stringWidth("00"), fm.getHeight());
            
        }

        public void setValue(int aValue) {
            if (value != aValue) {
                int old = value;
                value = aValue;
                firePropertyChange("value", old, value);
                repaint();
                
            }
        }

        public int getValue() {
            return value;
        }

       protected String pad(int value) {
        	
            StringBuilder sb = new StringBuilder(String.valueOf(value));
            
            while (sb.length() < 2) {
               sb.insert(0, "0");
            }
         
            return sb.toString();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); 
           String text = pad(getValue());
           
            FontMetrics fm = getFontMetrics(g.getFont());
            
            int x = (getWidth() - fm.stringWidth(text)) / 2;
            int y = ((getHeight()- fm.getHeight()) / 2) + fm.getAscent();
            
            g.setColor(Color.yellow);
         
            g.setFont(new Font("Bahnschrift", Font.PLAIN, 11));
            g.drawString(text, x, y);
            
            
        }        
    }    
}
 

