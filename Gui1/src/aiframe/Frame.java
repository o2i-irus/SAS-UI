package aiframe;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.*;
import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.*;   
import javax.swing.JFileChooser;
import java.util.TimerTask;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.application.Application;  
import javafx.scene.media.*; 
import javax.media.CannotRealizeException; 
import java.io.IOException; 
import java.awt.Component;
import java.io.File;  
import javafx.scene.Group;  
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration; 
import javafx.scene.media.Media;  
import javafx.scene.media.MediaPlayer;  
import javafx.scene.media.MediaView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import java.awt.Component;
import java.net.MalformedURLException;


import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import javax.swing.SwingUtilities;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;

import org.opencv.core.Core.*;
import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.CvType;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.highgui.VideoCapture;
import org.opencv.objdetect.CascadeClassifier;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;


import org.bytedeco.javacv.*;
import java.util.ArrayList;
import java.awt.Point;

import static org.bytedeco.javacpp.opencv_core.IplImage;
import static org.bytedeco.javacpp.opencv_core.cvFlip;
import static org.bytedeco.javacpp.opencv_imgcodecs.cvSaveImage;


//import io.github.psgs.cctv.gui.GUI;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;

import aiframe.CCTV.*;
import aiframe.test.*;
import aiframe.RefreshTask.*;
//import aiframe.CameraPanel.*;
import aiframe.graph;




 



public class Frame {

	public static JFrame frame;
	private JTextField txtCamera;
	private JTextField txtCamera_3;
	private JTextField txtCamera_2;
	 JTextField txtCamera_1;
	private JTextField textField;
	private JTextField txtVehicleNumber;
	private JTextField txtOwnersName;
	private JTextField txtRcAddress;
	private JTextField txtRegest;
	private JLabel label_1;
	private JFrame canvas_3frame;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtAddress;
	private JTextField txtDateOfBirth;
	private MediaPlayer mediaPanel;
	URL mediaUrl=null;
	private JFrame mediaTest;
	public Canvas radar;
	private ImageIcon icon;
	public Canvas canvas_2;
	public static ImageIcon cam;
	public static JLabel camholder;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	

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
	public Frame() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(0, 0, 1920, 1080);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
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
	
		JTextField maindash = new JTextField();
		maindash.setText("MAIN DASHBOARD");
		maindash.setBounds(702, 22, 300, 29);
		frame.getContentPane().add(maindash);
		maindash.setColumns(10);
		    maindash.setForeground(Color.YELLOW);
			maindash.setBackground(null);
			maindash.setEditable(false);
			maindash.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			maindash.setHighlighter( null );
			maindash.setBorder(null); 
			
			
		
		
		Canvas canvas_3 = new Canvas();
		
		canvas_3.addMouseListener(new MouseAdapter() 
		{
			
			public void mouseClicked(MouseEvent e)
			{
				JFrame canvas_3frame = new JFrame("Camera 3");
				canvas_3frame.pack();
				canvas_3frame.getContentPane().setBackground(Color.WHITE);
				canvas_3frame.setBounds(0, 0, 1200, 700);
				canvas_3frame.setResizable(false);
				canvas_3frame.setVisible(true);
				Canvas canvas_3new = new Canvas();
				canvas_3new.setBackground(Color.BLACK);
				canvas_3frame.getContentPane().add(canvas_3new);
			
			}
		});
		canvas_3.setBackground(Color.DARK_GRAY);
		
		canvas_3.setBounds(381, 374, 352, 272);
		
		
		frame.getContentPane().add(canvas_3);
		
		
		
		
		
		
		JTextField ptz = new JTextField();
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
		
		Canvas canvas_4 = new Canvas();
		canvas_4.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				JFrame canvas_4frame = new JFrame("Camera 4");
				canvas_4frame.pack();
				canvas_4frame.getContentPane().setBackground(Color.WHITE);
				canvas_4frame.setBounds(0, 0, 1200, 700);
				canvas_4frame.setResizable(false);
				canvas_4frame.setVisible(true);
				Canvas canvas_4new = new Canvas();
				canvas_4new.setBackground(Color.DARK_GRAY);
				canvas_4frame.getContentPane().add(canvas_4new);
				
			}
		});
		canvas_4.setBackground(Color.DARK_GRAY);
		canvas_4.setBounds(23, 374, 352, 272); 
		frame.getContentPane().add(canvas_4);
		
		
		Canvas canvas_1 = new Canvas();
		canvas_1.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				
				JFrame canvas_1frame = new JFrame("Camera 1");
				canvas_1frame.pack();
				canvas_1frame.getContentPane().setBackground(Color.WHITE);
				canvas_1frame.setBounds(0, 0, 1200, 700);
				canvas_1frame.setResizable(false);
				canvas_1frame.setVisible(true);
				Canvas canvas_1new = new Canvas();
				canvas_1new.setBackground(Color.DARK_GRAY);
				canvas_1frame.getContentPane().add(canvas_1new);
				
			}
		});
		canvas_1.setBackground(Color.DARK_GRAY);
		canvas_1.setBounds(739, 68, 352, 272);
		frame.getContentPane().add(canvas_1);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				JFrame canvas_2frame = new JFrame("Camera 2");
				canvas_2frame.pack();
				canvas_2frame.getContentPane().setBackground(Color.WHITE);
				canvas_2frame.setBounds(0, 0, 1200, 700);
				canvas_2frame.setResizable(false);
				canvas_2frame.setVisible(true);
				Canvas canvas_2new = new Canvas();
				canvas_2new.setBackground(Color.DARK_GRAY);
				canvas_2frame.getContentPane().add(canvas_2new);
				
			}
		});
		canvas_2.setBackground(Color.DARK_GRAY);
		canvas_2.setBounds(381, 68, 352, 272);
		frame.getContentPane().add(canvas_2);
		
	
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(225, 225, 225), 2));
		
		layeredPane.setBounds(970, 358, 126, 212);
		layeredPane.setVisible(false);
		
		
		frame.getContentPane().add(layeredPane);
		
		int p=800;
		
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
		 
		
		
		 
		
		Canvas canvas = new Canvas();
		canvas.setBounds(23, 68, 352, 272);
		canvas.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				JFrame canvasframe = new JFrame("Camera 0");
				canvasframe.pack();
				canvasframe.getContentPane().setBackground(Color.WHITE);
				canvasframe.setBounds(0, 0, 1200, 700);
				canvasframe.setResizable(false);
				canvasframe.setVisible(true);
				Canvas canvasnew = new Canvas();
				canvasnew.setBackground(Color.DARK_GRAY);
				canvasframe.getContentPane().add(canvasnew);
				
			}
		});
		canvas.setBackground(Color.DARK_GRAY);
	    frame.getContentPane().add(canvas);
		
		
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\hp\\Pictures\\radar.png");
		JLabel radar=new JLabel(icon);
    	frame.getContentPane().add(radar);
    	radar.setBackground(Color.BLACK);
		radar.setBounds(662, 63, 430, 229);
	    radar.setVisible(false);
	   
	  /*  MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
	    CanvasVideoSurface videoSurface = mediaPlayerFactory.newVideoSurface(radar);
	    EmbeddedMediaPlayer mediaPlayer = mediaPlayerFactory.newEmbeddedMediaPlayer();
	    mediaPlayer.setVideoSurface(videoSurface);
	    MediaListPlayer mediaListPlayer = mediaPlayerFactory.newMediaListPlayer();
	    MediaList mediaList = mediaPlayerFactory.newMediaList(); */
	    
		 
		
	 
	/*	class MediaPlayer  {
	    	public  MediaPlayer(URL mediauUrl) {
	    	
	    	   try  {
	    		   Player mediaPlayer=Manager.createRealizedPlayer(new MediaLocator(mediauUrl));
	    		   Component video=mediaPlayer.getVisualComponent();	    		    
	    		   Component control=mediaPlayer.getControlPanelComponent();
	    		  add(video, BorderLayout.CENTER);
	    		   add(control, BorderLayout.SOUTH); 
	    		   mediaPlayer.start();
	    	   }
	    	   catch (Exception e) {}
	    	   finally {}
	    	   JFileChooser fileChooser = new JFileChooser();
	    	   fileChooser.showOpenDialog(null);
	    	   File file = new File("C:\\Users\\Pratish\\Downloads\\Video\\radar.mp4"); 
	    	   URL mediaUrl=null;
	    	   try {
	    		   
	    		   mediaUrl = fileChooser.getSelectedFile().toURI().toURL();

	    	   }
	    	   catch (MalformedURLException ex) {System.out.println(ex);}
	    	   finally {}
	    	}
	    	{
		    	
	    		
	    		
	    		
	    		
	    		MediaPlayer mediaPanel = new MediaPlayer( mediaUrl );
	    		frame.add( mediaPanel );
		        mediaPanel.setVisible( true );
			    } 
	    }*/
	    
	   
		/*JPanel test= new JPanel();
    	frame.getContentPane().add(test);
    	test.setBackground(Color.BLACK);
		test.setBounds(521, 96, 500, 400);
	    test.setVisible(true);
	    test.setImage();
		
		*/
	 
	    
		
		
		class DigitalClock extends Frame {

		    
		    {
		        new DigitalClock();
		    }

		    public DigitalClock() {
		        EventQueue.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		                try {
		                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		                } catch (ClassNotFoundException ex) {
		                } catch (InstantiationException ex) {
		                } catch (IllegalAccessException ex) {
		                } catch (UnsupportedLookAndFeelException ex) {
		                }

		               // JFrame clockframe = new JFrame("Test");
		               // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		               // frame.getContentPane().setLayout(new BorderLayout());
		                frame.getContentPane().add(new TestPane());
		              //  frame.pack();
		               // frame.setLocationRelativeTo(null);
		               // frame.setVisible(true);
		            }

		        });
		    }

		     class TestPane extends JPanel {

		        private DigitPane hour;
		        private DigitPane min;
		        private DigitPane second;
		        private JLabel[] seperator;

		        private int tick = 0;

		        public TestPane() {
		            setLayout(new GridBagLayout());

		            hour = new DigitPane();
		            min = new DigitPane();
		            second = new DigitPane();
		            seperator = new JLabel[]{new JLabel(":"), new JLabel(":")};

		            add(hour);
		            add(seperator[0]);
		            add(min);
		            add(seperator[1]);
		            add(second);

		            Timer timer = new Timer(500, new ActionListener() {
		                @Override
		                public void actionPerformed(ActionEvent e) {
		                    Calendar cal = Calendar.getInstance();
		                    hour.setValue(cal.get(Calendar.HOUR_OF_DAY));
		                    min.setValue(cal.get(Calendar.MINUTE));
		                    second.setValue(cal.get(Calendar.SECOND));

		                    if (tick % 2 == 1) {
		                        seperator[0].setText(" ");
		                        seperator[1].setText(" ");
		                    } else {
		                        seperator[0].setText(":");
		                        seperator[1].setText(":");
		                    }
		                    tick++;
		                }
		            });
		            timer.setRepeats(true);
		            timer.setCoalesce(true);
		            timer.start();
		        }

		    }

		     class DigitPane extends JPanel {

		        private int value;

		        @Override
		        public Dimension getPreferredSize() {
		            FontMetrics fm = getFontMetrics(getFont());
		            return new Dimension(fm.stringWidth("00"), fm.getHeight());
		        }

		        public void setValue(int aValue) {
		            if (value != aValue) {
		                int old = value;
		                value = aValue;
		                firePropertyChange("value", old, value);
		                repaint();
		            }
		        }

		        public int getValue() {
		            return value;
		        }

		        protected String pad(int value) {
		            StringBuilder sb = new StringBuilder(String.valueOf(value));
		            while (sb.length() < 2) {
		                sb.insert(0, "0");
		            }
		            return sb.toString();
		        }

		        @Override
		        protected void paintComponent(Graphics g) {
		            super.paintComponent(g); 
		            String text = pad(getValue());
		            FontMetrics fm = getFontMetrics(g.getFont());
		            int x = (getWidth() - fm.stringWidth(text)) / 2;
		            int y = ((getHeight()- fm.getHeight()) / 2) + fm.getAscent();
		            g.drawString(text, x, y);
		        }        
		    }    
		}
		 
		  
		{  JTextField  dateField= new JTextField();
		  
		   	frame.getContentPane().add( dateField);
		   	dateField.setForeground(Color.YELLOW);
		   	dateField.setBounds(1082, 22, 100, 40);
		    dateField.setVisible(true);
		    dateField.setEditable(false);
		    dateField.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		    dateField.setColumns(10);
		    dateField.setHighlighter( null );
		    //dateField.setBorder(null);
		    dateField.setBackground(null);
		
	     //  javax.swing.Timer t = new javax.swing.Timer(1000, new DateListener());
	       // t.start();
		
	         
		    
	       
	        	 
	            Calendar now = Calendar.getInstance();
	            int month = now.get(Calendar.MONTH);
	            int day = now.get(Calendar.DAY_OF_MONTH);
	            int year = now.get(Calendar.YEAR);
	            dateField.setText("" + (month + 1) + "/" + day + "/" + year);
	 
	    	
		}
	
		
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
		
		
		
		 JButton dash = new JButton("DASHBOARD");
		 dash.setForeground(Color.YELLOW);
		 dash.setBackground(null);
		 dash.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		 dash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(false);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("MAIN DASHBOARD");
				canvas.setBounds(23, 68, 352, 272);
				canvas_2.setBounds(381, 68, 352, 272);
				canvas_1.setBounds(739, 68, 352, 272);
				canvas_4.setBounds(23, 374, 352, 272); 
				canvas_3.setBounds(381, 374, 352, 272);
				txtCamera.setBounds(150, 346, 130, 20);
				txtCamera_3.setBounds(500, 346, 135, 20);
				txtCamera_2.setBounds(858, 346, 130, 20);
				ptz.setBounds(150, 652, 125, 20);
				txtCamera_1.setBounds(500, 652, 130, 20);
				canvas.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				canvas_4.setVisible(true);
				canvas_1.setVisible(true);
				txtCamera.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_2.setVisible(true);
				txtCamera_1.setVisible(true);
				ptz.setVisible(true);
			}
		});
		 dash.setBounds(1145, 72, 126, 40);
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
	/*	try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnNewButton);
	}
catch(Exception e) {
	
	        e.printStackTrace();
	
	  } */
		


		frame.getContentPane().add(dash);
		
		
		
		JButton btnRadar = new JButton("PERSON TRACKING");
		btnRadar.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnRadar.setForeground(Color.YELLOW);
		btnRadar.setBackground(null);
		btnRadar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 

				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(true);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("PERSON TRACKING");
				canvas.setBounds(635, 298, 249, 177);
				canvas_2.setBounds(890, 298, 249, 177);
				canvas_1.setBounds(767, 502, 249, 177);
				canvas_3.setBounds(1022, 502, 249, 177);
				canvas_4.setBounds(38, 96, 591, 470);
				txtCamera.setBounds(727, 481, 130, 20);
				txtCamera_3.setBounds(958, 481, 130, 20);
				txtCamera_2.setBounds(851, 684, 130, 20);
				txtCamera_1.setBounds(1097, 684, 130, 20);
				ptz.setBounds(263, 572, 125, 20);
				canvas.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				canvas_4.setVisible(true);
				canvas_1.setVisible(true);
				txtCamera.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_2.setVisible(true);
				txtCamera_1.setVisible(true);
				ptz.setVisible(true);

			}
		});
		btnRadar.setBounds(1145, 123, 126, 40);
		
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
	/*	try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnRadar);
	}
catch(Exception e) {
	
	        e.printStackTrace();
}  */
	  
		frame.getContentPane().add(btnRadar);
		
		
		
		JButton btnIdentification = new JButton("MOB INTENSITY LEVEL ");
		btnIdentification.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnIdentification.setForeground(Color.YELLOW);
		btnIdentification.setBackground(null);
		btnIdentification.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{ 
				
				panel.setVisible(true);
				panel_1.setVisible(true);
				panel_2.setVisible(true);
				panel_3.setVisible(true);
				panel_4.setVisible(true);
				panel_5.setVisible(true);
				radar.setVisible(true);
				
				layeredPane.setVisible(true);
				radar.setBounds(735, 70, 400, 229);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				canvas_1.setBounds(23, 374, 352, 272);
				txtCamera_2.setBounds(150, 652, 125, 20);
				maindash.setText("MOB INTENSITY LEVEL");
				canvas.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				canvas_4.setVisible(false);
				canvas_1.setVisible(true);
				txtCamera.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_2.setVisible(true);
				txtCamera_1.setVisible(true);
				ptz.setVisible(false);
				canvas_2.setBounds(381, 68, 352, 272);
				canvas.setBounds(23, 68, 352, 272);
				canvas_3.setBounds(381, 374, 352, 272);
				txtCamera.setBounds(150, 346, 130, 20);
				txtCamera_3.setBounds(500, 346, 135, 20);	
				ptz.setBounds(150, 652, 125, 20);
				txtCamera_1.setBounds(500, 652, 130, 20);
				
			}
		});
		btnIdentification.setBounds(1145, 174, 126, 40);
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
	/*	try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnIdentification);
	}
catch(Exception e) {
	
	        e.printStackTrace();
	
	  } */
		
		frame.getContentPane().add(btnIdentification);
		
		JButton btnIVehicleID = new JButton("IDENTIFICATION");
		btnIVehicleID.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		btnIVehicleID.setForeground(Color.YELLOW);
		btnIVehicleID.setBackground(null);
		btnIVehicleID.addActionListener(new ActionListener() {
			
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
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(false);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(true);
				txtOwnersName.setVisible(true);
				txtRcAddress.setVisible(true);
				txtRegest.setVisible(true);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("PERSON / VEHICLE IDENTIFICATION");
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
	/*	try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnIdentification);
	}
catch(Exception e) {
	
	        e.printStackTrace();
	
	  } */
		
		frame.getContentPane().add(btnIVehicleID);
		
		
		JButton evidence = new JButton("EVIDENCE MANAGMENT");
		evidence.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		evidence.setVisible(true);
		evidence.setBackground(null);
		evidence.setForeground(Color.YELLOW);
		evidence.addActionListener(new ActionListener() {
			
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
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(false);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("EVIDENCE MANAGMENT");
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
/*		try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnIdentification);
	}
catch(Exception e) {
	
	        e.printStackTrace();
	
	  } */
		frame.getContentPane().add(evidence);
		
		JButton sos = new JButton("SOS SIGNAL");
            sos.addActionListener(new ActionListener() {
			
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
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(false);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("SOS SIGNAL");
			}
		});  
		sos.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		sos.setForeground(Color.YELLOW);
		sos.setBackground(null);
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
	/*	try {
			
			 UIManager.setLookAndFeel(new NimbusLookAndFeel());
	
			 SwingUtilities.updateComponentTreeUI(btnIdentification);
	}
catch(Exception e) {
	
	        e.printStackTrace();
	
	  } */
		sos.setVisible(true);
		sos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		frame.getContentPane().add(sos);
		
		JTextField company = new JTextField();
		company.setText("INDIGENOUS ROBOTIC UNMANNED SYSTEMS [IRUS]");
		company.setBounds(10, 664, 500, 40);
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
	    
	    
		JButton suspact = new JButton("SUSPICIOUS ACTIVITY");
		suspact.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		suspact.setVisible(true);
		suspact.setBackground(null);
		suspact.setForeground(Color.YELLOW);
		suspact.addActionListener(new ActionListener() {
			
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
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_5.setVisible(false);
				radar.setVisible(false);
				layeredPane.setVisible(false);
				txtVehicleNumber.setVisible(false);
				txtOwnersName.setVisible(false);
				txtRcAddress.setVisible(false);
				txtRegest.setVisible(false);
				txtName.setVisible(false);
				txtAge.setVisible(false);
				txtAddress.setVisible(false);
				txtDateOfBirth.setVisible(false);
				maindash.setText("SUSPICIOUS ACTIVITY DETECTION");
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
	  
	frame.getContentPane().add(suspact);
	
	
		
		
		
		
	
		
			}
}

