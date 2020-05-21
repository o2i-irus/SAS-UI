package aiframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class notifications {
	public static JTextField notif;
	public void main()
	{
		notif = new JTextField();
		
		notif.setText("NOTIFICATIONS");
		notif.setHorizontalAlignment(JTextField.CENTER);
		notif.setBounds(750, 40, 283, 20);
		notif.setColumns(10);
		notif.setForeground(Color.YELLOW);
		notif.setVisible(true);
		notif.setEditable(false);
		notif.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		notif.setHighlighter( null );
		notif.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		notif.setBackground(null);
		Frame.frame.getContentPane().add(notif);	 	
		
	}
}
