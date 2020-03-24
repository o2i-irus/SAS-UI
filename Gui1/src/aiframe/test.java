package aiframe;

import aiframe.Frame;
import aiframe.radar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class test {
	public static String s;
	public static JButton hell;

	static void hello() {
		String s = "hello";

		JButton hell = new JButton();
		hell.setBounds(23, 100, 100, 100);
        Frame.frame.getContentPane().add(hell);
          hell.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
			radar.h.setVisible(true);	
		
			}
			});
	}
}
