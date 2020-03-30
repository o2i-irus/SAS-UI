
  
package aiframe;
import java.awt.EventQueue;


import javax.swing.*;

import java.awt.Image;
import java.awt.Color;

import java.awt.Font;

import java.awt.Canvas;



import java.net.URL;



import javax.swing.border.LineBorder;



import javafx.scene.media.MediaPlayer;















//import io.github.psgs.cctv.gui.GUI;





//import aiframe.test.*;

//import aiframe.CameraPanel.*;

import aiframe.Frame;
import aiframe.canvas;

import aiframe.clock;
import aiframe.cpuload;

import aiframe.radar;

import aiframe.buttons;
import aiframe.sosbtns;
import aiframe.webcam;

import aiframe.videoplay;







public class Frame {

	public static JFrame frame;
	public static JTextField txtCamera;
		public static JTextField txtCamera_3;
		public static JTextField txtCamera_2;
		public static JTextField txtCamera_1;
		public static JTextField textField;
		public static JTextField txtVehicleNumber;
		public static JTextField txtOwnersName;
		public static JTextField txtRcAddress;
		public static JTextField txtRegest;
		public static JLabel label_1;
		public static JFrame canvas_3frame;
		public static JTextField txtName;
		public static JTextField txtAge;
		public static JTextField txtAddress;
		public static JTextField txtDateOfBirth;
		public static MediaPlayer mediaPanel;
		URL mediaUrl=null;
		public static JFrame mediaTest;
		public static Canvas radar;
		public static ImageIcon icon;
		
		public static ImageIcon cam;
		public static JLabel camholder;
		public static JTextField textField_1;
		public static JTextField textField_2;
		public static JTextField textField_3;
		public static JTextField textField_4;
		public static JTextField textField_5;
		public static JTextField textField_6;
		public static JTextField textField_7;
		public static JPanel panel;
		public static JPanel panel_1;
		public static JPanel panel_2;
		public static JPanel panel_3;
		public static JPanel panel_4;
		public static JPanel panel_5;
		public static JLayeredPane layeredPane;
		public static JTextField maindash;
		public static Canvas canvas;
		public static Canvas canvas_1;
		public static Canvas canvas_2;
		public static Canvas canvas_3;
		public static Canvas canvas_4;
		public static JTextField ptz;
		
		public static JLabel graphhold;
		public static JTextPane callog;
		public static JTextPane msglog;
		public static JTextField txtmsg;
		public static JTextField txtcall;
		public static JPanel hospital;
		public static JTextField  txtsoslog;
		public static JTextPane soslog;
		public static JTextField txtGPS;
		public static JPanel GPS;
		
		public static JTextField txtsuspobj;
		public static JTextField txtobj;
		public static JTextField txtvideo;
		public static JTextPane dbdetails;
		public static JTextField txtdb;
		public static JTextField txtlog;
		public static JTextPane logger;
		public static JPanel object;
		public static JPanel videoplay;
		public static JPanel suspobj;
	   public JTextField txtcpu;
	
	
	
	

	
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

	
	public Frame() throws Exception 
	{
		initialize();
	}

	
	private void initialize() throws Exception {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(0, 0, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		new detectOS().getOperatingSystemType();
		
		new clock().clockmain();
		
		new calender().calendermain();
		
	    new createfolder().createfoldermain();
		//new graph().graphmain();
	//	new videowriter().tmain();
		new radar().radarmain();
		new txtcpuram().txtmain();
		new sosbtns().sosbtnsmain();
	//	new opencv().main();
		//new VideoWriter().writermain();
		//new test().main();
	    new barcpuram().main(); 
		//new tesst().vlc();
		new webcam().webcammain();
		new canvas().canvasmain();
		new ptzbtns().ptzbtnsmain();
	new cpuload().cpuloadmain();
		//new test1().test1main();
		//new videoplayer().vdmain();
	//	new vdo().vdmain();
	
	//new test12().tmain();
	
		SwingUtilities.invokeLater(null); 
	    {
	      
	      {
	    	  new videoplay().videomain();
	      }
	    }
    
		new buttons().buttonsmain();
    
    
    
    
    
	     txtCamera_2 = new JTextField();
		txtCamera_2.setForeground(Color.YELLOW);
		txtCamera_2.setEditable(false);
		txtCamera_2.setText("RIGHT CAMERA");           
		txtCamera_2.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		txtCamera_2.setColumns(10);
		txtCamera_2.setBounds(858, 346, 130, 20);
		frame.getContentPane().add(txtCamera_2);
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
		frame.getContentPane().add(txtCamera);
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
		frame.getContentPane().add(txtCamera_3);
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
		frame.getContentPane().add(txtCamera_1);
		txtCamera_1.setHighlighter( null );
		txtCamera_1.setBorder(null);
		txtCamera_1.setBackground(null);
	
		
		
		
		
		
		
		 maindash = new JTextField();
		maindash.setText("MAIN DASHBOARD");
		maindash.setBounds(750, 18, 300, 20);
		frame.getContentPane().add(maindash);
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
	    frame.getContentPane().add(ptz);
	    ptz.setColumns(10);
	    ptz.setForeground(Color.YELLOW);
		ptz.setBackground(null);
		ptz.setEditable(false);
		ptz.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		ptz.setHighlighter( null );
		ptz.setBorder(null); 
		
		
		
		ImageIcon cam = new ImageIcon(CCTV.imageOne);
		JLabel camholder=new JLabel(cam);
    	frame.getContentPane().add(camholder);
    	camholder.setBackground(Color.BLACK);
		camholder.setBounds(398, 284, 450, 400);
	   camholder.setVisible(false);
		
	    dbdetails = new JTextPane();
	   dbdetails.setBounds(1022, 469, 249, 177);
	   dbdetails.setVisible(true);
	   dbdetails.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	   dbdetails.setBackground(null);
	   dbdetails.setHighlighter(null);
	   dbdetails.setEditable(false);
	   dbdetails.setVisible(false);
		frame.getContentPane().add(dbdetails);
		
		
		
		  logger = new JTextPane();
		 logger.setBounds(1022, 469, 249, 177);
		 logger.setVisible(true);
		 logger.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		 logger.setBackground(null);
		 logger.setHighlighter(null);
		 logger.setEditable(false);
		 logger.setVisible(false);
			frame.getContentPane().add(logger);
		
		
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
	    frame.getContentPane().add(txtdb);
	    
	    
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
	    frame.getContentPane().add(txtlog);
	    
	    
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
	    frame.getContentPane().add(txtsuspobj);
	    
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
	    frame.getContentPane().add(txtobj);
	    
	    
	    
		 object = new JPanel();
		object.setBounds(763, 469 ,249 ,177);
		object.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		object.setBackground(null);
		object.setVisible(false);
		frame.getContentPane().add(object);
		
		
	
		
		 videoplay = new JPanel();
		videoplay.setBounds(763, 469 ,249 ,177);
		videoplay.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		videoplay.setBackground(null);
		videoplay.setVisible(false);
		frame.getContentPane().add(videoplay);
		
		
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
		    frame.getContentPane().add(txtvideo);
		    
		    
		     suspobj = new JPanel();
		    suspobj.setBounds(23, 377, 352, 272);
		    suspobj.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    suspobj.setBackground(null);
		    suspobj.setVisible(false);
			frame.getContentPane().add(suspobj);
		    
		
		 layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(225, 225, 225), 2));
		
		layeredPane.setBounds(1145, 425, 126, 212);
		layeredPane.setVisible(false);
		
		
		frame.getContentPane().add(layeredPane);
		
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
		 
		
		ImageIcon graph = new ImageIcon("graph.png");
		

		Image graphimg = new ImageIcon(this.getClass().getResource("/graph.png")).getImage();
		Image gr = graphimg.getScaledInstance(400, 300,  java.awt.Image.SCALE_SMOOTH);
		//ImageIcon newgraph = new ImageIcon(newimg);
	    graphhold=new JLabel();
		graphhold.setIcon(new ImageIcon(gr));
		graphhold.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    	frame.getContentPane().add(graphhold);
    	graphhold.setBackground(Color.BLACK);
    	graphhold.setBounds(740, 374, 352, 272);
    	graphhold.setVisible(true);
		 

		
	 
	
		    	
	    		
	    		
	    		
	    
	   
	   
	
		
		
		
		
		 
		
		txtVehicleNumber = new JTextField();
		txtVehicleNumber.setForeground(Color.YELLOW);
		txtVehicleNumber.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtVehicleNumber.setText("VEHICLE NUMBER");
		txtVehicleNumber.setBounds(201, 174, 190, 48);
		txtVehicleNumber.setBorder(null);
		txtVehicleNumber.setBackground(null);
		txtVehicleNumber.setVisible(false);
		txtVehicleNumber.setEditable(false);
		txtVehicleNumber.setHighlighter( null );
		frame.getContentPane().add(txtVehicleNumber);
		txtVehicleNumber.setColumns(10);
		
		txtOwnersName = new JTextField();
		txtOwnersName.setForeground(Color.YELLOW);
		txtOwnersName.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtOwnersName.setText("OWNER'S NAME");
		txtOwnersName.setBounds(201, 233, 190, 40);
		txtOwnersName.setBorder(null);
		txtOwnersName.setBackground(null);
		txtOwnersName.setVisible(false);
		txtOwnersName.setEditable(false);
		txtOwnersName.setHighlighter( null );
		frame.getContentPane().add(txtOwnersName);
		txtOwnersName.setColumns(10);
		
		txtRcAddress = new JTextField();
		txtRcAddress.setForeground(Color.YELLOW);
		txtRcAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtRcAddress.setText("RC ADDRESS");
		txtRcAddress.setBounds(201, 284, 190, 32);
		txtRcAddress.setBorder(null);
		txtRcAddress.setBackground(null);
		txtRcAddress.setVisible(false);
		txtRcAddress.setEditable(false);
		txtRcAddress.setHighlighter( null );
		frame.getContentPane().add(txtRcAddress);
		txtRcAddress.setColumns(10);
		
		txtRegest = new JTextField();
		txtRegest.setForeground(Color.YELLOW);
		txtRegest.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtRegest.setText("REGISTERING AUTHORITY");
		txtRegest.setBounds(201, 432, 249, 40);
		txtRegest.setBorder(null);
		txtRegest.setBackground(null);
		txtRegest.setVisible(false);
		txtRegest.setEditable(false);
		txtRegest.setHighlighter( null );
		frame.getContentPane().add(txtRegest);
		txtRegest.setColumns(10);
		
		txtName = new JTextField();
		txtName.setForeground(Color.YELLOW);
		txtName.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtName.setText("NAME");
		txtName.setBounds(201, 174, 190, 48);
		txtName.setBorder(null);
		txtName.setBackground(null);
		txtName.setVisible(false);
		txtName.setEditable(false);
		txtName.setHighlighter( null );
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setForeground(Color.YELLOW);
		txtAge.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtAge.setText("AGE");
		txtAge.setBounds(201, 233, 190, 40);
		txtAge.setBorder(null);
		txtAge.setBackground(null);
		txtAge.setVisible(false);
		txtAge.setEditable(false);
		txtAge.setHighlighter( null );
		frame.getContentPane().add(txtAge);
		txtAge.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setForeground(Color.YELLOW);
		txtAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtAddress.setText("ADDRESS");
		txtAddress.setBounds(201, 284, 190, 32);
		txtAddress.setBorder(null);
		txtAddress.setBackground(null);
		txtAddress.setVisible(false);
		txtAddress.setEditable(false);
		txtAddress.setHighlighter( null );
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setForeground(Color.YELLOW);
		txtDateOfBirth.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
		txtDateOfBirth.setText("DATE OF BIRTH");
		txtDateOfBirth.setBounds(201, 432, 249, 40);
		txtDateOfBirth.setBorder(null);
		txtDateOfBirth.setBackground(null);
		txtDateOfBirth.setVisible(false);
		txtDateOfBirth.setEditable(false);
		txtDateOfBirth.setHighlighter( null );
		frame.getContentPane().add(txtDateOfBirth);
		txtDateOfBirth.setColumns(10);
		
		
		 GPS = new JPanel();
		GPS.setBounds(23, 68, 352, 272);
		GPS.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		GPS.setBackground(null);
		GPS.setVisible(false);
		frame.getContentPane().add(GPS);
		
		
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
		frame.getContentPane().add(txtGPS);
		
		
		soslog = new JTextPane();
		soslog.setBounds(23, 374, 352, 272);
		soslog.setVisible(true);
		soslog.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		soslog.setBackground(null);
		soslog.setHighlighter(null);
		soslog.setEditable(false);
		soslog.setVisible(false);
	    frame.getContentPane().add(soslog);
		
	    
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
		frame.getContentPane().add(txtsoslog);
		
		
		 hospital = new JPanel();
		hospital.setBounds(381, 68, 352, 272);
		hospital.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		hospital.setBackground(null);
		hospital.setVisible(false);
		frame.getContentPane().add(hospital);
		
	    txtcall = new JTextField();
		txtcall.setBounds(960, 303, 96, 20);
		frame.getContentPane().add(txtcall);
		txtcall.setColumns(10);
		txtcall.setText("CALL");
		txtcall.setForeground(Color.YELLOW);
		txtcall.setVisible(false);
		txtcall.setEditable(false);
		txtcall.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		txtcall.setHighlighter( null );
		txtcall.setBorder(null);
		txtcall.setBackground(null);
		
		 txtmsg = new JTextField();
		txtmsg.setText("MESSAGE");
		txtmsg.setBounds(800, 303, 96, 20);
		frame.getContentPane().add(txtmsg);
		txtmsg.setColumns(10);
		txtmsg.setColumns(10);
		txtmsg.setForeground(Color.YELLOW);
		txtmsg.setVisible(false);
		txtmsg.setEditable(false);
		txtmsg.setFont(new Font("Bahnschrift", Font.PLAIN, 16));
		txtmsg.setHighlighter( null );
		txtmsg.setBorder(null);
		txtmsg.setBackground(null);
		
		
		 
		 
		    
		   
		
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
			frame.getContentPane().add(callog);
			
			
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
				frame.getContentPane().add(msglog);
		
		
		
	 JTextField company = new JTextField();
		company.setText("INDIGENOUS ROBOTIC UNMANNED SYSTEMS [IRUS]");
		company.setBounds(10, 670, 500, 40);
		company.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		company.setForeground(Color.YELLOW);
		company.setVisible(true);
	  //  company.setColumns(10);
		company.setEditable(false);
		company.setBackground(null); 
	    company.setHighlighter( null );
	    company.setBorder(null);
	    frame.getContentPane().add(company);
		
		
		JTextPane info = new JTextPane();
		info.setText("AI VEHICLE MOUNTED SURVEILLANCE SYSTEM" + "\n" + "LICENSED TO RAF BN194");
		info.setBounds(10, 12, 430, 50);
		info.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		info.setForeground(Color.YELLOW);
		info.setVisible(true);
	  //  company.setColumns(10);
		info.setEditable(false);
		info.setBackground(null); 
	    info.setHighlighter( null );
	    info.setBorder(null);
	    frame.getContentPane().add(info);
	    
	    
		
	
	textField_4 = new JTextField();
	//textField_4.setText("NOTIFICATIONS LOG");
	textField_4.setText("ALL CAMERAS CONNECTED");
	textField_4.setHorizontalAlignment(JTextField.CENTER);
	textField_4.setBounds(750, 40, 283, 20);
	frame.getContentPane().add(textField_4);
	textField_4.setColumns(10);
	textField_4.setForeground(Color.YELLOW);
	textField_4.setVisible(true);
	textField_4.setEditable(false);
	textField_4.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	textField_4.setHighlighter( null );
	textField_4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	textField_4.setBackground(null);
 	
	
	

	
	
	
	
		
		
		
		
	
		
			}
}


