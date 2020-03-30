package aiframe;

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

				Frame.panel_1.setVisible(false);
				Frame.panel_2.setVisible(false);
				Frame.panel_3.setVisible(false);
				Frame.panel_4.setVisible(false);
				 Frame.panel_5.setVisible(false);

				Frame.layeredPane.setVisible(false);
				Frame.txtVehicleNumber.setVisible(false);
				Frame.txtOwnersName.setVisible(false);
				Frame.txtRcAddress.setVisible(false);
				Frame.txtRegest.setVisible(false);
				Frame.txtName.setVisible(false);
				Frame.txtAge.setVisible(false);
				Frame.txtAddress.setVisible(false);
				Frame.txtDateOfBirth.setVisible(false);
				Frame.maindash.setText("MAIN DASHBOARD");
				canvas.campanel4.setBounds(23, 68, 352, 272);
				canvas.campanel3.setBounds(381, 68, 352, 272);
				canvas.campanel2.setBounds(739, 68, 352, 272);
			canvas.campanel1.setBounds(23, 374, 352, 272);
				canvas.campanel5.setBounds(381, 374, 352, 272);
				Frame.txtCamera.setBounds(150, 346, 130, 20);
				Frame.txtCamera_3.setBounds(500, 346, 135, 20);
				Frame.txtCamera_2.setBounds(858, 346, 130, 20);
				Frame.ptz.setBounds(150, 652, 125, 20);
				Frame.txtCamera_1.setBounds(500, 652, 130, 20);
				canvas.campanel4.setVisible(true);
				canvas.campanel3.setVisible(true);
			    canvas.campanel5.setVisible(true);
				canvas.campanel1.setVisible(true);
				canvas.campanel2.setVisible(true);
				Frame.txtCamera.setVisible(true);
				Frame.txtCamera_3.setVisible(true);
				Frame.txtCamera_2.setVisible(true);
				Frame.txtCamera_1.setVisible(true);
				Frame.ptz.setVisible(true);
				Frame.dbdetails.setVisible(false);
				Frame.object.setVisible(false);
				Frame.txtdb.setVisible(false);
				Frame.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				Frame.txtlog.setVisible(false);
				Frame.videoplay.setVisible(false);
				Frame.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				Frame.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				Frame.txtGPS.setVisible(false);
				 Frame.soslog.setVisible(false);
				 Frame.txtsoslog.setVisible(false);
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
				Frame.graphhold.setBounds(740, 374, 352, 272);
				Frame.graphhold.setVisible(true);
				Frame.callog.setVisible(false);
				Frame.msglog.setVisible(false);
				Frame.txtmsg.setVisible(false);
				Frame.txtcall.setVisible(false);
				radar.h.setVisible(false);
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
			  videoplay.choose.setVisible(false);
			  videoplay.mannualplay.setVisible(false);
			  ptzbtns.txtptzstate.setVisible(false);
			  ptzbtns.toggleButton.setVisible(false);

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

				Frame.panel.setVisible(false);
				Frame.panel_1.setVisible(false);
				Frame.panel_2.setVisible(false);
				Frame.panel_3.setVisible(false);
				Frame.panel_4.setVisible(false);
				Frame.panel_5.setVisible(false);
				
				Frame.layeredPane.setVisible(false);
				Frame.txtVehicleNumber.setVisible(false);
				Frame.txtOwnersName.setVisible(false);
				Frame.txtRcAddress.setVisible(false);
				Frame.txtRegest.setVisible(false);
				Frame.txtName.setVisible(false);
				Frame.txtAge.setVisible(false);
				Frame.txtAddress.setVisible(false);
				Frame.txtDateOfBirth.setVisible(false);
				Frame.maindash.setText("PERSON TRACKING");
				canvas.campanel4.setBounds(635, 298, 249, 177);     //left
				canvas.campanel3.setBounds(890, 298, 249, 177);     //front
				canvas.campanel2.setBounds(767, 502, 249, 177);    //right
				canvas.campanel5.setBounds(1022, 502, 249, 177);    //back
				canvas.campanel1.setBounds(80, 96, 491, 460);    //ptz
				Frame.txtCamera.setBounds(727, 481, 130, 20);
				Frame.txtCamera_3.setBounds(958, 481, 130, 20);
				Frame.txtCamera_2.setBounds(851, 684, 130, 20);
				Frame.txtCamera_1.setBounds(1097, 684, 130, 20);
				Frame.ptz.setBounds(275, 620, 125, 20);
				canvas.campanel4.setVisible(true);
				canvas.campanel3.setVisible(true);
				canvas.campanel5.setVisible(true);
				canvas.campanel1.setVisible(true);
				canvas.campanel2.setVisible(true);
				Frame.txtCamera.setVisible(true);
				Frame.txtCamera_3.setVisible(true);
				Frame.txtCamera_2.setVisible(true);
				Frame.txtCamera_1.setVisible(true);
				Frame.ptz.setVisible(true);
				Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				Frame.txtdb.setVisible(false);
				Frame.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				Frame.txtlog.setVisible(false);
				Frame.videoplay.setVisible(false);
				Frame.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				Frame.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				Frame.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				Frame.txtsoslog.setVisible(false);
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
				Frame.graphhold.setVisible(false);
				Frame.callog.setVisible(false);
				Frame.txtmsg.setVisible(false);
				Frame.txtcall.setVisible(false);
				Frame.msglog.setVisible(false);
				radar.h.setVisible(true);
				radar.h.setBounds(740, 68, 300, 228);
				ptzbtns.left.setVisible(true);
				ptzbtns.right.setVisible(true);
				ptzbtns.up.setVisible(true);
				ptzbtns.down.setVisible(true);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(true);
				 ptzbtns.toggleButton.setVisible(true);
				
				  	
				  
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
				
				Frame.panel.setVisible(true);
				Frame.panel_1.setVisible(true);
				Frame.panel_2.setVisible(true);
				Frame.panel_3.setVisible(true);
				Frame.panel_4.setVisible(true);
				Frame.panel_5.setVisible(true);
				
				
				Frame.layeredPane.setVisible(true);
				
				Frame.txtVehicleNumber.setVisible(false);
				Frame.txtOwnersName.setVisible(false);
				Frame.txtRcAddress.setVisible(false);
				Frame.txtRegest.setVisible(false);
				Frame.txtName.setVisible(false);
				Frame.txtAge.setVisible(false);
				Frame.txtAddress.setVisible(false);
				Frame.txtDateOfBirth.setVisible(false);
				canvas.campanel2.setBounds(23, 374, 352, 272);
				Frame.txtCamera_2.setBounds(150, 652, 125, 20);
				Frame.maindash.setText("MOB INTENSITY LEVEL");
				canvas.campanel4.setVisible(true);
				canvas.campanel3.setVisible(true);
				canvas.campanel5.setVisible(true);
				canvas.campanel1.setVisible(false);
				canvas.campanel2.setVisible(true);
				Frame.txtCamera.setVisible(true);
				Frame.txtCamera_3.setVisible(true);
				Frame.txtCamera_2.setVisible(true);
				Frame.txtCamera_1.setVisible(true);
				Frame.ptz.setVisible(false);
				canvas.campanel3.setBounds(381, 68, 352, 272);
				canvas.campanel4.setBounds(23, 68, 352, 272);
				canvas.campanel5.setBounds(381, 374, 352, 272);
				Frame.txtCamera.setBounds(150, 346, 130, 20);
				Frame.txtCamera_3.setBounds(500, 346, 135, 20);	
				Frame.ptz.setBounds(150, 652, 125, 20);
				Frame.txtCamera_1.setBounds(500, 652, 130, 20);
				Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				Frame.txtdb.setVisible(false);
				Frame.txtobj.setVisible(false);
				Frame.logger.setVisible(false);
				Frame.txtlog.setVisible(false);
				Frame.videoplay.setVisible(false);
				Frame.txtvideo.setVisible(false);
				Frame.suspobj.setVisible(false);
				Frame.txtsuspobj.setVisible(false);
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				Frame.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				Frame.txtsoslog.setVisible(false);
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

				Frame.graphhold.setBounds(740, 374, 352, 272);
				Frame.graphhold.setVisible(true);
				Frame.callog.setVisible(false);
				Frame.msglog.setVisible(false);
				Frame.txtmsg.setVisible(false);
				Frame.txtcall.setVisible(false);
				radar.h.setVisible(true);
				radar.h.setBounds(740, 68, 352, 272);
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(false);
				 ptzbtns.toggleButton.setVisible(false);
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
				
				Frame.panel.setVisible(false);
				Frame.panel_1.setVisible(false);
				Frame.panel_2.setVisible(false);
				Frame.panel_3.setVisible(false);
				Frame.panel_4.setVisible(false);
				Frame.panel_5.setVisible(false);
				Frame.layeredPane.setVisible(false);
				Frame.txtVehicleNumber.setVisible(false);
				Frame.txtOwnersName.setVisible(false);
				Frame.txtRcAddress.setVisible(false);
				Frame.txtRegest.setVisible(false);
				Frame.txtName.setVisible(false);
				Frame.txtAge.setVisible(false);
				Frame.txtAddress.setVisible(false);
				Frame.txtDateOfBirth.setVisible(false);
				Frame.object.setVisible(false);
				Frame.dbdetails.setVisible(false);
				Frame.txtdb.setVisible(false);
				Frame.logger.setVisible(false);
				Frame.txtlog.setVisible(false);
				Frame.txtobj.setVisible(false);
				Frame.videoplay.setVisible(false);
				Frame.txtvideo.setVisible(false);
				canvas.campanel1.setBounds(23, 374, 352, 272); 
				canvas.campanel2.setBounds(739, 68, 352, 272);
				canvas.campanel3.setBounds(381, 68, 352, 272);
				canvas.campanel5.setBounds(381, 374, 352, 272);
				Frame.txtCamera_1.setBounds(500, 652, 130, 20);
				Frame.txtCamera_3.setBounds(500, 346, 135, 20);
				Frame.txtCamera.setBounds(150, 346, 130, 20);
				Frame.txtCamera_2.setBounds(858, 346, 130, 20);
				Frame.txtCamera.setVisible(true);
				Frame.txtCamera_1.setVisible(true);
				Frame.txtCamera_2.setVisible(true);
				Frame.txtCamera_3.setVisible(true);
				Frame.ptz.setVisible(false);
				canvas.campanel4.setVisible(true);
				canvas.campanel2.setVisible(true);
				canvas.campanel3.setVisible(true);
				canvas.campanel5.setVisible(true);
				canvas.campanel1.setVisible(false);
				Frame.suspobj.setVisible(true);
				Frame.txtsuspobj.setVisible(true);
				Frame.maindash.setText("SUSPICIOUS ACTIVITY DETECTION");
				sosbtns.sosbtn.setVisible(false);
				Frame.GPS.setVisible(false);
				Frame.txtGPS.setVisible(false);
				Frame.soslog.setVisible(false);
				Frame.txtsoslog.setVisible(false);
				Frame.hospital.setVisible(false);
				Frame.graphhold.setVisible(false);
				Frame.callog.setVisible(false);
				Frame.msglog.setVisible(false);
				Frame.txtmsg.setVisible(false);
				Frame.txtcall.setVisible(false);
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
				ptzbtns.left.setVisible(false);
				ptzbtns.right.setVisible(false);
				ptzbtns.up.setVisible(false);
				ptzbtns.down.setVisible(false);
				videoplay.choose.setVisible(false);
				videoplay.mannualplay.setVisible(false);
				 ptzbtns.txtptzstate.setVisible(false);
				 ptzbtns.toggleButton.setVisible(false);
					
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
			
			
			canvas.campanel1.setBounds(23, 374, 352, 272); 
			canvas.campanel2.setBounds(739, 68, 352, 272);
			canvas.campanel4.setBounds(23, 68, 352, 272);
			canvas.campanel3.setBounds(381, 68, 352, 272);
		    canvas.campanel5.setBounds(381, 374, 352, 272);
			canvas.campanel4.setVisible(true);
			canvas.campanel2.setVisible(true);
			canvas.campanel3.setVisible(true);
			canvas.campanel5.setVisible(true);
			canvas.campanel1.setVisible(true);
			
			Frame.panel.setVisible(false);
			Frame.panel_1.setVisible(false);
			Frame.panel_2.setVisible(false);
			Frame.panel_3.setVisible(false);
			Frame.panel_4.setVisible(false);
			Frame.panel_5.setVisible(false);
	
			Frame.layeredPane.setVisible(false);
			
				//txtVehicleNumber.setVisible(true);
			//txtOwnersName.setVisible(true);
			//txtRcAddress.setVisible(true);
			//txtRegest.setVisible(true);
			//txtName.setVisible(false);
			//txtAge.setVisible(false);
			//txtAddress.setVisible(false);
			//txtDateOfBirth.setVisible(false);
			Frame.object.setVisible(true);
			Frame.dbdetails.setVisible(true);
			Frame.txtdb.setVisible(true);
			Frame.txtobj.setVisible(true);
			Frame.txtCamera_2.setBounds(858, 346, 130, 20);
			Frame.txtCamera.setBounds(150, 346, 130, 20);
			Frame.txtCamera_3.setBounds(500, 346, 135, 20);
			Frame.txtCamera_1.setBounds(500, 652, 130, 20);
		
			Frame.ptz.setBounds(150, 652, 125, 20);
			Frame.txtCamera_2.setVisible(true);
			Frame.txtCamera.setVisible(true);
			Frame.txtCamera_3.setVisible(true);
			Frame.txtCamera_3.setVisible(true);
			Frame.txtCamera_1.setVisible(true);
			Frame.ptz.setVisible(true);
			Frame.logger.setVisible(false);
			Frame.txtlog.setVisible(false);
			Frame.videoplay.setVisible(false);
			Frame.txtvideo.setVisible(false);
			Frame.suspobj.setVisible(false);
			Frame.txtsuspobj.setVisible(false);
			Frame.maindash.setText("PERSON / VEHICLE IDENTIFICATION");
			sosbtns.sosbtn.setVisible(false);
			Frame.GPS.setVisible(false);
			Frame.txtGPS.setVisible(false);
			Frame.soslog.setVisible(false);
			Frame.txtsoslog.setVisible(false);
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
			Frame.graphhold.setVisible(false);
			Frame.callog.setVisible(false);
			Frame.msglog.setVisible(false);
			Frame.txtmsg.setVisible(false);
			Frame.txtcall.setVisible(false);
			radar.h.setVisible(false);   
			ptzbtns.left.setVisible(false);
			ptzbtns.right.setVisible(false);
			ptzbtns.up.setVisible(false);
			ptzbtns.down.setVisible(false);
			videoplay.choose.setVisible(false);
			videoplay.mannualplay.setVisible(false);
			 ptzbtns.txtptzstate.setVisible(false);
			 ptzbtns.toggleButton.setVisible(false);
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
			Frame.txtCamera_2.setVisible(true);
			Frame.txtCamera.setVisible(true);
			Frame.txtCamera_3.setVisible(true);
			Frame.txtCamera_3.setVisible(true);
			Frame.txtCamera_1.setVisible(true);
			Frame.ptz.setVisible(true);
			canvas.campanel1.setBounds(23, 374, 352, 272); 
			canvas.campanel2.setBounds(739, 68, 352, 272);
			canvas.campanel4.setBounds(23, 68, 352, 272);
			canvas.campanel3.setBounds(381, 68, 352, 272);
			canvas.campanel5.setBounds(381, 374, 352, 272);
			canvas.campanel1.setVisible(true);
			canvas.campanel2.setVisible(true);
			canvas.campanel4.setVisible(true);
			canvas.campanel3.setVisible(true);
			canvas.campanel5.setVisible(true);
			Frame.panel.setVisible(false);
			Frame.panel_1.setVisible(false);
			Frame.panel_2.setVisible(false);
			Frame.panel_3.setVisible(false);
			Frame.panel_4.setVisible(false);
			Frame.panel_5.setVisible(false);
		
			Frame.layeredPane.setVisible(false);
			Frame.txtVehicleNumber.setVisible(false);
			Frame.txtOwnersName.setVisible(false);
			Frame.txtRcAddress.setVisible(false);
			Frame.txtRegest.setVisible(false);
			Frame.txtName.setVisible(false);
			Frame.txtAge.setVisible(false);
			Frame.txtAddress.setVisible(false);
			Frame.txtDateOfBirth.setVisible(false);
			Frame.object.setVisible(false);
			Frame.dbdetails.setVisible(false);
			Frame.txtdb.setVisible(false);
			Frame.txtobj.setVisible(false);
			Frame.maindash.setText("EVIDENCE MANAGMENT");
			Frame.logger.setVisible(true);
			Frame.txtlog.setVisible(true);
			Frame.videoplay.setVisible(true);
			Frame.txtvideo.setVisible(true);
			Frame.suspobj.setVisible(false);
			Frame.txtsuspobj.setVisible(false);
			sosbtns.sosbtn.setVisible(false);
			Frame.GPS.setVisible(false);
			Frame.txtGPS.setVisible(false);
			Frame.soslog.setVisible(false);
			Frame.txtsoslog.setVisible(false);
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
			Frame.graphhold.setVisible(false);
			Frame.callog.setVisible(false);
			Frame.msglog.setVisible(false);
			Frame.txtmsg.setVisible(false);
			Frame.txtcall.setVisible(false);
			radar.h.setVisible(false);
			ptzbtns.left.setVisible(false);
			ptzbtns.right.setVisible(false);
			ptzbtns.up.setVisible(false);
			ptzbtns.down.setVisible(false);
			videoplay.choose.setVisible(true);
			videoplay.mannualplay.setVisible(true);
			 ptzbtns.txtptzstate.setVisible(false);
			 ptzbtns.toggleButton.setVisible(false);
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
		Frame.txtCamera.setVisible(false);
		Frame.txtCamera_1.setVisible(false);
		Frame.txtCamera_2.setVisible(false);
		Frame.txtCamera_3.setVisible(false);
		canvas.campanel4.setVisible(false);
		canvas.campanel2.setVisible(false);
		canvas.campanel3.setVisible(false);
		canvas.campanel5.setVisible(false);
		canvas.campanel1.setVisible(false);
		Frame.panel.setVisible(false);
		Frame.panel_1.setVisible(false);
		Frame.panel_2.setVisible(false);
		Frame.panel_3.setVisible(false);
		Frame.panel_4.setVisible(false);
		Frame.panel_5.setVisible(false);
		Frame.layeredPane.setVisible(false);
		Frame.txtVehicleNumber.setVisible(false);
		//txtOwnersName.setVisible(false);
	//	txtRcAddress.setVisible(false);
	//	txtRegest.setVisible(false);
	//	txtName.setVisible(false);
	//	txtAge.setVisible(false);
	//	txtAddress.setVisible(false);
	//	txtDateOfBirth.setVisible(false);
		Frame.object.setVisible(false);
		Frame.dbdetails.setVisible(false);
		Frame.txtdb.setVisible(false);
		Frame.ptz.setVisible(false);
		Frame.txtobj.setVisible(false);
		Frame.logger.setVisible(false);
		Frame.txtlog.setVisible(false);
		Frame.videoplay.setVisible(false);
		Frame.txtvideo.setVisible(false);
		Frame.suspobj.setVisible(false);
		Frame.maindash.setText("SOS SIGNAL");
		Frame.txtsuspobj.setVisible(false);
		sosbtns.sosbtn.setVisible(true);
		Frame.GPS.setVisible(true);
		Frame.txtGPS.setVisible(true);
		Frame.soslog.setVisible(true);
		Frame.txtsoslog.setVisible(true);
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
		Frame.graphhold.setVisible(false);
		Frame.callog.setVisible(true);
		Frame.msglog.setVisible(true);
		Frame.txtmsg.setVisible(true);
		Frame.txtcall.setVisible(true);
		radar.h.setVisible(false);
		ptzbtns.left.setVisible(false);
		ptzbtns.right.setVisible(false);
		ptzbtns.up.setVisible(false);
		ptzbtns.down.setVisible(false);
		videoplay.choose.setVisible(false);
		videoplay.mannualplay.setVisible(false);
		 ptzbtns.txtptzstate.setVisible(false);
		 ptzbtns.toggleButton.setVisible(false);
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
