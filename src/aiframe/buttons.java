package aiframe;
import aiframe.RTSPstream;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import aiframe.Frame;
import aiframe.ptzbtns;
import aiframe.videoplay;
public class buttons {
	public static JButton dash;
	public static JButton btnRadar;
	public static JButton btnIdentification;
	public static JButton suspact;
	public static JButton btnIVehicleID;
	public static JButton evidence;
	public static JButton sos;
	
	public void buttonsmain() {
		
		
		
	    dash = new JButton("DASHBOARD");
		dash.setForeground(Color.YELLOW);
		dash.setBackground(null);
		dash.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
		dash.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				meterradar.panel_1.setVisible(false);
				meterradar.panel_2.setVisible(false);
				meterradar.panel_3.setVisible(false);
				meterradar.panel_4.setVisible(false);
				meterradar.panel_5.setVisible(false);

				meterradar.layeredPane.setVisible(false);
			
				statictxts.maindash.setText("MAIN DASHBOARD");
				canvas.j4.setBounds(23, 68, 352, 272);
				canvas.j3.setBounds(381, 68, 352, 272);
				canvas.j2.setBounds(739, 68, 352, 272);
			    canvas.j1.setBounds(23, 374, 352, 272);
				canvas.j5.setBounds(381, 374, 352, 272);
				statictxts.txtCamera.setBounds(150, 346, 130, 20);
				statictxts.txtCamera_3.setBounds(500, 346, 135, 20);
				statictxts.txtCamera_2.setBounds(858, 346, 130, 20);
				statictxts.ptz.setBounds(150, 652, 125, 20);
				statictxts.txtCamera_1.setBounds(500, 652, 130, 20);
				canvas.j4.setVisible(true);
				canvas.j3.setVisible(true);
			    canvas.j5.setVisible(true);
				canvas.j1.setVisible(true);
				canvas.j2.setVisible(true);
				statictxts.txtCamera.setVisible(true);
				statictxts.txtCamera_3.setVisible(true);
				statictxts.txtCamera_2.setVisible(true);
				statictxts.txtCamera_1.setVisible(true);
				statictxts.ptz.setVisible(true);
				Frame.dbdetails.setVisible(false);
				Frame.object.setVisible(false);
				statictxts.txtdb.setVisible(false);
				statictxts.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				statictxts.txtlog.setVisible(false);
				videoplay.vjf.setVisible(false);
				statictxts.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				statictxts.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				statictxts.txtGPS.setVisible(false);
				 Frame.soslog.setVisible(false);
				 statictxts.txtsoslog.setVisible(false);
				 Frame.hospital.setVisible(false);
					sosbtns.msgbtn1.setVisible(false);
					sosbtns.msgbtn2.setVisible(false);
					sosbtns.msgbtn3.setVisible(false);
					sosbtns.msgbtn4.setVisible(false);
					sosbtns.msgbtn5.setVisible(false);
					sosbtns.msgbtn6.setVisible(false);
					sosbtns.msgbtn7.setVisible(false);
					sosbtns.msgbtn8.setVisible(false);
					sosbtns.msgbtn9.setVisible(false);
					sosbtns.callbtn1.setVisible(false);
					sosbtns.callbtn2.setVisible(false);
					sosbtns.callbtn3.setVisible(false);
					sosbtns.callbtn4.setVisible(false);
					sosbtns.callbtn5.setVisible(false);
					sosbtns.callbtn6.setVisible(false);
					sosbtns.callbtn7.setVisible(false);
					sosbtns.callbtn8.setVisible(false);
					sosbtns.callbtn9.setVisible(false);
			graph.graphhold.setBounds(740, 374, 352, 272);
				graph.graphhold.setVisible(true);
				log.callog.setVisible(false);
				log.msglog.setVisible(false);
				statictxts.txtmsg.setVisible(false);
				statictxts.txtcall.setVisible(false);
				radar.h.setVisible(false);
				ptzbtns.btnpane.setVisible(false);
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
			  videoplay.choose.setVisible(false);
			  videoplay.mannualplay.setVisible(false);
			  ptzbtns.txtptzstate.setVisible(false);
			  ptzbtns.toggleButton.setVisible(false);
			 // canvas.j8.setVisible(false);
			 // canvas.j6.setVisible(false);
			 // canvas.j7.setVisible(false);
			 // canvas.j9.setVisible(false);
			  //canvas.j10.setVisible(false);
			 togglebtn.camtog.setVisible(true);
			 togglebtn.camtog2.setVisible(true);
			// togglebtn.lb.setVisible(true);
			
			/* canvas.j1.setBounds(23, 310, 352, 272);
			 canvas.j2.setBounds(739, 5, 352, 272);   
			 canvas.j3.setBounds(381,5,352,272); 
			 canvas.j4.setBounds(23, 5, 352, 272);  
			canvas.j5.setBounds(381, 310, 352, 272);
			canvas.j6.setBounds(23, 310, 352, 272);
			 canvas.j7.setBounds(739, 5, 352, 272);
			canvas.j8.setBounds(381,5,352,272); 
			 canvas.j9.setBounds(23, 5, 352, 272); 
			 canvas.j10.setBounds(381, 310, 352, 272);   */
		//	 testurl.chngurl.setVisible(true);
			// testurl.stop.setVisible(true);
			 togglebtn.camtog.setSelected(true);
			 togglebtn.camtog2.setSelected(false);
			 record.stprec.setVisible(false);
			 record.strec.setVisible(false);
			 Frame.spnot.setVisible(false);
			 Frame.txtsp.setVisible(false);
			 Frame.txtcr.setVisible(true);
			 Frame.crnot.setVisible(true);
			 
			 test.old=Frame.crnot.getText();
			 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO MAIN DASHBOARD");

			}
		});
		dash.setBounds(1145, 72, 126, 40);
		dash.setFocusPainted(false);
		dash.addMouseListener(new java.awt.event.MouseAdapter() {

			public void mouseEntered(java.awt.event.MouseEvent evt) {
				dash.setBackground(Color.YELLOW);
				dash.setForeground(Color.BLACK);
				dash.setBounds(1143, 70, 130, 45);
			}
			

			public void mouseExited(java.awt.event.MouseEvent evt) {
				dash.setBackground(null);
				dash.setForeground(Color.YELLOW);
				dash.setBounds(1145, 72, 126, 40);
			}
		
		});
	

		Frame.frame.getContentPane().add(dash);
		
		
		JButton btnRadar = new JButton("PERSON TRACKING");
		btnRadar.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnRadar.setForeground(Color.YELLOW);
		btnRadar.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
		btnRadar.setBackground(null);
		btnRadar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 

				meterradar.panel.setVisible(false);
				meterradar.panel_1.setVisible(false);
				meterradar.panel_2.setVisible(false);
				meterradar.panel_3.setVisible(false);
				meterradar.panel_4.setVisible(false);
				meterradar.panel_5.setVisible(false);
				
				meterradar.layeredPane.setVisible(false);
				statictxts.maindash.setText("PERSON TRACKING");
				
				canvas.j4.setBounds(550, 65, 249, 177);     
				canvas.j3.setBounds(830, 65, 249, 177);     
				canvas.j2.setBounds(550, 269, 249, 177);    
				canvas.j5.setBounds(830, 269, 249, 177);    
				canvas.j1.setBounds(23, 65, 491, 460);  
			
				canvas.j4.setVisible(true);
				canvas.j3.setVisible(true);
				canvas.j5.setVisible(true);
				canvas.j1.setVisible(true);
				canvas.j2.setVisible(true);
				statictxts.txtCamera.setBounds(625, 244, 130, 20);
				statictxts.txtCamera_3.setBounds(890, 244, 130, 20);
				statictxts.txtCamera_2.setBounds(625, 449, 130, 20);
				statictxts.txtCamera_1.setBounds(890, 449, 130, 20);
				statictxts.ptz.setBounds(220, 530, 125, 20);
				
				statictxts.txtCamera.setVisible(true);
				statictxts.txtCamera_3.setVisible(true);
				statictxts.txtCamera_2.setVisible(true);
				statictxts.txtCamera_1.setVisible(true);
				statictxts.ptz.setVisible(true);
				Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				statictxts.txtdb.setVisible(false);
				statictxts.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				statictxts.txtlog.setVisible(false);
				videoplay.vjf.setVisible(false);
				statictxts.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				statictxts.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				statictxts.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				statictxts.txtsoslog.setVisible(false);
				Frame.hospital.setVisible(false);
				sosbtns.msgbtn1.setVisible(false);
				sosbtns.msgbtn2.setVisible(false);
				sosbtns.msgbtn3.setVisible(false);
				sosbtns.msgbtn4.setVisible(false);
				sosbtns.msgbtn5.setVisible(false);
				sosbtns.msgbtn6.setVisible(false);
				sosbtns.msgbtn7.setVisible(false);
				sosbtns.msgbtn8.setVisible(false);
				sosbtns.msgbtn9.setVisible(false);
				sosbtns.callbtn1.setVisible(false);
				sosbtns.callbtn2.setVisible(false);
				sosbtns.callbtn3.setVisible(false);
				sosbtns.callbtn4.setVisible(false);
				sosbtns.callbtn5.setVisible(false);
				sosbtns.callbtn6.setVisible(false);
				sosbtns.callbtn7.setVisible(false);
				sosbtns.callbtn8.setVisible(false);
				sosbtns.callbtn9.setVisible(false);
				graph.graphhold.setVisible(false);
				log.callog.setVisible(false);
				statictxts.txtmsg.setVisible(false);
				statictxts.txtcall.setVisible(false);
				log.msglog.setVisible(false);
				radar.h.setVisible(true);
				radar.h.setBounds(830, 470, 300, 228);
				ptzbtns.btnpane.setVisible(true);
				ptzbtns.left.setVisible(true);
				ptzbtns.right.setVisible(true);
				ptzbtns.up.setVisible(true);
				ptzbtns.down.setVisible(true);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(true);
				 ptzbtns.toggleButton.setVisible(true);
				 canvas.j6.setVisible(false);
				 canvas.j7.setVisible(false);
				 canvas.j8.setVisible(false);
				 canvas.j9.setVisible(false);
				 canvas.j10.setVisible(false);
				 togglebtn.camtog.setVisible(false);
				 togglebtn.camtog2.setVisible(false);
				 togglebtn.lb.setVisible(false);
			//	 testurl.chngurl.setVisible(false);
			//	 testurl.stop.setVisible(false);
				 record.stprec.setVisible(false);
				 record.strec.setVisible(false);
				 Frame.spnot.setVisible(false);
				 Frame.txtsp.setVisible(false);
				 Frame.txtcr.setVisible(false);
				 Frame.crnot.setVisible(false);
				
				 test.old=Frame.crnot.getText();
				 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO PERSON TRACKING MODE ");
				  	
				  
			}
		});
		btnRadar.setBounds(1145, 123, 126, 40);
		btnRadar.setFocusPainted(false);
		btnRadar.addMouseListener(new java.awt.event.MouseAdapter() {
			
			
			
			
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		        btnRadar.setBackground(Color.YELLOW);
		        btnRadar.setForeground(Color.BLACK);
		        btnRadar.setBounds(1143 , 121 , 130, 45);
		    }
             
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		        btnRadar.setBackground(null);
		        btnRadar.setForeground(Color.YELLOW);
		        btnRadar.setBounds(1145, 123, 126, 40);
		    }
		    
		    
		});

	  
		Frame.frame.getContentPane().add(btnRadar);
		
		
		JButton btnIdentification = new JButton("MOB INTENSITY LEVEL ");
		btnIdentification.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnIdentification.setForeground(Color.YELLOW);
		btnIdentification.setBackground(null);
		btnIdentification.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
		btnIdentification.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{ 
				
				meterradar.panel.setVisible(true);
				meterradar.panel_1.setVisible(true);
				meterradar.panel_2.setVisible(true);
				meterradar.panel_3.setVisible(true);
				meterradar.panel_4.setVisible(true);
				meterradar.panel_5.setVisible(true);
				
				
				meterradar.layeredPane.setVisible(true);
				
				
				statictxts.txtCamera_2.setBounds(858, 346, 130, 20);
				statictxts.maindash.setText("MOB INTENSITY LEVEL");
			
				statictxts.txtCamera.setVisible(true);
				statictxts.txtCamera_3.setVisible(true);
				statictxts.txtCamera_2.setVisible(true);
				statictxts.txtCamera_1.setVisible(true);
				statictxts.ptz.setVisible(false);
				
				
				canvas.j2.setBounds(739, 68, 352, 272);
				canvas.j3.setBounds(381, 68, 352, 272);
				canvas.j4.setBounds(23, 68, 352, 272);
				canvas.j5.setBounds(381, 374, 352, 272);
				canvas.j4.setVisible(true);
				canvas.j3.setVisible(true);
				canvas.j5.setVisible(true);
				canvas.j1.setVisible(false);
				canvas.j2.setVisible(true);
				
				
				statictxts.txtCamera.setBounds(150, 346, 130, 20);
				statictxts.txtCamera_3.setBounds(500, 346, 135, 20);	
				statictxts.ptz.setBounds(150, 652, 125, 20);
				statictxts.txtCamera_1.setBounds(500, 652, 130, 20);
				Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				statictxts.txtdb.setVisible(false);
				statictxts.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				statictxts.txtlog.setVisible(false);
				videoplay.vjf.setVisible(false);
				statictxts.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				statictxts.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				statictxts.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				statictxts.txtsoslog.setVisible(false);
				Frame.hospital.setVisible(false);
				sosbtns.msgbtn1.setVisible(false);
				sosbtns.msgbtn2.setVisible(false);
				sosbtns.msgbtn3.setVisible(false);
				sosbtns.msgbtn4.setVisible(false);
				sosbtns.msgbtn5.setVisible(false);
				sosbtns.msgbtn6.setVisible(false);
				sosbtns.msgbtn7.setVisible(false);
				sosbtns.msgbtn8.setVisible(false);
				sosbtns.msgbtn9.setVisible(false);
				sosbtns.callbtn1.setVisible(false);
				sosbtns.callbtn2.setVisible(false);
				sosbtns.callbtn3.setVisible(false);
				sosbtns.callbtn4.setVisible(false);
				sosbtns.callbtn5.setVisible(false);
				sosbtns.callbtn6.setVisible(false);
				sosbtns.callbtn7.setVisible(false);
				sosbtns.callbtn8.setVisible(false);
				sosbtns.callbtn9.setVisible(false);

				graph.graphhold.setBounds(23, 374, 352, 272);
				graph.graphhold.setVisible(true);
				log.callog.setVisible(false);
				log.msglog.setVisible(false);
				statictxts.txtmsg.setVisible(false);
				statictxts.txtcall.setVisible(false);
				radar.h.setVisible(true);
				radar.h.setBounds(740, 374, 352, 272);
				ptzbtns.btnpane.setVisible(false);
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(false);
				 ptzbtns.toggleButton.setVisible(false);
				 canvas.j6.setVisible(false);
				 canvas.j7.setVisible(false);
				 canvas.j8.setVisible(false);
				 canvas.j9.setVisible(false);
				 canvas.j10.setVisible(false);
				 togglebtn.camtog.setVisible(false);
				 togglebtn.camtog2.setVisible(false);
				 togglebtn.lb.setVisible(false);
				// testurl.chngurl.setVisible(false);
				// testurl.stop.setVisible(false);
				 record.stprec.setVisible(false);
				 record.strec.setVisible(false);
				 Frame.spnot.setVisible(false);
				 Frame.txtsp.setVisible(false);
				 Frame.txtcr.setVisible(false);
				 Frame.crnot.setVisible(false);
				 
				 test.old=Frame.crnot.getText();
				 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO MOB INTENSITY MODE ");
				
			}
		});
		btnIdentification.setBounds(1145, 174, 126, 40);
		btnIdentification.setFocusPainted(false);
		btnIdentification.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnIdentification.setBackground(Color.YELLOW);
		    	btnIdentification.setForeground(Color.BLACK);
		    	btnIdentification.setBounds(1143 , 172 , 130, 45);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	btnIdentification.setBackground(null);
		    	btnIdentification.setForeground(Color.YELLOW);
		    	btnIdentification.setBounds(1145, 174, 126, 40);
		    }
		});
	
		
		Frame.frame.getContentPane().add(btnIdentification);
		
		
		JButton suspact = new JButton("SUSPICIOUS ACTIVITY");
		suspact.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		suspact.setVisible(true);
	    suspact.setFocusPainted(false);
		suspact.setBackground(null);
		suspact.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
		suspact.setForeground(Color.YELLOW);
		suspact.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				
				meterradar.panel.setVisible(false);
				meterradar.panel_1.setVisible(false);
				meterradar.panel_2.setVisible(false);
				meterradar.panel_3.setVisible(false);
				meterradar.panel_4.setVisible(false);
				meterradar.panel_5.setVisible(false);
				meterradar.layeredPane.setVisible(false);
			    Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				statictxts.txtdb.setVisible(false);
				Frame.logger.setVisible(false);
				statictxts.txtlog.setVisible(false);
				statictxts.txtobj.setVisible(false);
				videoplay.vjf.setVisible(false);
				statictxts.txtvideo.setVisible(false);
				
				
				
				
			 
					canvas.j2.setBounds(739, 68, 352, 272);
					canvas.j4.setBounds(23, 68, 352, 272);
					canvas.j3.setBounds(381, 68, 352, 272);
					canvas.j5.setBounds(381, 374, 352, 272);  
					
					canvas.j1.setVisible(false);
					canvas.j2.setVisible(true);
					canvas.j4.setVisible(true);
					canvas.j3.setVisible(true);
					canvas.j5.setVisible(true);  
				
				
				statictxts.txtCamera_1.setBounds(500, 652, 130, 20);
				statictxts.txtCamera_3.setBounds(500, 346, 135, 20);
				statictxts.txtCamera.setBounds(150, 346, 130, 20);
				statictxts.txtCamera_2.setBounds(858, 346, 130, 20);
				statictxts.txtCamera.setVisible(true);
				statictxts.txtCamera_1.setVisible(true);
				statictxts.txtCamera_2.setVisible(true);
				statictxts.txtCamera_3.setVisible(true);
				statictxts.ptz.setVisible(false);
				
				Frame.suspobj.setVisible(true);
				statictxts.txtsuspobj.setVisible(true);
				statictxts.maindash.setText("SUSPICIOUS ACTIVITY DETECTION");
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				statictxts.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				statictxts.txtsoslog.setVisible(false);
				Frame.hospital.setVisible(false);
				graph.graphhold.setVisible(false);
				log.callog.setVisible(false);
				log.msglog.setVisible(false);
				statictxts.txtmsg.setVisible(false);
				statictxts.txtcall.setVisible(false);
				radar.h.setVisible(true);
				radar.h.setBounds(740, 374, 352, 272);
				sosbtns.msgbtn1.setVisible(false);
				sosbtns.msgbtn2.setVisible(false);
				sosbtns.msgbtn3.setVisible(false);
				sosbtns.msgbtn4.setVisible(false);
				sosbtns.msgbtn5.setVisible(false);
				sosbtns.msgbtn6.setVisible(false);
				sosbtns.msgbtn7.setVisible(false);
				sosbtns.msgbtn8.setVisible(false);
				sosbtns.msgbtn9.setVisible(false);
				sosbtns.callbtn1.setVisible(false);
				sosbtns.callbtn2.setVisible(false);
				sosbtns.callbtn3.setVisible(false);
				sosbtns.callbtn4.setVisible(false);
				sosbtns.callbtn5.setVisible(false);
				sosbtns.callbtn6.setVisible(false);
				sosbtns.callbtn7.setVisible(false);
				sosbtns.callbtn8.setVisible(false);
				sosbtns.callbtn9.setVisible(false);
				ptzbtns.btnpane.setVisible(false);
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(false);
				 ptzbtns.toggleButton.setVisible(false);
				 canvas.j6.setVisible(false);
				 canvas.j7.setVisible(false);
				 canvas.j8.setVisible(false);
				 canvas.j9.setVisible(false);
				 canvas.j10.setVisible(false);
				 togglebtn.camtog.setVisible(false);
				 togglebtn.camtog2.setVisible(false);
				 togglebtn.lb.setVisible(false);
				// testurl.chngurl.setVisible(false);
				// testurl.stop.setVisible(false);
				 record.stprec.setVisible(false);
				 record.strec.setVisible(false);
				 
				 Frame.txtcr.setVisible(false);
				 Frame.crnot.setVisible(false);
				 Frame.spnot.setVisible(true);
				 Frame.txtsp.setVisible(true);
				 
				 test.old=Frame.crnot.getText();
				 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO SUSPICIOUS ACTIVITY DETECTION");
				 
				 
				
					
			}
		});    
		suspact.setBounds(1145, 225, 126, 40);
		suspact.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	suspact.setBackground(Color.YELLOW);
		    	suspact.setForeground(Color.BLACK);
		    	suspact.setBounds(1143 , 223 , 130, 45);
		    }

		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	suspact.setBackground(null);
		    	suspact.setForeground(Color.YELLOW);
		    	suspact.setBounds(1145, 225, 126, 40);
		    }
		});
	  
	Frame.frame.getContentPane().add(suspact);
	
	
	JButton btnIVehicleID = new JButton("IDENTIFICATION");
	btnIVehicleID.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	btnIVehicleID.setForeground(Color.YELLOW);
	btnIVehicleID.setBackground(null);
	btnIVehicleID.setFocusPainted(false);
	btnIVehicleID.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	btnIVehicleID.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) { 
			
			
			 
				canvas.j1.setBounds(23, 374, 352, 272); 
				canvas.j2.setBounds(739, 68, 352, 272);
				canvas.j4.setBounds(23, 68, 352, 272);
				canvas.j3.setBounds(381, 68, 352, 272);
				canvas.j5.setBounds(381, 374, 352, 272);  
				
				canvas.j1.setVisible(true);
				canvas.j2.setVisible(true);
				canvas.j4.setVisible(true);
				canvas.j3.setVisible(true);
				canvas.j5.setVisible(true);   
			
			meterradar.panel.setVisible(false);
			meterradar.panel_1.setVisible(false);
			meterradar.panel_2.setVisible(false);
			meterradar.panel_3.setVisible(false);
			meterradar.panel_4.setVisible(false);
			meterradar.panel_5.setVisible(false);
	
			meterradar.layeredPane.setVisible(false);
			Frame.object.setVisible(true);
			Frame.dbdetails.setVisible(true);
			statictxts.txtdb.setVisible(true);
			statictxts.txtobj.setVisible(true);
			statictxts.txtCamera_2.setBounds(858, 346, 130, 20);
			statictxts.txtCamera.setBounds(150, 346, 130, 20);
			statictxts.txtCamera_3.setBounds(500, 346, 135, 20);
			statictxts.txtCamera_1.setBounds(500, 652, 130, 20);
		
			statictxts.ptz.setBounds(150, 652, 125, 20);
			statictxts.txtCamera_2.setVisible(true);
			statictxts.txtCamera.setVisible(true);
			statictxts.txtCamera_3.setVisible(true);
			statictxts.txtCamera_3.setVisible(true);
			statictxts.txtCamera_1.setVisible(true);
			statictxts.ptz.setVisible(true);
			Frame.logger.setVisible(false);
			statictxts.txtlog.setVisible(false);
			videoplay.vjf.setVisible(false);
			statictxts.txtvideo.setVisible(false);
			Frame.suspobj.setVisible(false);
			statictxts.txtsuspobj.setVisible(false);
			statictxts.maindash.setText("PERSON / VEHICLE IDENTIFICATION");
			sosbtns.sosbtn.setVisible(false);
			Frame.GPS.setVisible(false);
			statictxts.txtGPS.setVisible(false);
			Frame.soslog.setVisible(false);
			statictxts.txtsoslog.setVisible(false);
			Frame.hospital.setVisible(false);
			sosbtns.msgbtn1.setVisible(false);
			sosbtns.msgbtn2.setVisible(false);
			sosbtns.msgbtn3.setVisible(false);
			sosbtns.msgbtn4.setVisible(false);
			sosbtns.msgbtn5.setVisible(false);
			sosbtns.msgbtn6.setVisible(false);
			sosbtns.msgbtn7.setVisible(false);
			sosbtns.msgbtn8.setVisible(false);
			sosbtns.msgbtn9.setVisible(false);
			sosbtns.callbtn1.setVisible(false);
			sosbtns.callbtn2.setVisible(false);
			sosbtns.callbtn3.setVisible(false);
			sosbtns.callbtn4.setVisible(false);
			sosbtns.callbtn5.setVisible(false);
			sosbtns.callbtn6.setVisible(false);
			sosbtns.callbtn7.setVisible(false);
			sosbtns.callbtn8.setVisible(false);
			sosbtns.callbtn9.setVisible(false);
			graph.graphhold.setVisible(false);
			log.callog.setVisible(false);
			log.msglog.setVisible(false);
			statictxts.txtmsg.setVisible(false);
			statictxts.txtcall.setVisible(false);
			radar.h.setVisible(false);   
			ptzbtns.btnpane.setVisible(false);
			ptzbtns.left.setVisible(false);
			ptzbtns.right.setVisible(false);
			ptzbtns.up.setVisible(false);
			ptzbtns.down.setVisible(false);
			videoplay.choose.setVisible(false);
			videoplay.mannualplay.setVisible(false);
			 ptzbtns.txtptzstate.setVisible(false);
			 ptzbtns.toggleButton.setVisible(false);
			 canvas.j6.setVisible(false);
			 canvas.j7.setVisible(false);
			 canvas.j8.setVisible(false);
			 canvas.j9.setVisible(false);
			 canvas.j10.setVisible(false);
			 togglebtn.camtog.setVisible(false);
			 togglebtn.camtog2.setVisible(false);
			 togglebtn.lb.setVisible(false);
			// testurl.chngurl.setVisible(false);
		//	 testurl.stop.setVisible(false);
			 record.stprec.setVisible(false);
			 record.strec.setVisible(false);
			 Frame.spnot.setVisible(false);
			 Frame.txtsp.setVisible(false);
			 Frame.txtcr.setVisible(false);
			 Frame.crnot.setVisible(false);
			 
			 test.old=Frame.crnot.getText();
			 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO IDENTIFICATION MODE");
			 new test().dbtest();
			
		}
	});
	btnIVehicleID.setBounds(1145, 276, 126, 40);
	btnIVehicleID.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	btnIVehicleID.setBackground(Color.YELLOW);
	    	btnIVehicleID.setForeground(Color.BLACK);
	    	btnIVehicleID.setBounds(1143 , 274 , 130, 45);
	    }

	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	btnIVehicleID.setBackground(null);
	    	btnIVehicleID.setForeground(Color.YELLOW);
	    	btnIVehicleID.setBounds(1145, 276, 126, 40);
	    }
	   
	});

	
	Frame.frame.getContentPane().add(btnIVehicleID);
	
	
	JButton evidence = new JButton("EVIDENCE MANAGMENT");
	evidence.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	evidence.setVisible(true);
	evidence.setFocusPainted(false);
	evidence.setBackground(null);
	evidence.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	evidence.setForeground(Color.YELLOW);
	
	evidence.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) { 
			statictxts.txtCamera_2.setVisible(true);
			statictxts.txtCamera.setVisible(true);
			statictxts.txtCamera_3.setVisible(true);
			statictxts.txtCamera_3.setVisible(true);
			statictxts.txtCamera_1.setVisible(true);
			statictxts.ptz.setVisible(true);
			

		  
			canvas.j1.setBounds(23, 374, 352, 272); 
			canvas.j2.setBounds(739, 68, 352, 272);
			canvas.j4.setBounds(23, 68, 352, 272);
			canvas.j3.setBounds(381, 68, 352, 272);
			canvas.j5.setBounds(381, 374, 352, 272);  
			
			canvas.j1.setVisible(true);
			canvas.j2.setVisible(true);
			canvas.j4.setVisible(true);
			canvas.j3.setVisible(true);
			canvas.j5.setVisible(true);   
			
			
			
			meterradar.panel.setVisible(false);
			meterradar.panel_1.setVisible(false);
			meterradar.panel_2.setVisible(false);
			meterradar.panel_3.setVisible(false);
			meterradar.panel_4.setVisible(false);
			meterradar.panel_5.setVisible(false);
		
			meterradar.layeredPane.setVisible(false);
			Frame.object.setVisible(false);
			Frame.dbdetails.setVisible(false);
			statictxts.txtdb.setVisible(false);
			statictxts.txtobj.setVisible(false);
			statictxts.maindash.setText("EVIDENCE MANAGMENT");
			Frame.logger.setVisible(true);
			statictxts.txtlog.setVisible(true);
		    videoplay.vjf.setVisible(true);
			statictxts.txtvideo.setVisible(true);
			Frame.suspobj.setVisible(false);
			statictxts.txtsuspobj.setVisible(false);
			sosbtns.sosbtn.setVisible(false);
			Frame.GPS.setVisible(false);
			statictxts.txtGPS.setVisible(false);
			Frame.soslog.setVisible(false);
			statictxts.txtsoslog.setVisible(false);
			Frame.hospital.setVisible(false);
			sosbtns.msgbtn1.setVisible(false);
			sosbtns.msgbtn2.setVisible(false);
			sosbtns.msgbtn3.setVisible(false);
			sosbtns.msgbtn4.setVisible(false);
			sosbtns.msgbtn5.setVisible(false);
			sosbtns.msgbtn6.setVisible(false);
			sosbtns.msgbtn7.setVisible(false);
			sosbtns.msgbtn8.setVisible(false);
			sosbtns.msgbtn9.setVisible(false);
			sosbtns.callbtn1.setVisible(false);
			sosbtns.callbtn2.setVisible(false);
			sosbtns.callbtn3.setVisible(false);
			sosbtns.callbtn4.setVisible(false);
			sosbtns.callbtn5.setVisible(false);
			sosbtns.callbtn6.setVisible(false);
			sosbtns.callbtn7.setVisible(false);
			sosbtns.callbtn8.setVisible(false);
			sosbtns.callbtn9.setVisible(false);
		graph.graphhold.setVisible(false);
			log.callog.setVisible(false);
			log.msglog.setVisible(false);
			statictxts.txtmsg.setVisible(false);
			statictxts.txtcall.setVisible(false);
			radar.h.setVisible(false);
			ptzbtns.btnpane.setVisible(false);
			ptzbtns.left.setVisible(false);
			ptzbtns.right.setVisible(false);
			ptzbtns.up.setVisible(false);
			ptzbtns.down.setVisible(false);
			videoplay.choose.setVisible(true);
			videoplay.mannualplay.setVisible(true);
			 ptzbtns.txtptzstate.setVisible(false);
			 ptzbtns.toggleButton.setVisible(false);
			 canvas.j6.setVisible(false);
			 canvas.j7.setVisible(false);
			 canvas.j8.setVisible(false);
			 canvas.j9.setVisible(false);
			 canvas.j10.setVisible(false);
			 togglebtn.camtog.setVisible(false);
			 togglebtn.camtog2.setVisible(false);
			 togglebtn.lb.setVisible(false);
		//	 testurl.chngurl.setVisible(false);
		//	 testurl.stop.setVisible(false);
			 record.stprec.setVisible(true);
			 record.strec.setVisible(true);
			 Frame.spnot.setVisible(false);
			 Frame.txtsp.setVisible(false);
			 Frame.txtcr.setVisible(false);
			 Frame.crnot.setVisible(false);
			 
			 test.old=Frame.crnot.getText();
			 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO EVIDENCE MANAGMENT MODE");
			
		}
	});    
	evidence.setBounds(1145, 327, 126, 40);
	evidence.addMouseListener(new java.awt.event.MouseAdapter() {
	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	    	evidence.setBackground(Color.YELLOW);
	    	evidence.setForeground(Color.BLACK);
	    	evidence.setBounds(1143 , 325 , 130, 45);
	    }

	    public void mouseExited(java.awt.event.MouseEvent evt) {
	    	evidence.setBackground(null);
	    	evidence.setForeground(Color.YELLOW);
	    	evidence.setBounds(1145, 327, 126, 40);
	    }
	});

	Frame.frame.getContentPane().add(evidence);
	
	 sos = new JButton("SOS SIGNAL");
	sos.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
    sos.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) { 
		statictxts.txtCamera.setVisible(false);
		statictxts.txtCamera_1.setVisible(false);
		statictxts.txtCamera_2.setVisible(false);
		statictxts.txtCamera_3.setVisible(false);
		canvas.j4.setVisible(false);
		canvas.j2.setVisible(false);
		canvas.j3.setVisible(false);
		canvas.j5.setVisible(false);
		canvas.j1.setVisible(false);
		meterradar.panel.setVisible(false);
		meterradar.panel_1.setVisible(false);
		meterradar.panel_2.setVisible(false);
		meterradar.panel_3.setVisible(false);
		meterradar.panel_4.setVisible(false);
		meterradar.panel_5.setVisible(false);
		meterradar.layeredPane.setVisible(false);
	    Frame.object.setVisible(false);
		Frame.dbdetails.setVisible(false);
		statictxts.txtdb.setVisible(false);
		statictxts.ptz.setVisible(false);
		statictxts.txtobj.setVisible(false);
		Frame.logger.setVisible(false);
		statictxts.txtlog.setVisible(false);
		videoplay.vjf.setVisible(false);
		statictxts.txtvideo.setVisible(false);
		Frame.suspobj.setVisible(false);
		statictxts.maindash.setText("SOS SIGNAL");
		statictxts.txtsuspobj.setVisible(false);
		sosbtns.sosbtn.setVisible(true);
		Frame.GPS.setVisible(true);
		statictxts.txtGPS.setVisible(true);
		Frame.soslog.setVisible(true);
		statictxts.txtsoslog.setVisible(true);
		Frame.hospital.setVisible(true);
		sosbtns.msgbtn1.setVisible(true);
		sosbtns.msgbtn2.setVisible(true);
		sosbtns.msgbtn3.setVisible(true);
		sosbtns.msgbtn4.setVisible(true);
		sosbtns.msgbtn5.setVisible(true);
		sosbtns.msgbtn6.setVisible(true);
		sosbtns.msgbtn7.setVisible(true);
		sosbtns.msgbtn8.setVisible(true);
		sosbtns.msgbtn9.setVisible(true);
		sosbtns.callbtn1.setVisible(true);
		sosbtns.callbtn2.setVisible(true);
		sosbtns.callbtn3.setVisible(true);
		sosbtns.callbtn4.setVisible(true);
		sosbtns.callbtn5.setVisible(true);
		sosbtns.callbtn6.setVisible(true);
		sosbtns.callbtn7.setVisible(true);
		sosbtns.callbtn8.setVisible(true);
		sosbtns.callbtn9.setVisible(true);
		graph.graphhold.setVisible(false);
		log.callog.setVisible(true);
		log.msglog.setVisible(true);
		statictxts.txtmsg.setVisible(true);
		statictxts.txtcall.setVisible(true);
		radar.h.setVisible(false);
		ptzbtns.btnpane.setVisible(false);
		ptzbtns.left.setVisible(false);
		ptzbtns.right.setVisible(false);
		ptzbtns.up.setVisible(false);
		ptzbtns.down.setVisible(false);
		videoplay.choose.setVisible(false);
		videoplay.mannualplay.setVisible(false);
		 ptzbtns.txtptzstate.setVisible(false);
		 ptzbtns.toggleButton.setVisible(false);
		 canvas.j6.setVisible(false);
		 canvas.j7.setVisible(false);
		 canvas.j8.setVisible(false);
		 canvas.j9.setVisible(false);
		 canvas.j10.setVisible(false);
		 togglebtn.camtog.setVisible(false);
		 togglebtn.camtog2.setVisible(false);
		 togglebtn.lb.setVisible(false);
	//	 testurl.chngurl.setVisible(false);
		// testurl.stop.setVisible(false);
		 record.stprec.setVisible(false);
		 record.strec.setVisible(false);
		 Frame.spnot.setVisible(false);
		 Frame.txtsp.setVisible(false);
		 Frame.txtcr.setVisible(false);
		 Frame.crnot.setVisible(false);
		 
		 test.old=Frame.crnot.getText();
		 Frame.crnot.setText(test.old+"\n"+clock.txt.getText()+"\nSWITCHING TO SOS MODE");
		
	  }
});  
       sos.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
       sos.setForeground(Color.YELLOW);
       sos.setBackground(null);
       sos.setFocusPainted(false);
       sos.setBounds(1145, 378, 126, 40);
       sos.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
    	sos.setBackground(Color.YELLOW);
    	sos.setForeground(Color.BLACK);
    	sos.setBounds(1143 , 376 , 130, 45);
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    	sos.setBackground(null);
    	sos.setForeground(Color.YELLOW);
    	sos.setBounds(1145, 378, 126, 40);
    }
});

        sos.setVisible(true);
        sos.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});

Frame.frame.getContentPane().add(sos);
	}

}



