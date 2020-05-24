
  
package aiframe;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;


import javax.swing.*;



import java.awt.Color;

import java.awt.Canvas;
import java.net.URL;




public class Frame {

	public static JFrame frame;

		
		public static JLabel label_1;
		public static JFrame canvas_3frame;
		
	//	public static MediaPlayer mediaPanel;
		URL mediaUrl=null;
		public static JFrame mediaTest;
		public static Canvas radar;
		public static ImageIcon icon;
		
		public static ImageIcon cam;
		public static JLabel camholder;
		public static JTextField textField_1;
		public static JTextField textField_2;
		public static JTextField textField_3;
		
		public static JTextField textField_5;
		public static JTextField textField_6;
		public static JTextField textField_7;
		
	public static JTextPane spnot;
	public static JTextField txtsp;
	public static JTextField txtcr;
	public static JTextPane crnot;
		
	
		
		
		public static JPanel hospital;
		
		public static JTextPane soslog;
		
		public static JPanel GPS;
		
		
		
		
		public static JTextPane dbdetails;
	
	
		public static JTextPane logger;
		public static JPanel object;
		
		public static JPanel suspobj;
	   public JTextField txtcpu;
	
	   
	   
	   
	   
	   
	   
	
	

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					Frame.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
			
   try {
	  
	   
		    } 
		    
		    
		    catch(Exception ex) {ex.printStackTrace();}
			      
		     
		 }

	
	public Frame() throws Exception 
	{
		 
		initialize();
		
		 
		
	}

	
	private void initialize() throws Exception {
		
	
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
	frame.setBounds(0, 0, 1440, 900);
	
		frame.setLocationRelativeTo(null);
	frame.setExtendedState(JFrame.MAXIMIZED_VERT);
		frame.setResizable(true);
		//frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
		
		
		
		
		new detectOS();
		detectOS.getOperatingSystemType();
		new createfolder().createfoldermain();
		new clock().clockmain();
        new calender();
		calender.calendermain();
		new meterradar().main();
	    new notifications().main();
			new statictxts().main();	
		new graph().main();
	//	new videowriter().tmain();
	new 	radar().radarmain();
	new txtcpuram().txtmain();
		new sosbtns().sosbtnsmain();
		//new opencv().main();
		//new VideoWriter().writermain();
		new test().main();
	    new barcpuram().main(); 
		//new tesst().vlc();
		//new webcam().webcammain();
	   
	new canvas().canvasmain();
		
	    new log().main();
		new ptzbtns().ptzbtnsmain();
	    new cpuload().cpuloadmain();
	   

	

	
	
		  
	
		//SwingUtilities.invokeLater(null); 
	 // {
	      
	   //  {
	    new videoplay().videomain();
	    	
		      
	   // }
	   // }
    
	  new togglebtn().main();
	  
		
 //   new testurl().main();
    new record().recordmain();
   new stream().main();
    
	new buttons().buttonsmain();
	     
		
		
		
	    dbdetails = new JTextPane();
	   dbdetails.setBounds(1022, 469, 249, 177);
	   dbdetails.setVisible(true);
	   dbdetails.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	   dbdetails.setBackground(null);
	 
	   dbdetails.setForeground(Color.yellow);
	   dbdetails.setHighlighter(null);
	   dbdetails.setEditable(false);
	   dbdetails.setVisible(false);
		frame.getContentPane().add(dbdetails);
		
		
		
		  logger = new JTextPane();
		 logger.setBounds(1022, 469, 249, 177);
		 logger.setVisible(true);
		 logger.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		 
     	 logger.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		 logger.setBackground(null);
		 logger.setForeground(Color.yellow);
		 logger.setHighlighter(null);
		 logger.setEditable(false);
		 logger.setVisible(false);
			frame.getContentPane().add(logger);
			
			
			 spnot = new JTextPane();
			 spnot.setBounds(1100, 425, 170, 220);
			 spnot.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			 spnot.setBackground(null);
			 spnot.setForeground(Color.yellow);
			 spnot.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
			 spnot.setHighlighter(null);
			 spnot.setEditable(false);
			 spnot.setVisible(false);
		    frame.getContentPane().add(spnot);
		    
			
		    
		    
		    
		   
		
				
				txtsp = new JTextField();
				txtsp.setText("SPECIAL NOTIFICATIONS");
				txtsp.setBounds(1072, 652, 200, 20);
				txtsp.setColumns(10);
				txtsp.setForeground(Color.YELLOW);
				txtsp.setBackground(null);
				txtsp.setEditable(false);
				txtsp.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
				txtsp.setHighlighter( null );
				txtsp.setBorder(null); 
				txtsp.setVisible(false);
				    Frame.frame.getContentPane().add(txtsp);
				    
				    
				    
				    crnot = new JTextPane();
				    crnot.setBounds(1100, 475, 170, 170);
				    crnot.setVisible(true);
				    crnot.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				    crnot.setBackground(null);
				    crnot.setForeground(Color.yellow);
				    crnot.setHighlighter(null);
				    crnot.setEditable(false);
				    crnot.setVisible(true);
						frame.getContentPane().add(crnot);
				
						
						txtcr = new JTextField();
						txtcr.setText("CRITICAL NOTIFICATIONS");
						txtcr.setBounds(1072, 652, 200, 25);
						txtcr.setColumns(10);
						txtcr.setForeground(Color.YELLOW);
						txtcr.setBackground(null);
						txtcr.setEditable(false);
						txtcr.setFont(new Font("Bahnschrift", Font.PLAIN, 17));
						txtcr.setHighlighter( null );
						txtcr.setBorder(null); 
						txtcr.setVisible(true);
						    Frame.frame.getContentPane().add(txtcr);
						    
		
		
	    
	    
	    
		 object = new JPanel();
		object.setBounds(763, 469 ,249 ,177);
		object.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		object.setBackground(null);
		object.setVisible(false);
		frame.getContentPane().add(object);
		
		
	    
		
		
		ImageIcon ic1 = new ImageIcon("img\\123.jpg");
	    JLabel lb = new JLabel();
	    lb.setIcon(ic1);
		
	 suspobj = new JPanel();
		    suspobj.setBounds(23, 374, 352, 272);
		    suspobj.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    suspobj.setBackground(null);
		    suspobj.setVisible(false);
		    suspobj.add(lb);
			frame.getContentPane().add(suspobj);
			
			
		    
		
		  GPS = new JPanel();
		GPS.setBounds(23, 68, 352, 272);
		GPS.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		GPS.setBackground(null);
		GPS.setVisible(false);
		frame.getContentPane().add(GPS);
		
		
		ImageIcon ic = new ImageIcon("img\\map.jpg");
		Image dimg = ic.getImage().getScaledInstance(GPS.getWidth(), 300,
		        Image.SCALE_SMOOTH);
		ImageIcon scaled = new ImageIcon(dimg);
		
		JLabel l = new JLabel();
		l.setIcon(scaled);
		GPS.add(l);
		
		
		
		
		
		soslog = new JTextPane();
		soslog.setBounds(23, 374, 352, 272);
		soslog.setVisible(true);
		soslog.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		soslog.setBackground(null);
		soslog.setHighlighter(null);
		soslog.setEditable(false);
		soslog.setVisible(false);
	    frame.getContentPane().add(soslog);
	    
	    
	    
		
	    
	    
		
		
		 hospital = new JPanel();
		hospital.setBounds(381, 68, 352, 272);
		hospital.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		hospital.setBackground(null);
		hospital.setVisible(false);
		frame.getContentPane().add(hospital);
		
		
		
		
		 
	    
	
		 
		}
}


