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
import aiframe.radar.*;
import aiframe.calender.*;









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
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

	
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
	
		
		
		
		
		
		
		JTextField maindash = new JTextField();
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
		
			 Frame.frame.getContentPane().add(canvas_4);
			
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
			Frame.frame.getContentPane().add(canvas_1);
			
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
			Frame.frame.getContentPane().add(canvas_2);
			
			
			
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
		    Frame.frame.getContentPane().add(canvas);
		
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
		
	   JTextPane dbdetails = new JTextPane();
	   dbdetails.setBounds(1022, 469, 249, 177);
	   dbdetails.setVisible(true);
	   dbdetails.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	   dbdetails.setBackground(null);
	   dbdetails.setHighlighter(null);
	   dbdetails.setEditable(false);
	   dbdetails.setVisible(false);
		frame.getContentPane().add(dbdetails);
		
		
		
		 JTextPane logger = new JTextPane();
		 logger.setBounds(1022, 469, 249, 177);
		 logger.setVisible(true);
		 logger.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		 logger.setBackground(null);
		 logger.setHighlighter(null);
		 logger.setEditable(false);
		 logger.setVisible(false);
			frame.getContentPane().add(logger);
		
		
		JTextField txtdb = new JTextField();
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
	    
	    
	    JTextField txtlog = new JTextField();
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
	    
	    
	    JTextField txtsuspobj = new JTextField();
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
	    
	    JTextField txtobj = new JTextField();
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
	    
	    
	    
		JPanel object = new JPanel();
		object.setBounds(763, 469 ,249 ,177);
		object.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		object.setBackground(null);
		object.setVisible(false);
		frame.getContentPane().add(object);
		
		
	
		
		JPanel videoplay = new JPanel();
		videoplay.setBounds(763, 469 ,249 ,177);
		videoplay.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		videoplay.setBackground(null);
		videoplay.setVisible(false);
		frame.getContentPane().add(videoplay);
		
		
		  JTextField txtvideo = new JTextField();
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
		    
		    
		    JPanel suspobj = new JPanel();
		    suspobj.setBounds(23, 377, 352, 272);
		    suspobj.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		    suspobj.setBackground(null);
		    suspobj.setVisible(false);
			frame.getContentPane().add(suspobj);
		    
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new LineBorder(new Color(225, 225, 225), 2));
		
		layeredPane.setBounds(1145, 425, 126, 212);
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
		 
		
		ImageIcon graph = new ImageIcon("graph.png");
		

		Image graphimg = new ImageIcon(this.getClass().getResource("/graph.png")).getImage();
		Image gr = graphimg.getScaledInstance(400, 300,  java.awt.Image.SCALE_SMOOTH);
		//ImageIcon newgraph = new ImageIcon(newimg);
		JLabel graphhold=new JLabel();
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
	 
	   
	
		
		
		
		
		JButton msgbtn1 = new JButton("X");
		msgbtn1.setBackground(null);
		msgbtn1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn1.setForeground(Color.YELLOW);
		msgbtn1.setBounds(773, 640, 138, 35);
		msgbtn1.setVisible(false);
		frame.getContentPane().add(msgbtn1);
		
		
		JButton msgbtn2 = new JButton("X");
		msgbtn2.setBackground(null);
		msgbtn2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn2.setForeground(Color.YELLOW);
		msgbtn2.setBounds(773, 600, 138, 35);
		msgbtn2.setVisible(false);
		frame.getContentPane().add(msgbtn2);
		
		
		JButton msgbtn3 = new JButton("X");
		msgbtn3.setBackground(null);
		msgbtn3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn3.setForeground(Color.YELLOW);
		msgbtn3.setBounds(773, 560, 138, 35);
		msgbtn3.setVisible(false);
		frame.getContentPane().add(msgbtn3);
		
		JButton msgbtn4 = new JButton("X");
		msgbtn4.setBackground(null);
		msgbtn4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn4.setForeground(Color.YELLOW);
		msgbtn4.setBounds(773, 520, 138, 35);
		msgbtn4.setVisible(false);
		frame.getContentPane().add(msgbtn4);
		
		JButton msgbtn5 = new JButton("X");
		msgbtn5.setBackground(null);
		msgbtn5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn5.setForeground(Color.YELLOW);
		msgbtn5.setBounds(773, 480, 138, 35);
		msgbtn5.setVisible(false);
		frame.getContentPane().add(msgbtn5);
		
		JButton msgbtn6 = new JButton("X");
		msgbtn6.setBackground(null);
		msgbtn6.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn6.setForeground(Color.YELLOW);
		msgbtn6.setBounds(773, 440, 138, 35);
		msgbtn6.setVisible(false);
		frame.getContentPane().add(msgbtn6);
		
		JButton msgbtn7 = new JButton("X");
		msgbtn7.setBackground(null);
		msgbtn7.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn7.setForeground(Color.YELLOW);
		msgbtn7.setBounds(773, 400, 138, 35);
		msgbtn7.setVisible(false);
		frame.getContentPane().add(msgbtn7);
		
		JButton msgbtn8 = new JButton("HOSPITAL");
		msgbtn8.setBackground(null);
		msgbtn8.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn8.setForeground(Color.YELLOW);
		msgbtn8.setBounds(773, 360, 138, 35);
		msgbtn8.setVisible(false);
		frame.getContentPane().add(msgbtn8);
		
		JButton msgbtn9 = new JButton("AMBULANCE");
		msgbtn9.setBackground(null);
		msgbtn9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		msgbtn9.setForeground(Color.YELLOW);
		msgbtn9.setBounds(773, 320, 138, 35);
		msgbtn9.setVisible(false);
		frame.getContentPane().add(msgbtn9);
		
		
		
		
		JButton callbtn1 = new JButton("X");
		callbtn1.setBackground(null);
		callbtn1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn1.setForeground(Color.YELLOW);
		callbtn1.setBounds(920, 640, 138, 35);
		callbtn1.setVisible(false);
		frame.getContentPane().add(callbtn1);
		
		
		JButton callbtn2 = new JButton("X");
		callbtn2.setBackground(null);
		callbtn2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn2.setForeground(Color.YELLOW);
		callbtn2.setBounds(920, 600, 138, 35);
		callbtn2.setVisible(false);
		frame.getContentPane().add(callbtn2);
		
		
		JButton callbtn3 = new JButton("X");
		callbtn3.setBackground(null);
		callbtn3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn3.setForeground(Color.YELLOW);
		callbtn3.setBounds(920, 560, 138, 35);
		callbtn3.setVisible(false);
		frame.getContentPane().add(callbtn3);
		
		JButton callbtn4 = new JButton("X");
		callbtn4.setBackground(null);
		callbtn4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn4.setForeground(Color.YELLOW);
		callbtn4.setBounds(920, 520, 138, 35);
		callbtn4.setVisible(false);
		frame.getContentPane().add(callbtn4);
		
		JButton callbtn5 = new JButton("X");
		callbtn5.setBackground(null);
		callbtn5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn5.setForeground(Color.YELLOW);
		callbtn5.setBounds(920, 480, 138, 35);
		callbtn5.setVisible(false);
		frame.getContentPane().add(callbtn5);
		
		JButton callbtn6 = new JButton("X");
		callbtn6.setBackground(null);
		callbtn6.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn6.setForeground(Color.YELLOW);
		callbtn6.setBounds(920, 440, 138, 35);
		callbtn6.setVisible(false);
		frame.getContentPane().add(callbtn6);
		
		JButton callbtn7 = new JButton("X");
		callbtn7.setBackground(null);
		callbtn7.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn7.setForeground(Color.YELLOW);
		callbtn7.setBounds(920, 400, 138, 35);
		callbtn7.setVisible(false);
		frame.getContentPane().add(callbtn7);
		
		JButton callbtn8 = new JButton("HOSPITAL");
		callbtn8.setBackground(null);
		callbtn8.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn8.setForeground(Color.YELLOW);
		callbtn8.setBounds(920, 360, 138, 35);
		callbtn8.setVisible(false);
		frame.getContentPane().add(callbtn8);
		
		JButton callbtn9 = new JButton("AMBULANCE");
		callbtn9.setBackground(null);
		callbtn9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		callbtn9.setForeground(Color.YELLOW);
		callbtn9.setBounds(920, 320, 138, 35);
		callbtn9.setVisible(false);
		frame.getContentPane().add(callbtn9);
		
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
		
		
		JPanel GPS = new JPanel();
		GPS.setBounds(23, 68, 352, 272);
		GPS.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		GPS.setBackground(null);
		GPS.setVisible(false);
		frame.getContentPane().add(GPS);
		
		
		JTextField txtGPS = new JTextField();
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
		
		
		JTextPane soslog = new JTextPane();
		soslog.setBounds(23, 374, 352, 272);
		soslog.setVisible(true);
		soslog.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		soslog.setBackground(null);
		soslog.setHighlighter(null);
		soslog.setEditable(false);
		soslog.setVisible(false);
	    frame.getContentPane().add(soslog);
		
	    
	    JTextField txtsoslog = new JTextField();
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
		
		
		JPanel hospital = new JPanel();
		hospital.setBounds(381, 68, 352, 272);
		hospital.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		hospital.setBackground(null);
		hospital.setVisible(false);
		frame.getContentPane().add(hospital);
		
		JTextField txtcall = new JTextField();
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
		
		JTextField txtmsg = new JTextField();
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
		
		
		JButton sosbtn = new JButton("SOS");
		sosbtn.setForeground(Color.YELLOW);
		sosbtn.setBackground(null);
		sosbtn.setFont(new Font("Bahnschrift", Font.PLAIN, 50));
		sosbtn.setBounds(830, 100, 180, 180);
		sosbtn.setBackground(Color.red);
		sosbtn.setForeground(Color.BLACK);
		
		sosbtn.setVisible(false);
		frame.getContentPane().add(sosbtn);
		 
		    
		   
		
		JTextPane callog = new JTextPane();
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
			
			
			JTextPane msglog = new JTextPane();
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
				dbdetails.setVisible(false);
				object.setVisible(false);
				txtdb.setVisible(false);
				txtobj.setVisible(false);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				 videoplay.setVisible(false);
				 txtvideo.setVisible(false);
				 suspobj.setVisible(false);
				  txtsuspobj.setVisible(false);
				  sosbtn.setVisible(false);
				  GPS.setVisible(false);
				  	txtGPS.setVisible(false);
				  soslog.setVisible(false);
				   txtsoslog.setVisible(false);
				  	hospital.setVisible(false);
				  	msgbtn1.setVisible(false);
				  	msgbtn2.setVisible(false);
				  	msgbtn3.setVisible(false);
				  	msgbtn4.setVisible(false);
				  	msgbtn5.setVisible(false);
				  	msgbtn6.setVisible(false);
				  	msgbtn7.setVisible(false);
				  	msgbtn8.setVisible(false);
				  	msgbtn9.setVisible(false);
				  	callbtn1.setVisible(false);
				  	callbtn2.setVisible(false);
				  	callbtn3.setVisible(false);
				  	callbtn4.setVisible(false);
				  	callbtn5.setVisible(false);
				  	callbtn6.setVisible(false);
				  	callbtn7.setVisible(false);
				  	callbtn8.setVisible(false);
				  	callbtn9.setVisible(false);
				  	graphhold.setBounds(740, 374, 352, 272);
                    graphhold.setVisible(true);
                    callog.setVisible(false);
                    msglog.setVisible(false);
                    txtmsg.setVisible(false);
                    txtcall.setVisible(false);
                    
                   
                 
                    
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
				object.setVisible(false);
				dbdetails.setVisible(false);
				txtdb.setVisible(false);
				txtobj.setVisible(false);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				 videoplay.setVisible(false);
				 txtvideo.setVisible(false);
				 suspobj.setVisible(false);
				  txtsuspobj.setVisible(false);
				  sosbtn.setVisible(false);
				  GPS.setVisible(false);
				  	txtGPS.setVisible(false);
				  soslog.setVisible(false);
				   txtsoslog.setVisible(false);
				  	hospital.setVisible(false);
				  	msgbtn1.setVisible(false);
				  	msgbtn2.setVisible(false);
				  	msgbtn3.setVisible(false);
				  	msgbtn4.setVisible(false);
				  	msgbtn5.setVisible(false);
				  	msgbtn6.setVisible(false);
				  	msgbtn7.setVisible(false);
				  	msgbtn8.setVisible(false);
				  	msgbtn9.setVisible(false);
				  	callbtn1.setVisible(false);
				  	callbtn2.setVisible(false);
				  	callbtn3.setVisible(false);
				  	callbtn4.setVisible(false);
				  	callbtn5.setVisible(false);
				  	callbtn6.setVisible(false);
				  	callbtn7.setVisible(false);
				  	callbtn8.setVisible(false);
				  	callbtn9.setVisible(false);
				  	graphhold.setVisible(false);
				  	callog.setVisible(false);
				  	txtmsg.setVisible(false);
				  	txtcall.setVisible(false);
				  	msglog.setVisible(false);
				  	
				  
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
				object.setVisible(false);
				dbdetails.setVisible(false);
				txtdb.setVisible(false);
				txtobj.setVisible(false);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				 videoplay.setVisible(false);
				 txtvideo.setVisible(false);
				 suspobj.setVisible(false);
				  txtsuspobj.setVisible(false);
				  sosbtn.setVisible(false);
				  GPS.setVisible(false);
				  	txtGPS.setVisible(false);
				  soslog.setVisible(false);
				   txtsoslog.setVisible(false);
				  	hospital.setVisible(false);
				  	msgbtn1.setVisible(false);
				  	msgbtn2.setVisible(false);
				  	msgbtn3.setVisible(false);
				  	msgbtn4.setVisible(false);
				  	msgbtn5.setVisible(false);
				  	msgbtn6.setVisible(false);
				  	msgbtn7.setVisible(false);
				  	msgbtn8.setVisible(false);
				  	msgbtn9.setVisible(false);
				  	callbtn1.setVisible(false);
				  	callbtn2.setVisible(false);
				  	callbtn3.setVisible(false);
				  	callbtn4.setVisible(false);
				  	callbtn5.setVisible(false);
				  	callbtn6.setVisible(false);
				  	callbtn7.setVisible(false);
				  	callbtn8.setVisible(false);
				  	callbtn9.setVisible(false);

                     graphhold.setBounds(740, 374, 352, 272);
                    graphhold.setVisible(true);
                    callog.setVisible(false);
                    msglog.setVisible(false);
                    txtmsg.setVisible(false);
                    txtcall.setVisible(false);
				
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
				
				//txtVehicleNumber.setVisible(true);
				//txtOwnersName.setVisible(true);
				//txtRcAddress.setVisible(true);
				//txtRegest.setVisible(true);
				//txtName.setVisible(false);
				//txtAge.setVisible(false);
				//txtAddress.setVisible(false);
				//txtDateOfBirth.setVisible(false);
				object.setVisible(true);
				dbdetails.setVisible(true);
				txtdb.setVisible(true);
				txtobj.setVisible(true);
				txtCamera_2.setBounds(858, 346, 130, 20);
				txtCamera.setBounds(150, 346, 130, 20);
				txtCamera_3.setBounds(500, 346, 135, 20);
				txtCamera_1.setBounds(500, 652, 130, 20);
				canvas_4.setBounds(23, 374, 352, 272); 
				canvas_1.setBounds(739, 68, 352, 272);
				canvas.setBounds(23, 68, 352, 272);
				canvas_2.setBounds(381, 68, 352, 272);
				canvas_3.setBounds(381, 374, 352, 272);
				ptz.setBounds(150, 652, 125, 20);
				txtCamera_2.setVisible(true);
				txtCamera.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_1.setVisible(true);
				ptz.setVisible(true);
				canvas_4.setVisible(true);
				canvas_1.setVisible(true);
				canvas.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				 videoplay.setVisible(false);
				 txtvideo.setVisible(false);
				 suspobj.setVisible(false);
				  txtsuspobj.setVisible(false);
				maindash.setText("PERSON / VEHICLE IDENTIFICATION");
				sosbtn.setVisible(false);
				GPS.setVisible(false);
					txtGPS.setVisible(false);
				soslog.setVisible(false);
				 txtsoslog.setVisible(false);
					hospital.setVisible(false);
					msgbtn1.setVisible(false);
					msgbtn2.setVisible(false);
					msgbtn3.setVisible(false);
					msgbtn4.setVisible(false);
					msgbtn5.setVisible(false);
					msgbtn6.setVisible(false);
					msgbtn7.setVisible(false);
					msgbtn8.setVisible(false);
					msgbtn9.setVisible(false);
					callbtn1.setVisible(false);
					callbtn2.setVisible(false);
					callbtn3.setVisible(false);
					callbtn4.setVisible(false);
					callbtn5.setVisible(false);
					callbtn6.setVisible(false);
					callbtn7.setVisible(false);
					callbtn8.setVisible(false);
					callbtn9.setVisible(false);
					graphhold.setVisible(false);
					callog.setVisible(false);
					msglog.setVisible(false);
					txtmsg.setVisible(false);
					txtcall.setVisible(false);
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
				txtCamera_2.setVisible(true);
				txtCamera.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_3.setVisible(true);
				txtCamera_1.setVisible(true);
				ptz.setVisible(true);
                canvas_4.setBounds(23, 374, 352, 272); 
				canvas_1.setBounds(739, 68, 352, 272);
				canvas.setBounds(23, 68, 352, 272);
				canvas_2.setBounds(381, 68, 352, 272);
				canvas_3.setBounds(381, 374, 352, 272);
				canvas_4.setVisible(true);
				canvas_1.setVisible(true);
				canvas.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
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
				object.setVisible(false);
				dbdetails.setVisible(false);
				txtdb.setVisible(false);
				txtobj.setVisible(false);
				maindash.setText("EVIDENCE MANAGMENT");
				logger.setVisible(true);
				 txtlog.setVisible(true);
				 videoplay.setVisible(true);
				 txtvideo.setVisible(true);
				 suspobj.setVisible(false);
				  txtsuspobj.setVisible(false);
				  sosbtn.setVisible(false);
				  GPS.setVisible(false);
				  	txtGPS.setVisible(false);
				  soslog.setVisible(false);
				   txtsoslog.setVisible(false);
				  	hospital.setVisible(false);
				  	msgbtn1.setVisible(false);
				  	msgbtn2.setVisible(false);
				  	msgbtn3.setVisible(false);
				  	msgbtn4.setVisible(false);
				  	msgbtn5.setVisible(false);
				  	msgbtn6.setVisible(false);
				  	msgbtn7.setVisible(false);
				  	msgbtn8.setVisible(false);
				  	msgbtn9.setVisible(false);
				  	callbtn1.setVisible(false);
				  	callbtn2.setVisible(false);
				  	callbtn3.setVisible(false);
				  	callbtn4.setVisible(false);
				  	callbtn5.setVisible(false);
				  	callbtn6.setVisible(false);
				  	callbtn7.setVisible(false);
				  	callbtn8.setVisible(false);
				  	callbtn9.setVisible(false);
				  	graphhold.setVisible(false);
				  	callog.setVisible(false);
				  	msglog.setVisible(false);
				  	txtmsg.setVisible(false);
				  	txtcall.setVisible(false);
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
				object.setVisible(false);
				dbdetails.setVisible(false);
				txtdb.setVisible(false);
				ptz.setVisible(false);
				txtobj.setVisible(false);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				 videoplay.setVisible(false);
				 txtvideo.setVisible(false);
				 suspobj.setVisible(false);
				maindash.setText("SOS SIGNAL");
				  txtsuspobj.setVisible(false);
				  sosbtn.setVisible(true);
				  GPS.setVisible(true);
				  	txtGPS.setVisible(true);
				  soslog.setVisible(true);
				   txtsoslog.setVisible(true);
				  	hospital.setVisible(true);
				  	msgbtn1.setVisible(true);
				  	msgbtn2.setVisible(true);
				  	msgbtn3.setVisible(true);
				  	msgbtn4.setVisible(true);
				  	msgbtn5.setVisible(true);
				  	msgbtn6.setVisible(true);
				  	msgbtn7.setVisible(true);
				  	msgbtn8.setVisible(true);
				  	msgbtn9.setVisible(true);
				  	callbtn1.setVisible(true);
				  	callbtn2.setVisible(true);
				  	callbtn3.setVisible(true);
				  	callbtn4.setVisible(true);
				  	callbtn5.setVisible(true);
				  	callbtn6.setVisible(true);
				  	callbtn7.setVisible(true);
				  	callbtn8.setVisible(true);
				  	callbtn9.setVisible(true);
				  	graphhold.setVisible(false);
				  	callog.setVisible(true);
				  	msglog.setVisible(true);
				  	txtmsg.setVisible(true);
				  	txtcall.setVisible(true);
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
	    
	    
		JButton suspact = new JButton("SUSPICIOUS ACTIVITY");
		suspact.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		suspact.setVisible(true);
		suspact.setBackground(null);
		suspact.setForeground(Color.YELLOW);
		suspact.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				
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
				object.setVisible(false);
				dbdetails.setVisible(false);
				txtdb.setVisible(false);
				logger.setVisible(false);
				 txtlog.setVisible(false);
				txtobj.setVisible(false);
				videoplay.setVisible(false);
				txtvideo.setVisible(false);
				canvas_4.setBounds(23, 374, 352, 272); 
				canvas_1.setBounds(739, 68, 352, 272);
				canvas_2.setBounds(381, 68, 352, 272);
				canvas_3.setBounds(381, 374, 352, 272);
				txtCamera_1.setBounds(500, 652, 130, 20);
				txtCamera_3.setBounds(500, 346, 135, 20);
				txtCamera.setBounds(150, 346, 130, 20);
				txtCamera_2.setBounds(858, 346, 130, 20);
				txtCamera.setVisible(true);
				txtCamera_1.setVisible(true);
				txtCamera_2.setVisible(true);
				txtCamera_3.setVisible(true);
				ptz.setVisible(false);
				canvas.setVisible(true);
				canvas_1.setVisible(true);
				canvas_2.setVisible(true);
				canvas_3.setVisible(true);
				canvas_4.setVisible(false);
				suspobj.setVisible(true);
				  txtsuspobj.setVisible(true);
				maindash.setText("SUSPICIOUS ACTIVITY DETECTION");
				sosbtn.setVisible(false);
				GPS.setVisible(false);
					txtGPS.setVisible(false);
				soslog.setVisible(false);
				 txtsoslog.setVisible(false);
					hospital.setVisible(false);
					graphhold.setVisible(false);
					callog.setVisible(false);
					msglog.setVisible(false);
					txtmsg.setVisible(false);
					txtcall.setVisible(false);
					
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

