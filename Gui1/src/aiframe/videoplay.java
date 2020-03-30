package aiframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JPanel;


import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import aiframe.Frame;
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
public void videomain()
{
	mannualplay = new JButton();
	mannualplay.setText("PROCESS MANNUAL VIDEO");
	mannualplay.setBounds(850, 440, 200, 20);
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
	
	
    choose = new JButton("PLAY");
	choose.setBounds(764, 440, 80, 20);
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
	                    fileName = chooser.getSelectedFile().toString();
	                    player();
	                }
	              }
	         });

}
	
	public void player()
	{
		
		f = new JFrame();
		f.setLocation(100,100);
		f.setSize(1000,600);
		f.setVisible(true);
		
		c = new Canvas();
		c.setBackground(Color.RED);
		
		p = new JPanel();
		p.add(c);
        f.add(p);
		NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);	
	 mpf = new MediaPlayerFactory();
	 emp = mpf.newEmbeddedMediaPlayer(new Win32FullScreenStrategy(f));
	
	//emp.setVideoSurface(mpf.newVideoSurface(c));
	
	emp.setEnableMouseInputHandling(false);
	emp.setEnableKeyInputHandling(false);
	
	emp.prepareMedia(fileName);
	emp.play();
	
	
	}
}
