package aiframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;
import uk.co.caprica.vlcj.player.embedded.videosurface.VideoSurface;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import java.util.Date;
import aiframe.Frame;
import java.text.ParseException;
public class videoplay {
	public static JFrame f;
	public static Canvas c;
	public static JPanel p;
	public static JFileChooser filechooser;
	public static JButton choose;
	public File file;
	public String mediaPath;
	public String fi;
	public static  int returnVal;
	public static String fileName; 
	public static JButton mannualplay;
	public static MediaPlayerFactory mpf;
	public static EmbeddedMediaPlayer emp;
	public static CanvasVideoSurface v;
	public static Canvas videoplay;
	public static JInternalFrame vjf;
	public static  BasicFileAttributes attr;
public void videomain()
{   
	vjf = new JInternalFrame();
	vjf.setBounds(763, 469 ,249 ,177);
	vjf.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	vjf.putClientProperty("JInternalFrame.isPalette", Boolean.TRUE);
	 ((javax.swing.plaf.basic.BasicInternalFrameUI)vjf.getUI()).setNorthPane(null);
	vjf.setResizable(false);
	vjf.setVisible(false);
	vjf.setBackground(null);     
	videoplay = new Canvas();
	videoplay.setBackground(null);
	videoplay.setVisible(true);
	vjf.getContentPane().add(videoplay);
	Frame.frame.getContentPane().add(vjf);
	
	
	
	
	mannualplay = new JButton();
	mannualplay.setText("PROCESS MANNUAL VIDEO");
	mannualplay.setBounds(930, 420, 200, 40);
	mannualplay.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	mannualplay.setVisible(false);
	mannualplay.setFocusPainted(false);
	mannualplay.setBackground(null);
	mannualplay.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	mannualplay.setForeground(Color.YELLOW);
	Frame.frame.getContentPane().add(mannualplay);
	mannualplay.addActionListener(
	         new ActionListener() {
	            public void actionPerformed( ActionEvent e )
	            {
	            	JFileChooser choose = new JFileChooser();
	               
	                int returnVal = choose.showOpenDialog(null);
	                if (returnVal == JFileChooser.APPROVE_OPTION) {
	                   fileName = choose.getSelectedFile().toString();
	                   player();
	                }
	              }
	         });
	
	
    choose = new JButton("PLAY STORED VIDEO");
	choose.setBounds(764, 420, 160, 40);
	choose.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	
	choose.setFocusPainted(false);
	choose.setBackground(null);
	choose.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	choose.setForeground(Color.YELLOW);
	choose.setVisible(false);
	Frame.frame.getContentPane().add(choose);
	choose.addActionListener(
	         new ActionListener() {
	            public void actionPerformed( ActionEvent e )
	            {
	            	JFileChooser chooser = new JFileChooser();
	               
	                int returnVal = chooser.showOpenDialog(null);
	                if (returnVal == JFileChooser.APPROVE_OPTION) {
	                	file=chooser.getSelectedFile();
	                	
	                	 
	                    fileName = chooser.getSelectedFile().toString();
	                    Path file = Paths.get(fileName);
	                   
	                    try {
	                    	attr = Files.readAttributes(file, BasicFileAttributes.class);
							
						} catch (IOException e1) {
							
							e1.printStackTrace();
						}
	                    player();
	                }
	              }
	         });

}
	
	public void player()
	{ 
		 NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);	
		
		 mpf = new MediaPlayerFactory();
         emp = mpf.newEmbeddedMediaPlayer();
         v = mpf.newVideoSurface(videoplay);
         emp.setVideoSurface(v);
         emp.playMedia(fileName);
        emp.isMute();
        
         Frame.logger.setText(null );
         Frame.logger.setText("PLAYING VIDEO\n\nFILE INFO\n" + attr.creationTime() );
         
	
	
	}
}
