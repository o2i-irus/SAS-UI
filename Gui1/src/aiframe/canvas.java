package aiframe;
import java.awt.Color;import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import aiframe.Frame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.xuggle.mediatool.IMediaListener;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;


public class canvas {
	public static JLabel campanel1;
	public static JLabel campanel2;
	public static JLabel campanel3;
	public static JLabel campanel4;
	public static JLabel campanel5;
	
	public static JLabel campanel1p;
	public static JLabel campanel2p;
	public static JLabel campanel3p;
	public static JLabel campanel4p;
	public static JLabel campanel5p;
	
	
	
	

	
	
	public void canvasmain() 
	{   
		
		
	
		
		 campanel1 = new JLabel();    //PTZ Cam
		campanel1.setBackground(Color.DARK_GRAY);
		campanel1.setBounds(23, 374, 352, 272); 
		campanel1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	    Frame.frame.getContentPane().add(campanel1);	
		/*campanel1.addMouseListener(new MouseAdapter() 
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
			});   */
		
		
		
			
			
		    campanel2 = new JLabel();     //Right Cam
		    campanel2.setBackground(Color.DARK_GRAY);
		    campanel2.setBounds(739, 68, 352, 272);
		    campanel2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    Frame.frame.getContentPane().add(campanel2);
		   /* campanel2.addMouseListener(new MouseAdapter() 
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
			});  */
		    
			
			 campanel3 = new JLabel();   //Front Cam
			 campanel3.setBackground(Color.DARK_GRAY);
			 campanel3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			 campanel3.setBounds(381, 68, 352, 272);
			 Frame.frame.getContentPane().add(campanel3);
		/*	 campanel3.addMouseListener(new MouseAdapter() 
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
			});  */
			
			
			
			
			 campanel4 = new JLabel();    //Left Cam
			 campanel4.setBounds(23, 68, 352, 272);
			 campanel4.setBackground(Color.DARK_GRAY);
			 campanel4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
			Frame.frame.getContentPane().add(campanel4);
		/*	 campanel4.addMouseListener(new MouseAdapter() 
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
			});   */
			
		
		 campanel5 = new JLabel();   //Back Cam
		 campanel5.setBackground(Color.DARK_GRAY);
		 campanel5.setBounds(381, 374, 352, 272);
		 campanel5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		Frame.frame.getContentPane().add(campanel5);
		/*campanel5.addMouseListener(new MouseAdapter() 
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
		});  */
		
		
		    campanel1p = new JLabel();    //PTZ Cam processed
			campanel1p.setBackground(Color.DARK_GRAY);
			campanel1p.setVisible(false);
			campanel1p.setBounds(23, 374, 352, 272); 
			campanel1p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		    Frame.frame.getContentPane().add(campanel1p);	
		    
		    
		    campanel2p = new JLabel();     //Right Cam processed
		    campanel2p.setBackground(Color.DARK_GRAY);
		    campanel2p.setVisible(false);
		    campanel2p.setBounds(739, 68, 352, 272);
		    campanel2p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		    Frame.frame.getContentPane().add(campanel2p);
		    
		    
		    campanel3p = new JLabel();   //Front Cam processed
			 campanel3p.setBackground(Color.DARK_GRAY);
			 campanel3p.setVisible(false);
			 campanel3p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			 campanel3p.setBounds(381, 68, 352, 272);
			 Frame.frame.getContentPane().add(campanel3p);
			 
			 
			 campanel4p = new JLabel();    //Left Cam processed
			 campanel4p.setBounds(23, 68, 352, 272);
			 campanel4p.setBackground(Color.DARK_GRAY);
			 campanel4p.setVisible(false);
			 campanel4p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			Frame.frame.getContentPane().add(campanel4p);
			
			
			campanel5p = new JLabel();   //Back Cam processed
			 campanel5p.setBackground(Color.DARK_GRAY);
			 campanel5p.setVisible(false);
			 campanel5p.setBounds(381, 374, 352, 272);
			 campanel5p.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			Frame.frame.getContentPane().add(campanel5p);
			
			
			
			 
			 
		 
	}

}
