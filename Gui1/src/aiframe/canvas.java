package aiframe;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import aiframe.Frame;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import com.github.sarxos.webcam.WebcamPanel;

import aiframe.webcam;

public class canvas {
	public static WebcamPanel campanel1;
	public static WebcamPanel campanel2;
	public static WebcamPanel campanel3;
	public static WebcamPanel campanel4;
	public static WebcamPanel campanel5;
	public void canvasmain() 
	{
		 campanel1 = new WebcamPanel(webcam.cam1);    //PTZ Cam
		campanel1.setBackground(Color.DARK_GRAY);
		campanel1.setBounds(23, 374, 352, 272); 
		campanel1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		campanel1.setImageSizeDisplayed(true);               //new
		campanel1.setFPSDisplayed(true);                        //new
		campanel1.setMirrored(true);
	    Frame.frame.getContentPane().add(campanel1);	
		campanel1.addMouseListener(new MouseAdapter() 
			{
				public void mouseClicked(MouseEvent e)
				{
					JFrame campanel1frame = new JFrame("PTZ CAMERA");
					campanel1frame.pack();
					campanel1frame.getContentPane().setBackground(Color.WHITE);
					campanel1frame.setBounds(0, 0, 1200, 700);
					campanel1frame.setResizable(true);
					campanel1frame.setVisible(true);
					campanel1frame.getContentPane().add(campanel1);
					
				}
			});
			
			
		    campanel2 = new WebcamPanel(webcam.cam2);     //Right Cam
		    campanel2.setBackground(Color.DARK_GRAY);
		    campanel2.setBounds(739, 68, 352, 272);
		    campanel2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    campanel2.setMirrored(true);
		    campanel2.setImageSizeDisplayed(true);               //new
			campanel2.setFPSDisplayed(true);  
			Frame.frame.getContentPane().add(campanel2);
		    campanel2.addMouseListener(new MouseAdapter() 
			{
				public void mouseClicked(MouseEvent e)
				{
					
					JFrame campanel2frame = new JFrame("RIGHT CAMERA");
					campanel2frame.pack();
					campanel2frame.getContentPane().setBackground(Color.WHITE);
					campanel2frame.setBounds(0, 0, 1200, 700);
					campanel2frame.setResizable(true);
					campanel2frame.setVisible(true);
					campanel2frame.getContentPane().add(campanel2);
					
				}
			});
		    
			
			 campanel3 = new WebcamPanel(webcam.cam3);   //Front Cam
			 campanel3.setBackground(Color.DARK_GRAY);
			 campanel3.setBounds(381, 68, 352, 272);
			 campanel3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			 campanel3.setMirrored(true);
			 campanel3.setImageSizeDisplayed(true);               //new
				campanel3.setFPSDisplayed(true);  
			Frame.frame.getContentPane().add(campanel3);
			 campanel3.addMouseListener(new MouseAdapter() 
			{
				public void mouseClicked(MouseEvent e)
				{
					JFrame campanel3frame = new JFrame("FRONT CAMERA");
					campanel3frame.pack();
					campanel3frame.getContentPane().setBackground(Color.WHITE);
					campanel3frame.setBounds(0, 0, 1200, 700);
					campanel3frame.setResizable(true);
					campanel3frame.setVisible(true);
					campanel3frame.getContentPane().add(campanel3);
					
				}
			});
			
			
			
			
			 campanel4 = new WebcamPanel(webcam.cam4);    //Left Cam
			 campanel4.setBounds(23, 68, 352, 272);
			 campanel4.setBackground(Color.DARK_GRAY);
			 campanel4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			 campanel4.setMirrored(true);
			 campanel4.setImageSizeDisplayed(true);               //new
				campanel4.setFPSDisplayed(true);  
			Frame.frame.getContentPane().add(campanel4);
			 campanel4.addMouseListener(new MouseAdapter() 
			{
				public void mouseClicked(MouseEvent e)
				{
					JFrame campanel4frame = new JFrame("LEFT CAMERA");
					campanel4frame.pack();
					campanel4frame.getContentPane().setBackground(Color.WHITE);
					campanel4frame.setBounds(0, 0, 1200, 700);
					campanel4frame.setResizable(true);
					campanel4frame.setVisible(true);
					campanel4frame.getContentPane().add(campanel4);
					
				}
			});
			
		
		 campanel5 = new WebcamPanel(webcam.cam5);   //Back Cam
		 campanel5.setBackground(Color.DARK_GRAY);
		 campanel5.setBounds(381, 374, 352, 272);
		 campanel5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		 campanel5.setMirrored(true);
		 campanel5.setImageSizeDisplayed(true);               //new
			campanel5.setFPSDisplayed(true);  
		Frame.frame.getContentPane().add(campanel5);
		campanel5.addMouseListener(new MouseAdapter() 
		{
			
			public void mouseClicked(MouseEvent e)
			{
				JFrame campanel5frame = new JFrame("BACK CAMERA");
				campanel5frame.pack();
				campanel5frame.getContentPane().setBackground(Color.WHITE);
				campanel5frame.setBounds(0, 0, 1200, 700);
				campanel5frame.setResizable(true);
				campanel5frame.setVisible(true);
				campanel5frame.getContentPane().add(campanel5);
			
			}
		});
		 
	}

}
