package aiframe;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
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
	public static JLayeredPane btnpane;
	public void ptzbtnsmain() 
	{
		
		
		btnpane = new JLayeredPane();
		btnpane.setBounds(550,470,250,228);
		btnpane.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		btnpane.setVisible(false);
		Frame.frame.getContentPane().add(btnpane);
		
		
		
		ImageIcon leftico = new ImageIcon(this.getClass().getResource("/left.png"));
		left = new JButton();
		left.setIcon(leftico);
		left.setBounds(10,80,55, 55);
		left.setVisible(false);
		left.setBackground(null);
		left.setFocusPainted(false);
		left.setBorder(BorderFactory.createLineBorder(Color.YELLOW));            
	    btnpane.add(left);
	    left.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) 
	    	{  new ptzcontrols().left();
	    }
	});
		
		ImageIcon rightico = new ImageIcon(this.getClass().getResource("/right.png"));
		right = new JButton();
		right.setIcon(rightico);
		right.setBounds(185, 80, 55, 55);
		right.setVisible(false);
		right.setBackground(null);
		right.setFocusPainted(false);
		right.setFocusPainted(false);
		right.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		btnpane.add(right);
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ new ptzcontrols().right();
		   }
		});
		
		
		ImageIcon upico = new ImageIcon(this.getClass().getResource("/up.png"));
		up = new JButton();
		up.setIcon(upico);
		up.setBounds(95, 10, 55, 55);
		up.setVisible(false);
		up.setBackground(null);
		up.setFocusPainted(false);
		up.setFocusPainted(false);
		up.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		btnpane.add(up);
		up.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new	ptzcontrols().up();
			}
		});
		
		
		ImageIcon downico = new ImageIcon(this.getClass().getResource("/down.png"));
		down = new JButton();
		down.setIcon(downico);
		down.setBounds(95, 160, 55, 55);
		down.setVisible(false);
		down.setBackground(null);
		down.setFocusPainted(false);
		down.setFocusPainted(false);
		down.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		btnpane.add(down);
		down.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) 
			{new ptzcontrols().down();
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
                	txtptzstate.setText("AUTOMATIC TRACK");
                } 
                else { 
  
                    // else print deselected in console 
                   // System.out.println("Deselected"); 
                	txtptzstate.setText("MANNUAL TRACK");
                	toggleButton.setBackground(Color.ORANGE);
                } 
            } 
        }; 
        toggleButton.addItemListener(itemListener); 
        toggleButton.setBounds(230, 580, 80 ,80);
        toggleButton.setVisible(false);
        toggleButton.setBackground(Color.yellow);
        toggleButton.setFocusPainted(false);
        toggleButton.setBorderPainted(false);
        
        
        Frame.frame.getContentPane().add(toggleButton); 
        
        txtptzstate = new JTextField();
        txtptzstate.setBounds(320, 610, 200, 20);
        txtptzstate.setVisible(false);
    	
    	
        txtptzstate.setColumns(10);
        txtptzstate.setForeground(Color.YELLOW);
        txtptzstate.setText("AUTOMATIC TRACK");
        txtptzstate.setBackground(null);
        txtptzstate.setEditable(false);
        
        txtptzstate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
        txtptzstate.setHighlighter( null );
        txtptzstate.setBorder(null);
    	Frame.frame.getContentPane().add(txtptzstate);
        
        
        
		
	}

}
