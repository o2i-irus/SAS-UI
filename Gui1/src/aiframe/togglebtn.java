package aiframe;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JToggleButton;

public class togglebtn {
	public static JToggleButton camtog;
public void main()
{
	
	camtog = new JToggleButton();
	ItemListener itemListener = new ItemListener() { 
		  
        // itemStateChanged() method is unvoked automatically 
        // whenever you click or un click on the Button. 
       public void itemStateChanged(ItemEvent itemEvent) 
       { 

            // event is generated in button 
            int state = itemEvent.getStateChange(); 

            // if selected print selected in console 
           if (state == ItemEvent.SELECTED) { 
               canvas.campanel1.setVisible(true);
               canvas.campanel2.setVisible(true);
               canvas.campanel3.setVisible(true);
               canvas.campanel4.setVisible(true);
               canvas.campanel5.setVisible(true);
               canvas.campanel1p.setVisible(false);
               canvas.campanel2p.setVisible(false);
               canvas.campanel3p.setVisible(false);
               canvas.campanel4p.setVisible(false);
               canvas.campanel5p.setVisible(false);
            } 
            else { 
            	 canvas.campanel1.setVisible(false);
                 canvas.campanel2.setVisible(false);
                 canvas.campanel3.setVisible(false);
                 canvas.campanel4.setVisible(false);
                 canvas.campanel5.setVisible(false);
                 canvas.campanel1p.setVisible(true);
                 canvas.campanel2p.setVisible(true);
                 canvas.campanel3p.setVisible(true);
                 canvas.campanel4p.setVisible(true);
                 canvas.campanel5p.setVisible(true);
              } 
                
            } 
         
    }; 
    camtog.addItemListener(itemListener); 
    camtog.setBounds(1170, 450, 80 ,80);
    camtog.setVisible(true);
    camtog.setBackground(Color.yellow);
    camtog.setFocusPainted(false);
    camtog.setBorderPainted(false);
    
    
    Frame.frame.getContentPane().add(camtog); 
    }
}
