package aiframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  
import javax.swing.DropMode;
import java.awt.Canvas;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;


public class Frame {

	private JFrame frame;
	private JTextField txtCamera;
	private JTextField txtCamera_3;
	private JTextField txtCamera_2;
	private JTextField txtCamera_1;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCamera_2 = new JTextField();
		txtCamera_2.setEditable(false);
		txtCamera_2.setText("Camera 3");
		txtCamera_2.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCamera_2.setColumns(10);
		txtCamera_2.setBounds(663, 664, 86, 20);
		frame.getContentPane().add(txtCamera_2);
		txtCamera_2.setBorder(null);
		txtCamera_2.setBackground(Color.WHITE);
		
		txtCamera = new JTextField();
		txtCamera.setBackground(null);
		txtCamera.setEditable(false);
		txtCamera.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCamera.setText("Camera 1");
		txtCamera.setBounds(663, 82, 86, 20);
		frame.getContentPane().add(txtCamera);
		txtCamera.setColumns(10);
		txtCamera.setBorder(null); 
		
		txtCamera_3 = new JTextField();
		txtCamera_3.setEditable(false);
		txtCamera_3.setText("Camera 2");
		txtCamera_3.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCamera_3.setColumns(10);
		txtCamera_3.setBounds(1047, 82, 86, 20);
		frame.getContentPane().add(txtCamera_3);
		txtCamera_3.setBorder(null);
		txtCamera_3.setBackground(null);
		
		txtCamera_1 = new JTextField();
		txtCamera_1.setEditable(false);
		txtCamera_1.setText("Camera 4");
		txtCamera_1.setFont(new Font("Arial", Font.PLAIN, 18));
		txtCamera_1.setColumns(10);
		txtCamera_1.setBounds(1047, 664, 86, 20);
		frame.getContentPane().add(txtCamera_1);
		txtCamera_1.setBorder(null);
		txtCamera_1.setBackground(null);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(Color.BLACK);
		canvas_3.setBounds(559, 386, 352, 272);
		frame.getContentPane().add(canvas_3);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(559, 108, 352, 272);
		frame.getContentPane().add(canvas);
		
		Canvas canvas_4 = new Canvas();
		canvas_4.setBackground(Color.BLACK);
		canvas_4.setBounds(201, 253, 352, 272);
		frame.getContentPane().add(canvas_4);
		
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(Color.BLACK);
		canvas_1.setBounds(917, 108, 352, 272);
		frame.getContentPane().add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(Color.BLACK);
		canvas_2.setBounds(917, 386, 352, 272);
		frame.getContentPane().add(canvas_2);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		layeredPane.setBounds(53, 156, 126, 212);
		layeredPane.setVisible(false);
		
		
		frame.getContentPane().add(layeredPane);
		
		int p=0;
		
		JPanel panel = new JPanel();
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
		
		
		
		
		JPanel panel_1 = new JPanel();
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
		
		JPanel panel_2 = new JPanel();
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
		
		JPanel panel_3 = new JPanel();
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
		
		JPanel panel_4 = new JPanel();
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
		
		JPanel panel_5 = new JPanel();
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
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(516, 48, 409, 340);
		frame.getContentPane().add(panel_6);
		panel_6.setVisible(false);
		
		
		
		
		JButton btnNewButton = new JButton("Cameras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCamera.setVisible(true);
				txtCamera_1.setVisible(true);
				txtCamera_2.setVisible(true);
				txtCamera_3.setVisible(true);
				canvas.setVisible(true);
				canvas_1.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				canvas_4.setVisible(true);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				layeredPane.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 11, 126, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnRadar = new JButton("Radar");
		btnRadar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				txtCamera.setVisible(false);
				txtCamera_1.setVisible(false);
				txtCamera_2.setVisible(false);
				txtCamera_3.setVisible(false);
				canvas.setVisible(false);
				canvas_1.setVisible(false);
				canvas_2.setVisible(false);
				canvas_3.setVisible(false);
				canvas_4.setVisible(false);
				panel.setVisible(true);
				panel_1.setVisible(true);
				panel_2.setVisible(true);
				panel_3.setVisible(true);
				panel_4.setVisible(true);
				panel_5.setVisible(true);
				panel_6.setVisible(true);
				layeredPane.setVisible(true);
			}
		});
		btnRadar.setBounds(146, 11, 126, 40);
		frame.getContentPane().add(btnRadar);
		
	
		
			}
}

