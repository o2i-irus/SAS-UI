package aiframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class txtcpuram {
	public static JTextField txtram;
	public static JTextField txtcpu;
public void txtmain()
{
	txtcpu = new JTextField();
	txtcpu.setBounds(683, 17, 50, 20);
	txtcpu.setVisible(true);
	//txtcpu.setText(scpu);
	

	txtcpu.setForeground(Color.YELLOW);
	txtcpu.setBackground(null);
	txtcpu.setEditable(true);
	txtcpu.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtcpu.setHighlighter( null );
	txtcpu.setBorder(null);
	Frame.frame.getContentPane().add(txtcpu);
	
	txtram = new JTextField();
	txtram.setBounds(683, 39, 50, 20);
	txtram.setVisible(true);
	//txtram.setText(cpuload.sram);
	
	txtram.setColumns(10);
	txtram.setForeground(Color.YELLOW);
	txtram.setBackground(null);
	txtram.setEditable(true);
	txtram.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtram.setHighlighter( null );
	txtram.setBorder(null);
	Frame.frame.getContentPane().add(txtram); 
	}
}
