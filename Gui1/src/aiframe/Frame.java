
  
package aiframe;
import java.awt.EventQueue;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;

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
import javafx.scene.image.*;
import javafx.scene.paint.*; 
import javax.swing.Timer;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.awt.Canvas;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
import java.time.*;
import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.*;

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
import aiframe.Frame;
import aiframe.canvas;
import aiframe.evddb.*;
import aiframe.clock;
import aiframe.cpuload;
import aiframe.graph;
import aiframe.radar;
import aiframe.calender.*;
import aiframe.buttons;
import aiframe.sosbtns;








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
		public static JButton sosbtn;
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
		
		// test c = new test();
		new test().hello();
		
		//clock clockcall = new clock();
		//clock.clock();
		new clock().clock();
		
		new calender().calender();
		
	
		//new graph().graph();
		
		new radar().radarmain();
		
		new sosbtns().sosbtnsmain();
		
		
		new buttons().buttonsmain();
	//	new cpuload().cpuload();
		
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
		maindash.setBounds(750, 22, 300, 29);
		frame.getContentPane().add(maindash);
		maindash.setColumns(10);
		    maindash.setForeground(Color.YELLOW);
			maindash.setBackground(null);
			maindash.setEditable(false);
			maindash.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
			maindash.setHighlighter( null );
			maindash.setBorder(null); 
			
			
			
			
			 canvas_4 = new Canvas();
			
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
		
			 Frame.frame.getContentPane().add(canvas_4);
			
			 canvas_1 = new Canvas();
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
			Frame.frame.getContentPane().add(canvas_1);
			
			 canvas_2 = new Canvas();
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
			Frame.frame.getContentPane().add(canvas_2);
			
			
			
			 canvas = new Canvas();
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
		    Frame.frame.getContentPane().add(canvas);
		
		 canvas_3 = new Canvas();
		
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
		 
    	//ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image to a imageIcon
    	//Image image = imageIcon.getImage(); // transform it 
    	//Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
    	//imageIcon = new ImageIcon(newimg)
		
		
		
		
    	//Image radarimg = new ImageIcon(this.getClass().getResource("/radar.png")).getImage();
    	//JLabel radar=new JLabel(icon);
		//radar.setIcon(new ImageIcon(radarimg));
		//radar.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    	//frame.getContentPane().add(radar);
    	//radar.setBackground(Color.BLACK);
		//radar.setBounds(662, 63, 430, 229);
	    //radar.setVisible(false);
	   
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
		
		
		 sosbtn = new JButton("SOS");
		sosbtn.setForeground(Color.YELLOW);
		sosbtn.setBackground(null);
		sosbtn.setFont(new Font("Bahnschrift", Font.PLAIN, 50));
		sosbtn.setBounds(830, 100, 180, 180);
		sosbtn.setBackground(Color.red);
		sosbtn.setForeground(Color.BLACK);
		
		sosbtn.setVisible(false);
		frame.getContentPane().add(sosbtn);
		 
		    
		   
		
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
	textField_4.setText("NOTIFICATIONS LOG");
	textField_4.setBounds(450, 38, 283, 20);
	frame.getContentPane().add(textField_4);
	textField_4.setColumns(10);
	textField_4.setForeground(Color.YELLOW);
	textField_4.setVisible(true);
	textField_4.setEditable(false);
	textField_4.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	textField_4.setHighlighter( null );
	textField_4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	textField_4.setBackground(null);
 	
	JTextField cpuload = new JTextField();
	cpuload.setText("CPU LOAD");
	cpuload.setBounds(490, 17, 95, 20);
	frame.getContentPane().add(cpuload);
	cpuload.setColumns(10);
	cpuload.setForeground(Color.YELLOW);
	cpuload.setVisible(true);
	cpuload.setEditable(false);
	cpuload.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	cpuload.setHighlighter( null );
	cpuload.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	cpuload.setBackground(null);
	
	JTextField ramload = new JTextField();
	ramload.setBounds(590, 17, 101, 20);
	ramload.setText("RAM LOAD");
	frame.getContentPane().add(ramload);
	ramload.setColumns(10);
	ramload.setForeground(Color.YELLOW);
	ramload.setVisible(true);
	ramload.setEditable(false);
	ramload.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
	ramload.setHighlighter( null );
	ramload.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	ramload.setBackground(null);
	
	
	
	
	
	
		
		
		
		
	
		
			}
}


