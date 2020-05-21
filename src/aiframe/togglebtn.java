package aiframe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;


public class togglebtn {
	public static JRadioButton camtog;
	public static JRadioButton camtog2;

	public static JLayeredPane lb;

public void main()
{
	
	//ButtonGroup bg = new ButtonGroup();
	
	
	camtog = new JRadioButton("RAW" , true);
	camtog.setBounds(1170, 422, 100 ,20);
	camtog.setVisible(true);
	camtog.setBackground(Color.yellow);
	camtog.setFocusPainted(false);
	camtog.setBorderPainted(false);
	 camtog.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        
                
				 camtog.setSelected(true);
                 camtog2.setSelected(false);
                 lb.setVisible(false);  
             	canvas.j4.setBounds(23, 68, 352, 272);
				canvas.j3.setBounds(381, 68, 352, 272);
				canvas.j2.setBounds(739, 68, 352, 272);
			    canvas.j1.setBounds(23, 374, 352, 272);
				canvas.j5.setBounds(381, 374, 352, 272);
				canvas.j4.setVisible(true);
				canvas.j3.setVisible(true);
			    canvas.j5.setVisible(true);
				canvas.j1.setVisible(true);
				canvas.j2.setVisible(true);

	        }

			
	    });

	Frame.frame.getContentPane().add(camtog); 
	
	
	
	camtog2 = new JRadioButton("AI ENABLED" , false);
	camtog2.setBounds(1170, 450, 100 ,20);
	camtog2.setVisible(true);
	camtog2.setBackground(Color.yellow);
	camtog2.setFocusPainted(false);
	camtog2.setBorderPainted(false);
	camtog2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	 test.old=Frame.crnot.getText();
				 Frame.crnot.setText(test.old+"\n"+"AI ENABLED FEED ACTIVATED");
	        	camtog.setSelected(false);
                camtog2.setSelected(true);
	        	canvas.j4.setVisible(false);
				canvas.j3.setVisible(false);
			    canvas.j5.setVisible(false);
				canvas.j1.setVisible(false);
				canvas.j2.setVisible(false);
              lb.setVisible(true);
              canvas.j6.setVisible(true);
              canvas.j7.setVisible(true);
              canvas.j8.setVisible(true);
              canvas.j9.setVisible(true);
              canvas.j10.setVisible(true);
	        }

			
	    });
	Frame.frame.getContentPane().add(camtog2); 
	
	
	
	lb= new JLayeredPane();
	lb.setVisible(false);
	lb.setBounds(10,65,1130,605);
	
    lb.setBorder(null); 
	lb.add(canvas.j6);
	lb.add(canvas.j7);
	lb.add(canvas.j8);
	lb.add(canvas.j9);
	lb.add(canvas.j10);
	Frame.frame.getContentPane().add(lb);
	
	
	

	
	
	
    }
}
