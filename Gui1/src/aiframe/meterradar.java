package aiframe;

import java.awt.Color;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class meterradar 
{
	public static JLayeredPane layeredPane;
	public static JPanel panel;
	public static JPanel panel_1;
	public static JPanel panel_2;
	public static JPanel panel_3;
	public static JPanel panel_4;
	public static JPanel panel_5;
	
public void main() 
{
	layeredPane = new JLayeredPane();
	layeredPane.setBorder(new LineBorder(new Color(225, 225, 225), 2));
	
	layeredPane.setBounds(1145, 425, 126, 212);
	layeredPane.setVisible(false);
	
	
	Frame.frame.getContentPane().add(layeredPane);
	
	int p=800;
	
	 panel = new JPanel();
	if (p>=500)
	{
		panel.setBackground(new Color(255, 0, 0));
	}
	else 
	{
	    panel.setBackground(Color.LIGHT_GRAY);
	}
	panel.setBounds(10, 11, 106, 23);
	panel.setVisible(false);
	layeredPane.add(panel);
	
	
	
	
	 panel_1 = new JPanel();
	if (p>=400)
	{
		panel_1.setBackground(new Color(255, 140, 0));
	}
	else 
	{
	    panel_1.setBackground(Color.LIGHT_GRAY);
	}
    panel_1.setBounds(10, 45, 106, 23);
	panel_1.setVisible(false);
	layeredPane.add(panel_1);
	
	 panel_2 = new JPanel();
	if (p>250)
	{
		panel_2.setBackground(Color.YELLOW);
	}
	else 
	{
	    panel_2.setBackground(Color.LIGHT_GRAY);
	}
	panel_2.setBounds(10, 79, 106, 23);
	panel_2.setVisible(false);
	layeredPane.add(panel_2);
	
	 panel_3 = new JPanel();
	if (p>=150)
	{
		panel_3.setBackground(new Color(0, 255, 0));
	}
	else 
	{
	    panel_3.setBackground(Color.LIGHT_GRAY);
	}
	
	panel_3.setBounds(10, 113, 106, 23);
	layeredPane.add(panel_3);
	panel_3.setVisible(false);
	
	 panel_4 = new JPanel();
	if (p>=100)
	{
		panel_4.setBackground(new Color(0, 204, 0));
	}
	else 
	{
	    panel_4.setBackground(Color.LIGHT_GRAY);
	}
	panel_4.setBounds(10, 147, 106, 23);
	panel_4.setVisible(false);
	layeredPane.add(panel_4);
	
	 panel_5 = new JPanel();
	if (p>=50)
	{
		panel_5.setBackground(new Color(0, 204, 0));
	}
	else 
	{
	    panel_5.setBackground(Color.LIGHT_GRAY);
	}
	panel_5.setBounds(10, 181, 106, 23);
	layeredPane.add(panel_5);
	panel_5.setVisible(false);	
}
}
