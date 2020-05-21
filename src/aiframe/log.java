package aiframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextPane;

public class log {
	public static JTextPane callog;
	public static JTextPane msglog;
public void main()
{
	 callog = new JTextPane();
		callog.setBounds(382, 375 ,350 ,135);
		callog.setText("CALL MESSAGE");
		callog.setVisible(true);
		callog.setForeground(Color.YELLOW);
		callog.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		callog.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		callog.setBackground(null);
		callog.setHighlighter(null);
		callog.setEditable(false);
		callog.setVisible(false);
			Frame.frame.getContentPane().add(callog);
			
			
		 msglog = new JTextPane();
			msglog.setBounds(382, 515 ,350 ,131);
			msglog.setText("SOS MESSAGE");
			msglog.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			msglog.setVisible(true);
			msglog.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			msglog.setBackground(null);
			msglog.setForeground(Color.YELLOW);
			msglog.setHighlighter(null);
			msglog.setEditable(false);
			msglog.setVisible(false);
				Frame.frame.getContentPane().add(msglog);
		
}
}
