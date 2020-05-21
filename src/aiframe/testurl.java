package aiframe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class testurl {
	public static JButton chngurl;
	public static JButton stop;
	public static JFrame urlframe;
	public static JTextPane url1;
	public static JTextPane url2;
	public static JTextPane url3;
	public static JTextPane url4;
	public static JTextPane url5;
	public static JTextPane url6;
	public static JTextPane url7;
	public static JTextPane url8;
	public static JTextPane url9;
	public static JTextPane url10;
	public static JTextPane txt1;
	public static JTextPane txt2;
	public static JTextPane txt3;
	public static JTextPane txt4;
	public static JTextPane txt5;
	public static JTextPane txt6;
	public static JTextPane txt7;
	public static JTextPane txt8;
	public static JTextPane txt9;
	public static JTextPane txt10;
	public static JButton ok;
	public static String s1=null;
	public static String s2=null;
	public static String s3=null;
	public static String s4=null;
	public static String s5=null;
	public static String s6=null;
	public static String s7=null;
	public static String s8=null;
	public static String s9=null;
	public static String s10=null;
	public static String s0="http://localhost:8888/";
	
public void main() 
{
	chngurl = new JButton("URL");
	chngurl.setBounds(1170, 550, 100 ,20);
	chngurl.setVisible(true);
	chngurl.setFocusPainted(false);
	chngurl.setForeground(Color.YELLOW);
	chngurl.setBackground(null);
	chngurl.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	chngurl.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	chngurl.setFocusPainted(false);
	//Frame.frame.getContentPane().add(chngurl);
	chngurl.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        
        window();
        }

		
    });
	
	stop = new JButton("STOP ALL");
	stop.setBounds(1170, 600, 100 ,20);
	stop.setVisible(true);
	stop.setFocusPainted(false);
	stop.setForeground(Color.YELLOW);
	stop.setBackground(null);
	stop.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	stop.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	stop.setFocusPainted(false);
	//Frame.frame.getContentPane().add(stop);
	stop.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
          stream.emp1.stop();
          stream.emp2.stop();
          stream.emp3.stop();
          stream.emp4.stop();
          stream.emp5.stop();
          stream.emp6.stop();
          stream.emp7.stop();
          stream.emp8.stop();
          stream.emp9.stop();
          stream.emp10.stop();
          
          
        }
	});
}

public void window() 
{
	urlframe = new JFrame();
	urlframe.setLayout(null);
	urlframe.getContentPane().setBackground(Color.black);
	urlframe.setVisible(true);
	urlframe.setBounds(300,100,500,500);
	urlframe.setResizable(false);
	urlframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	url1 = new JTextPane();
	url1.setBounds(190,10,280,25);
	url1.setForeground(Color.yellow);
	url1.setBackground(null);
	url1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url1);
	
	url2 = new JTextPane();
	url2.setBounds(190,50,280,25);
	url2.setForeground(Color.yellow);
	url2.setBackground(null);
	url2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url2);
	
	
	url3 = new JTextPane();
	url3.setBounds(190,90,280,25);
	url3.setForeground(Color.yellow);
	url3.setBackground(null);
	url3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url3);
	
	
	url4 = new JTextPane();
	url4.setBounds(190,130,280,25);
	url4.setForeground(Color.yellow);
	url4.setBackground(null);
	url4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url4);
	
	url5 = new JTextPane();
	url5.setBounds(190,170,280,25);
	url5.setForeground(Color.yellow);
	url5.setBackground(null);
	url5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url5);
	
	url6 = new JTextPane();
	url6.setBounds(190,210,280,25);
	url6.setForeground(Color.yellow);
	url6.setBackground(null);
	url6.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url6);
	
	url7 = new JTextPane();
	url7.setBounds(190,250,280,25);
	url7.setForeground(Color.yellow);
	url7.setBackground(null);
	url7.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url7);
	
	url8 = new JTextPane();
	url8.setBounds(190,290,280,25);
	url8.setForeground(Color.yellow);
	url8.setBackground(null);
	url8.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url8);
	
	url9 = new JTextPane();
	url9.setBounds(190,330,280,25);
	url9.setForeground(Color.yellow);
	url9.setBackground(null);
	url9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url9);
	
	
	url10 = new JTextPane();
	url10.setBounds(190,370,280,25);
	url10.setForeground(Color.yellow);
	url10.setBackground(null);
	url10.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	url10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	urlframe.getContentPane().add(url10);
	
	
	txt1 = new JTextPane();
	txt1.setText("LEFT CAM RAW");
	txt1.setBounds(10,10,175,25);
	txt1.setBackground(null);
	txt1.setForeground(Color.yellow);
	txt1.setEditable(false);
	txt1.setHighlighter(null);
	txt1.setBorder(null);
	txt1.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt1);
	
	
	txt2 = new JTextPane();
	txt2.setText("FRONT CAM RAW");
	txt2.setBounds(10,50,175,25);
	txt2.setBackground(null);
	txt2.setForeground(Color.yellow);
	txt2.setEditable(false);
	txt2.setHighlighter(null);
	txt2.setBorder(null);
	txt2.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt2);
	
	
	txt3 = new JTextPane();
	txt3.setText("RIGHT CAM RAW");
	txt3.setBounds(10,90,175,25);
	txt3.setBackground(null);
	txt3.setForeground(Color.yellow);
	txt3.setEditable(false);
	txt3.setHighlighter(null);
	txt3.setBorder(null);
	txt3.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt3);
	
	
	txt4 = new JTextPane();
	txt4.setText("PTZ CAM RAW");
	txt4.setBounds(10,130,175,25);
	txt4.setBackground(null);
	txt4.setForeground(Color.yellow);
	txt4.setEditable(false);
	txt4.setHighlighter(null);
	txt4.setBorder(null);
	txt4.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt4);
	
	txt5 = new JTextPane();
	txt5.setText("BACK CAM RAW");
	txt5.setBounds(10,170,175,25);
	txt5.setBackground(null);
	txt5.setForeground(Color.yellow);
	txt5.setEditable(false);
	txt5.setHighlighter(null);
	txt5.setBorder(null);
	txt5.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt5);
	
	txt6 = new JTextPane();
	txt6.setText("LEFT CAM PROCESSED");
	txt6.setBounds(10,210,175,25);
	txt6.setBackground(null);
	txt6.setForeground(Color.yellow);
	txt6.setEditable(false);
	txt6.setHighlighter(null);
	txt6.setBorder(null);
	txt6.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt6);
	
	txt7 = new JTextPane();
	txt7.setText("FRONT CAM PROCESSED");
	txt7.setBounds(10,250,175,25);
	txt7.setBackground(null);
	txt7.setForeground(Color.yellow);
	txt7.setEditable(false);
	txt7.setHighlighter(null);
	txt7.setBorder(null);
	txt7.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt7);
	
	txt8 = new JTextPane();
	txt8.setText("RIGHT CAM PROCESSED");
	txt8.setBounds(10,290,175,25);
	txt8.setBackground(null);
	txt8.setForeground(Color.yellow);
	txt8.setEditable(false);
	txt8.setHighlighter(null);
	txt8.setBorder(null);
	txt8.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt8);
	
	txt9 = new JTextPane();
	txt9.setText("PTZ CAM PROCESSED");
	txt9.setBounds(10,330,175,25);
	txt9.setBackground(null);
	txt9.setForeground(Color.yellow);
	txt9.setEditable(false);
	txt9.setHighlighter(null);
	txt9.setBorder(null);
	txt9.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt9);
	
	txt10 = new JTextPane();
	txt10.setText("BACK CAM PROCESSED");
	txt10.setBounds(10,370,175,25);
	txt10.setBackground(null);
	txt10.setForeground(Color.yellow);
	txt10.setEditable(false);
	txt10.setHighlighter(null);
    txt10.setBorder(null);
	txt10.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	urlframe.getContentPane().add(txt10);
	
	
	
	
	
	ok = new JButton("OK");
	ok.setForeground(Color.YELLOW);
	ok.setBackground(null);
	ok.setBorder(BorderFactory.createLineBorder(Color.YELLOW)); 
	ok.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
	ok.setBounds(190, 410, 126, 25);
	ok.setFocusPainted(false);
	urlframe.getContentPane().add(ok);
	ok.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       
        urlframe.dispose();
        
        s1 = url1.getText();
        if (s1.length() > 1)
        	{
        	 stream.emp4.stop();
        	 canvas.campanel4.repaint();
        	 stream.emp4.playMedia(s0+s1);
        	}
        
        s2 = url2.getText();
        if (s2.length() > 1)
        	{
        	 stream.emp3.stop();
        	 canvas.campanel3.repaint();
        	 stream.emp3.playMedia(s0+s2);
        	 }
        
        s3 = url3.getText();
        if (s3.length() > 1) 
        	{
        	  stream.emp2.stop();
        	  canvas.campanel2.repaint();
        	  stream.emp2.playMedia(s0+s3);
        	 }
        
        s4 = url4.getText();
        if (s4.length() > 1)
             {
        	 stream.emp1.stop();
        	 canvas.campanel1.repaint();
        	 stream.emp1.playMedia(s0+s4);
        	}
        
        s5 = url5.getText();
        if (s5.length() > 1)
              {
        	   stream.emp5.stop();
        	   canvas.campanel5.repaint();
        	   stream.emp5.playMedia(s0+s5);
        	}
        
        s6 = url6.getText();
        if (s6.length() > 1)
             {
        	    stream.emp9.stop();
        	    canvas.campanel4p.repaint();
        	    stream.emp9.playMedia(s0+s6);
        	  }
        
        s7 = url7.getText();
        if (s7.length() > 1)
             {
        	  stream.emp8.stop();
        	  canvas.campanel3p.repaint();
        	  stream.emp8.playMedia(s0+s7);
        	}
        
        s8 = url8.getText();
        if (s8.length() > 1)
             {
        	  stream.emp7.stop();
        	  canvas.campanel2p.repaint();
        	  stream.emp7.playMedia(s0+s8);
        	}
        
        s9 = url9.getText();
        if (s9.length() > 1)
            {
        	  stream.emp6.stop();
        	  canvas.campanel1p.repaint();
        	  stream.emp6.playMedia(s0+s9);
        	}
        
        s10 = url10.getText();
        if (s10.length() > 1)
            {
        	 stream.emp10.stop();
        	 canvas.campanel5p.repaint();
        	 stream.emp10.playMedia(s0+s10);
        	}
        }

		
    });
	
	
}
}