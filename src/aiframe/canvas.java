package aiframe;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import aiframe.Frame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;





public class canvas {
	public static Canvas campanel1;
	public static Canvas campanel2;
	public static Canvas campanel3;
	public static Canvas campanel4;
	public static Canvas campanel5;
	
	public static Canvas campanel1p;
	public static Canvas campanel2p;
	public static Canvas campanel3p;
	public static Canvas campanel4p;
	public static Canvas campanel5p;
	
	public static JInternalFrame j1;
	public static JInternalFrame j2;
	public static JInternalFrame j3;
	public static JInternalFrame j4;
	public static JInternalFrame j5;
	public static JInternalFrame j6;
	public static JInternalFrame j7;
	public static JInternalFrame j8;
	public static JInternalFrame j9;
	public static JInternalFrame j10;
	
	

	
	
	public void canvasmain() 
	{   
			
			
			 
			 
		
	
	    j1 = new JInternalFrame();
	   // j1.setLayout(null);
	  //  j1.setBackground(Color.DARK_GRAY);
		 j1.setBounds(23, 374, 352, 272); //frame
		// j1.setBounds(23, 310, 352, 272); //layered pane
		 j1.setVisible(true);
		
	    j1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	     j1.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
	     j1.setResizable(false);
	    ((javax.swing.plaf.basic.BasicInternalFrameUI)j1.getUI()).setNorthPane(null);
	    
		
		 campanel1 = new Canvas(); //PTZ Cam
		 campanel1.setVisible(true);
		// campanel1.setBounds(23, 374, 352, 272);
		 campanel1.setBackground(Color.DARK_GRAY);
		j1.add(campanel1);
	 Frame.frame.getContentPane().add(j1);	
	
		/*j1.addMouseListener(new MouseAdapter() 
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
		
		
		
			
			
		  j2 = new JInternalFrame();
		 // j2.setLayout(null);
		    // j2.setBackground(Color.DARK_GRAY);
			 j2.setBounds(739, 68, 352, 272); //frame
			// j2.setBounds(739, 5, 352, 272); //layered pane
			 j2.setVisible(true);
			 j2.setBorder( null );
		     j2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		     j2.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		     j2.setResizable(false);
		    ((javax.swing.plaf.basic.BasicInternalFrameUI)j2.getUI()).setNorthPane(null);
		    
			
			 campanel2 = new Canvas();    //right Cam
			 j2.add(campanel2);
			 campanel2.setBackground(Color.DARK_GRAY);
			 campanel2.setVisible(true);
			 Frame.frame.getContentPane().add(j2);	
		
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
		    
			
			 j3 = new JInternalFrame();
			// j3.setLayout(null);
		     //j3.setBackground(Color.DARK_GRAY);
			 j3.setBounds(381, 68, 352, 272); //frame
			 //j3.setBounds(381,5,352,272);    //layered pane
			 j3.setVisible(true);
			 j3.setBorder( null );
		     j3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		     j3.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		     j3.setResizable(false);
		    ((javax.swing.plaf.basic.BasicInternalFrameUI)j3.getUI()).setNorthPane(null);
		    
			
			 campanel3 = new Canvas();    //front Cam
			 campanel3.setVisible(true);
			 campanel3.setBackground(Color.DARK_GRAY);
			 j3.add(campanel3);
			 Frame.frame.getContentPane().add(j3);	
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
			
			
			
			
			 j4 = new JInternalFrame();
			// j4.setLayout(null);
		    // j4.setBackground(Color.DARK_GRAY);
			j4.setBounds(23, 68, 352, 272);  //frame
			 //j4.setBounds(23, 5, 352, 272);  //layered pane
			 j4.setVisible(true);
			 j4.setBorder( null );
		     j4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		     j4.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		     j4.setResizable(false);
		    ((javax.swing.plaf.basic.BasicInternalFrameUI)j4.getUI()).setNorthPane(null);
		    
			
			 campanel4 = new Canvas();    //left Cam
			 campanel4.setVisible(true);
			 campanel4.setBackground(Color.DARK_GRAY);
			 j4.add(campanel4);
			 Frame.frame.getContentPane().add(j4);	
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
			
		
			 j5 = new JInternalFrame();
		//	 j5.setLayout(null);
		 //    j5.setBackground(Color.DARK_GRAY);
			 j5.setBounds(381, 374, 352, 272); //frame
			// j5.setBounds(381, 310, 352, 272); //layered pane
			 j5.setVisible(true);
			 j5.setBorder( null );
		     j5.setBorder(BorderFactory.createLineBorder(Color.yellow));
		     j5.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
		     j5.setResizable(false);
		    ((javax.swing.plaf.basic.BasicInternalFrameUI)j5.getUI()).setNorthPane(null);
		    
			
			 campanel5 = new Canvas();    //Back Cam
			 campanel5.setVisible(true);
			 campanel5.setBackground(Color.DARK_GRAY);
			 j5.add(campanel5);
			Frame.frame.getContentPane().add(j5);	
			
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
		
		
		
			 j6 = new JInternalFrame();
				// j6.setLayout(null);
			    // j6.setBackground(Color.DARK_GRAY);
				// j6.setBounds(23, 374, 352, 272); //frame
				 j6.setBounds(13, 309, 352, 272); //layered pane
				 j6.setVisible(true);
				 j6.setBorder( null );
			    
			     j6.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			     j6.setResizable(false);
			    ((javax.swing.plaf.basic.BasicInternalFrameUI)j6.getUI()).setNorthPane(null);
			    
				 j6.setBorder(BorderFactory.createLineBorder(Color.green));
				 campanel1p = new Canvas();    //PTZ Cam processed
				// campanel1p.setVisible(true);
				 campanel1p.setBackground(Color.DARK_GRAY);
				j6.add(campanel1p);
				//Frame.frame.getContentPane().add(j6);	
				 
				 
				 
				 j7 = new JInternalFrame();
				// j7.setLayout(null);
			    // j7.setBackground(Color.DARK_GRAY);
				// j7.setBounds(739, 68, 352, 272); //frame
				 j7.setBounds(729, 3, 352, 272); //layered pane
				 j7.setVisible(true);
				 j7.setBorder( null );
			     
			     j7.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			     j7.setResizable(false);
			    ((javax.swing.plaf.basic.BasicInternalFrameUI)j7.getUI()).setNorthPane(null);
			    
				 j7.setBorder(BorderFactory.createLineBorder(Color.green));
				 campanel2p = new Canvas();    //right Cam processed
				 campanel2p.setVisible(true);
				 campanel2p.setBackground(Color.DARK_GRAY);
				 j7.add(campanel2p);
				//Frame.frame.getContentPane().add(j7);	
				 
				
				 j8 = new JInternalFrame();
				 //j8.setLayout(new BorderLayout());
			    // j8.setBackground(Color.DARK_GRAY);
				// j8.setBounds(381, 68, 352, 272); //frame
            	 j8.setBounds(371,3,352,272);    //layered pane
				 j8.setVisible(true);
				 j8.setBorder( null );
			    
			     j8.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			     j8.setResizable(false);
			    ((javax.swing.plaf.basic.BasicInternalFrameUI)j8.getUI()).setNorthPane(null);
			    
				 j8.setBorder(BorderFactory.createLineBorder(Color.green));
				 campanel3p = new Canvas();    //front Cam processed
				 campanel3p.setVisible(true);
				 campanel3p.setBackground(Color.DARK_GRAY);
				 j8.getContentPane().add(campanel3p);
			//	Frame.frame.getContentPane().add(j8);	
			    
			    
			    
			    
				 j9 = new JInternalFrame();
				// j9.setLayout(null);
			 //    j9.setBackground(Color.DARK_GRAY);
				// j9.setBounds(23, 68, 352, 272); //frame
				 j9.setBounds(13, 3, 352, 272);  //layered pane
				 j9.setVisible(true);
				 j9.setBorder( null );
			     
			     j9.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			     j9.setResizable(false);
			    ((javax.swing.plaf.basic.BasicInternalFrameUI)j9.getUI()).setNorthPane(null);
			    
				 j9.setBorder(BorderFactory.createLineBorder(Color.green));
				 campanel4p = new Canvas();    //left Cam processed
				 campanel4p.setVisible(true);
				 campanel4p.setBackground(Color.DARK_GRAY);
				 j9.add(campanel4p);
			//	Frame.frame.getContentPane().add(j9);	
				 
				 
				 j10 = new JInternalFrame();
				// j10.setLayout(null);
			    // j10.setBackground(Color.DARK_GRAY);
				// j10.setBounds(381, 374, 352, 272); //frame
				 j10.setBounds(371, 309, 352, 272); //layered pane
				 
				 j10.setVisible(true);
				 j10.setBorder( null );
			     j10.setBorder(BorderFactory.createLineBorder(Color.green));
			     j10.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
			     j10.setResizable(false);
			    ((javax.swing.plaf.basic.BasicInternalFrameUI)j10.getUI()).setNorthPane(null);
			    
				 
				 campanel5p = new Canvas();    //back Cam processed
				 campanel5p.setVisible(true);
				 campanel5p.setBackground(Color.DARK_GRAY);
				j10.add(campanel5p);
			//	Frame.frame.getContentPane().add(j10);	
			
			
			
			
			 
			 
		 
	}

}
