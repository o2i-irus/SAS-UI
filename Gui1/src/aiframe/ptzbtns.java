package aiframe;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class ptzbtns {
	public static JButton left;
	public static JButton right;
	public static JButton up;
	public static JButton down;
	public static JToggleButton toggleButton;
	public static JTextField txtptzstate;
	
	public void ptzbtnsmain() 
	{
		
		
		
		ImageIcon leftico = new ImageIcon(this.getClass().getResource("/left.png"));
		left = new JButton();
		left.setIcon(leftico);
		left.setBounds(20, 300, 55, 55);
		left.setVisible(false);
		left.setBackground(null);
		left.setFocusPainted(false);
		left.setBorder(BorderFactory.createLineBorder(Color.YELLOW));            
	    Frame.frame.getContentPane().add(left);
	    left.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{  System.out.println("move left");
	    }
	});
		
		ImageIcon rightico = new ImageIcon(this.getClass().getResource("/right.png"));
		right = new JButton();
		right.setIcon(rightico);
		right.setBounds(575, 300, 55, 55);
		right.setVisible(false);
		right.setBackground(null);
		right.setFocusPainted(false);
		right.setFocusPainted(false);
		right.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		Frame.frame.getContentPane().add(right);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ System.out.println("move right");
		   }
		});
		
		
		ImageIcon upico = new ImageIcon(this.getClass().getResource("/up.png"));
		up = new JButton();
		up.setIcon(upico);
		up.setBounds(300, 38, 55, 55);
		up.setVisible(false);
		up.setBackground(null);
		up.setFocusPainted(false);
		up.setFocusPainted(false);
		up.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		Frame.frame.getContentPane().add(up);
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("move up");
			}
		});
		
		
		ImageIcon downico = new ImageIcon(this.getClass().getResource("/down.png"));
		down = new JButton();
		down.setIcon(downico);
		down.setBounds(300, 560, 55, 55);
		down.setVisible(false);
		down.setBackground(null);
		down.setFocusPainted(false);
		down.setFocusPainted(false);
		down.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		Frame.frame.getContentPane().add(down);
		down.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) 
			{System.out.println("move down");
		}
		});
		
		 toggleButton = new JToggleButton();
		ItemListener itemListener = new ItemListener() { 
			  
            // itemStateChanged() method is unvoked automatically 
            // whenever you click or un click on the Button. 
            public void itemStateChanged(ItemEvent itemEvent) 
            { 
  
                // event is generated in button 
                int state = itemEvent.getStateChange(); 
  
                // if selected print selected in console 
                if (state == ItemEvent.SELECTED) { 
                    //System.out.println("Selected"); 
                	toggleButton.setBackground(Color.yellow);
                	txtptzstate.setText("AUTOMATIC MODE");
                } 
                else { 
  
                    // else print deselected in console 
                   // System.out.println("Deselected"); 
                	txtptzstate.setText("MANNUAL MODE");
                	toggleButton.setBackground(Color.ORANGE);
                } 
            } 
        }; 
        toggleButton.addItemListener(itemListener); 
        toggleButton.setBounds(150, 580, 80 ,80);
        toggleButton.setVisible(false);
        toggleButton.setBackground(Color.yellow);
        toggleButton.setFocusPainted(false);
        toggleButton.setBorderPainted(false);
        
        
        Frame.frame.getContentPane().add(toggleButton); 
        
        txtptzstate = new JTextField();
        txtptzstate.setBounds(250, 638, 200, 20);
        txtptzstate.setVisible(false);
    	
    	
        txtptzstate.setColumns(10);
        txtptzstate.setForeground(Color.YELLOW);
        txtptzstate.setText("AUTOMATIC MODE");
        txtptzstate.setBackground(null);
        txtptzstate.setEditable(false);
        
        txtptzstate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
        txtptzstate.setHighlighter( null );
        txtptzstate.setBorder(null);
    	Frame.frame.getContentPane().add(txtptzstate);
        
        
        
		
	}

}
