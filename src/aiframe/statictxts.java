package aiframe;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JTextPane;

public class statictxts {
	public static JTextField txtCamera_2;
	public static JTextField txtCamera;
	public static JTextField txtCamera_3;
	public static JTextField txtCamera_1;
	public static JTextField maindash;
	public static JTextField ptz;
	public static JTextPane info;
	public static JTextField company;
	public static JTextField txtmsg;
	public static JTextField txtcall;
	public static JTextField txtsoslog;
	public static JTextField txtGPS;
	public static JTextField txtvideo;
	public static JTextField txtdb;
	public static JTextField txtlog;
	public static JTextField txtsuspobj;
	public static JTextField txtobj;
	
	
public void main()
{
	txtCamera_2 = new JTextField();
	txtCamera_2.setForeground(Color.YELLOW);
	txtCamera_2.setEditable(false);
	txtCamera_2.setText("RIGHT CAMERA");           
	txtCamera_2.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtCamera_2.setColumns(10);
	txtCamera_2.setBounds(858, 346, 130, 20);
	Frame.frame.getContentPane().add(txtCamera_2);
	txtCamera_2.setBorder(null);
	txtCamera_2.setHighlighter( null );
	txtCamera_2.setBackground(null);
	
	txtCamera = new JTextField();
	txtCamera.setForeground(Color.YELLOW);
	txtCamera.setBackground(null);
	txtCamera.setEditable(false);
	txtCamera.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtCamera.setText("LEFT CAMERA");
	txtCamera.setBounds(150, 346, 130, 20);
	Frame.frame.getContentPane().add(txtCamera);
	txtCamera.setHighlighter( null );
	txtCamera.setColumns(10);
	txtCamera.setBorder(null); 
	
	txtCamera_3 = new JTextField();
	txtCamera_3.setForeground(Color.YELLOW);
	txtCamera_3.setEditable(false);
	txtCamera_3.setText("FRONT CAMERA");
	txtCamera_3.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtCamera_3.setColumns(10);
	txtCamera_3.setBounds(500, 346, 135, 20);
	Frame.frame.getContentPane().add(txtCamera_3);
	txtCamera_3.setHighlighter( null );
	txtCamera_3.setBorder(null);
	txtCamera_3.setBackground(null);
	
 
	txtCamera_1 = new JTextField();
	txtCamera_1.setForeground(Color.YELLOW);
	txtCamera_1.setEditable(false);
	txtCamera_1.setText("BACK CAMERA");
	txtCamera_1.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtCamera_1.setColumns(10);
	txtCamera_1.setBounds(500, 652, 130, 20);
	Frame.frame.getContentPane().add(txtCamera_1);
	txtCamera_1.setHighlighter( null );
	txtCamera_1.setBorder(null);
	txtCamera_1.setBackground(null);

	
	
	
	
	
	
	 maindash = new JTextField();
	maindash.setText("MAIN DASHBOARD");
	maindash.setBounds(750, 18, 300, 20);
	Frame.frame.getContentPane().add(maindash);
	maindash.setColumns(10);
	    maindash.setForeground(Color.YELLOW);
		maindash.setBackground(null);
		maindash.setEditable(false);
		maindash.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		maindash.setHighlighter( null );
		maindash.setBorder(null); 
		
		
		
		
		
	
	
	
	
	
	
	ptz = new JTextField();
    ptz.setText("PTZ CAMERA");
    ptz.setBounds(150, 652, 125, 20);
    Frame.frame.getContentPane().add(ptz);
    ptz.setColumns(10);
    ptz.setForeground(Color.YELLOW);
	ptz.setBackground(null);
	ptz.setEditable(false);
	ptz.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	ptz.setHighlighter( null );
	ptz.setBorder(null); 
	
	
	 info = new JTextPane();
	info.setText("AI VEHICLE MOUNTED SURVEILLANCE SYSTEM" + "\n" + "LICENSED TO RAF BN194");
	info.setBounds(10, 12, 430, 50);
	info.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
	info.setForeground(Color.YELLOW);
	info.setVisible(true);
 
	info.setEditable(false);
	info.setBackground(null); 
    info.setHighlighter( null );
    info.setBorder(null);
    Frame.frame.getContentPane().add(info);
    
    
     company = new JTextField();
	company.setText("INDIGENOUS ROBOTIC UNMANNED SYSTEMS [IRUS]");
	company.setBounds(10, 670, 500, 40);
	company.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
	company.setForeground(Color.YELLOW);
	company.setVisible(true);
	company.setEditable(false);
	company.setBackground(null); 
    company.setHighlighter( null );
    company.setBorder(null);
    Frame.frame.getContentPane().add(company);
    
    
    txtmsg = new JTextField();
	txtmsg.setText("MESSAGE");
	txtmsg.setBounds(800, 300, 96, 20);
	txtmsg.setColumns(10);
	txtmsg.setColumns(10);
	txtmsg.setForeground(Color.YELLOW);
	txtmsg.setVisible(false);
	txtmsg.setEditable(false);
	txtmsg.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
	txtmsg.setHighlighter( null );
	txtmsg.setBorder(null);
	txtmsg.setBackground(null);
	Frame.frame.getContentPane().add(txtmsg);
	
	

    txtcall = new JTextField();
	txtcall.setBounds(960, 300, 96, 20);
	txtcall.setColumns(10);
	txtcall.setText("CALL");
	txtcall.setForeground(Color.YELLOW);
	txtcall.setVisible(false);
	txtcall.setEditable(false);
	txtcall.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	txtcall.setHighlighter( null );
	txtcall.setBorder(null);
	txtcall.setBackground(null);
	Frame.frame.getContentPane().add(txtcall);
	
	 txtsoslog = new JTextField();
	    txtsoslog.setForeground(Color.YELLOW);
	    txtsoslog.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	    txtsoslog.setText("LOGGER");
	    txtsoslog.setBounds(130, 652, 160, 20);
	    txtsoslog.setBorder(null);
	    txtsoslog.setBackground(null);
	    txtsoslog.setVisible(false);
	    txtsoslog.setEditable(false);
	    txtsoslog.setHighlighter( null );
	    txtsoslog.setColumns(10);
		Frame.frame.getContentPane().add(txtsoslog);
		
		 txtGPS = new JTextField();
			txtGPS.setForeground(Color.YELLOW);
			txtGPS.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			txtGPS.setText("GPS LOCATION");
			txtGPS.setBounds(150, 346, 130, 20);
			txtGPS.setBorder(null);
			txtGPS.setBackground(null);
			txtGPS.setVisible(false);
			txtGPS.setEditable(false);
			txtGPS.setHighlighter( null );
			txtGPS.setColumns(10);
			Frame.frame.getContentPane().add(txtGPS);
			
			 txtvideo = new JTextField();
			  txtvideo.setText("PLAY VIDEO");
			  txtvideo.setBounds(840, 652, 161, 20);
			  txtvideo.setColumns(10);
			  txtvideo.setForeground(Color.YELLOW);
			  txtvideo.setBackground(null);
			  txtvideo.setEditable(false);
			  txtvideo.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			  txtvideo.setHighlighter( null );
			  txtvideo.setBorder(null); 
			  txtvideo.setVisible(false);
			    Frame.frame.getContentPane().add(txtvideo);
			    
			    txtdb = new JTextField();
				txtdb.setText("DATABASE DETAILS");
				txtdb.setBounds(1059, 652, 173, 20);
				txtdb.setColumns(10);
				txtdb.setForeground(Color.YELLOW);
				txtdb.setBackground(null);
				txtdb.setEditable(false);
				txtdb.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
				txtdb.setHighlighter( null );
				txtdb.setBorder(null); 
				txtdb.setVisible(false);
			    Frame.frame.getContentPane().add(txtdb);
			    
			    
			     txtlog = new JTextField();
			    txtlog.setText("LOGGER");
			    txtlog.setBounds(1113, 652, 130, 20);
			    txtlog.setColumns(10);
			    txtlog.setForeground(Color.YELLOW);
			    txtlog.setBackground(null);
			    txtlog.setEditable(false);
			    txtlog.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			    txtlog.setHighlighter( null );
			    txtlog.setBorder(null); 
			    txtlog.setVisible(false);
			    Frame.frame.getContentPane().add(txtlog);
			    
			    
			     txtsuspobj = new JTextField();
			    txtsuspobj.setText("SUPICIOUS OBJECT");
			    txtsuspobj.setBounds(130, 652, 160, 20);
			    txtsuspobj.setColumns(10);
			    txtsuspobj.setForeground(Color.YELLOW);
			    txtsuspobj.setBackground(null);
			    txtsuspobj.setEditable(false);
			    txtsuspobj.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			    txtsuspobj.setHighlighter( null );
			    txtsuspobj.setBorder(null); 
			    txtsuspobj.setVisible(false);
			    Frame.frame.getContentPane().add(txtsuspobj);
			    
			     txtobj = new JTextField();
			    txtobj.setText("OBJECT DETECTED");
			    txtobj.setBounds(809, 652, 161, 20);
			    txtobj.setColumns(10);
			    txtobj.setForeground(Color.YELLOW);
			    txtobj.setBackground(null);
			    txtobj.setEditable(false);
			    txtobj.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			    txtobj.setHighlighter( null );
			    txtobj.setBorder(null); 
			    txtobj.setVisible(false);
			    Frame.frame.getContentPane().add(txtobj);
	
}
}
