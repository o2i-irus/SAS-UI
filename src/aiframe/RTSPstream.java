package aiframe;
import com.xuggle.mediatool.IMediaListener;
import com.xuggle.mediatool.IMediaReader;
import com.xuggle.mediatool.IMediaWriter;
import com.xuggle.mediatool.MediaListenerAdapter;
import com.xuggle.mediatool.ToolFactory;
import com.xuggle.mediatool.event.IVideoPictureEvent;


import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
//import com.xuggle.xuggler.demos.VideoImage;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RTSPstream{
	
	
	
	public static BufferedImage bi;
	public static BufferedImage bi2;
	public static BufferedImage bi3;
	public static BufferedImage bi4;
	public static BufferedImage bi5;
	public static BufferedImage bip;
	public static BufferedImage bi2p;
	public static BufferedImage bi3p;
	public static BufferedImage bi4p;
	public static BufferedImage bi5p;
  //public static IMediaListener mediaListener;
	public static Image gr;
	public static Image gr2;
	public static Image gr3;
	public static Image gr4;
	public static Image gr5;
	public static Image grp;
	public static Image gr2p;
	public static Image gr3p;
	public static Image gr4p;
	public static Image gr5p;
	public static ImageIcon icon;
	public static ImageIcon icon2;
	public static ImageIcon icon3;
	public static ImageIcon icon4;
	public static ImageIcon icon5;
	public static ImageIcon iconp;
	public static ImageIcon icon2p;
	public static ImageIcon icon3p;
	public static ImageIcon icon4p;
	public static ImageIcon icon5p;
	
	public static BufferedImage rbi;
	public static IMediaListener mediaListener = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi = event.getImage();
	              gr = bi.getScaledInstance(canvas.campanel1.getWidth(), canvas.campanel1.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi != null)
	            	//System.out.println("true");
	            icon = new ImageIcon(gr);
	            if (icon != null) 
	           canvas.campanel1.setIcon(icon);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	
	
	public static IMediaListener mediaListener2 = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi2 = event.getImage();
	              gr2 = bi2.getScaledInstance(canvas.campanel2.getWidth(), canvas.campanel2.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi2 != null)
	            	//System.out.println("true");
	            icon2 = new ImageIcon(gr2);
	            if (icon2 != null) 
	           canvas.campanel2.setIcon(icon2);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	public static IMediaListener mediaListener3 = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi3 = event.getImage();
	              gr3 = bi3.getScaledInstance(canvas.campanel3.getWidth(), canvas.campanel3.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi3 != null)
	            	//System.out.println("true");
	            icon3 = new ImageIcon(gr3);
	            if (icon3 != null) 
	           canvas.campanel3.setIcon(icon3);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	public static IMediaListener mediaListener4 = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi4 = event.getImage();
	              gr4 = bi4.getScaledInstance(canvas.campanel4.getWidth(), canvas.campanel4.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi4 != null)
	            	//System.out.println("true");
	            icon4 = new ImageIcon(gr4);
	            if (icon4 != null) 
	           canvas.campanel4.setIcon(icon4);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	public static IMediaListener mediaListener5 = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi5 = event.getImage();
	              gr5 = bi5.getScaledInstance(canvas.campanel5.getWidth(), canvas.campanel5.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi5 != null)
	            	//System.out.println("true");
	            icon5 = new ImageIcon(gr5);
	            if (icon5 != null) 
	           canvas.campanel5.setIcon(icon5);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	public static IMediaListener mediaListenerp = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bip = event.getImage();
	              grp = bi.getScaledInstance(canvas.campanel1p.getWidth(), canvas.campanel1p.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bip != null)
	            	//System.out.println("true");
	            iconp = new ImageIcon(grp);
	            if (iconp != null) 
	           canvas.campanel1p.setIcon(iconp);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	public static IMediaListener mediaListener2p = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi2p = event.getImage();
	              gr2p = bi2p.getScaledInstance(canvas.campanel2p.getWidth(), canvas.campanel2p.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi2p != null)
	            	//System.out.println("true");
	            icon2p = new ImageIcon(gr2p);
	            if (icon2p != null) 
	           canvas.campanel2p.setIcon(icon2p);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	public static IMediaListener mediaListener3p = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi3p = event.getImage();
	              gr3p = bi3p.getScaledInstance(canvas.campanel3p.getWidth(), canvas.campanel3p.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi3p != null)
	            	//System.out.println("true");
	            icon3p = new ImageIcon(gr3p);
	            if (icon3p != null) 
	           canvas.campanel3p.setIcon(icon3p);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	public static IMediaListener mediaListener4p = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi4p = event.getImage();
	              gr4p = bi4p.getScaledInstance(canvas.campanel4p.getWidth(), canvas.campanel4p.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi4p != null)
	            	//System.out.println("true");
	            icon4p = new ImageIcon(gr4p);
	            if (icon4p != null) 
	           canvas.campanel4p.setIcon(icon4p);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	
	public static IMediaListener mediaListener5p = new MediaListenerAdapter() {
	    @Override
	    public void onVideoPicture(IVideoPictureEvent event) {
	         try {
	             bi5p = event.getImage();
	              gr5p = bi5p.getScaledInstance(canvas.campanel5p.getWidth(), canvas.campanel5p.getHeight(),  java.awt.Image.SCALE_SMOOTH);
	            if (bi5p != null)
	            	//System.out.println("true");
	            icon5p = new ImageIcon(gr5p);
	            if (icon5p != null) 
	           canvas.campanel5p.setIcon(icon5p);
	       }catch(Exception ex){
	            ex.printStackTrace();
	       }
	    }
	};
	
	public  void main() throws InterruptedException
	{   
	IMediaReader mediaReader = ToolFactory.makeReader("http://localhost:8888/ptzcamera");   //ptz raw 
		//IMediaReader mediaReader = ToolFactory.makeReader("rtsp://192.168.0.103:5540/ch0");
		//IMediaReader mediaReader = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader.setQueryMetaData(false);
		mediaReader.addListener(mediaListener);
		
	IMediaReader mediaReader2 = ToolFactory.makeReader("http://localhost:8888/camera1");    //right raw
		//IMediaReader mediaReader2 = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader2.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader2.setQueryMetaData(false);
		mediaReader2.addListener(mediaListener2);
		
	IMediaReader mediaReader3 = ToolFactory.makeReader("http://localhost:8888/camera2");   //front raw
		//IMediaReader mediaReader3 = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader3.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader3.setQueryMetaData(false);
		mediaReader3.addListener(mediaListener3);
    	
		
	IMediaReader mediaReader4 = ToolFactory.makeReader("http://localhost:8888/camera3");   //left raw
     	//IMediaReader mediaReader4 = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader4.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader4.setQueryMetaData(false);
		mediaReader4.addListener(mediaListener4);
        
		
		IMediaReader mediaReader5 = ToolFactory.makeReader("http://localhost:8888/camera4");   //back raw
     //	IMediaReader mediaReader5 = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader5.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader5.setQueryMetaData(false);
		mediaReader5.addListener(mediaListener5);
		
		IMediaReader mediaReaderp = ToolFactory.makeReader("http://localhost:8888/ptzcameraprocessed");   //ptz processed 
		//IMediaReader mediaReaderp = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReaderp.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReaderp.setQueryMetaData(false);
		mediaReaderp.addListener(mediaListenerp);
        
		IMediaReader mediaReader2p = ToolFactory.makeReader("http://localhost:8888/camera1processed");    //right processed
		//IMediaReader mediaReader2p = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader2p.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader2p.setQueryMetaData(false);
		mediaReader2p.addListener(mediaListener2p);
		
		
		IMediaReader mediaReader3p = ToolFactory.makeReader("http://localhost:8888/camera2processed");    //right processed
		//IMediaReader mediaReader3p = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader3p.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader3p.setQueryMetaData(false);
		mediaReader3p.addListener(mediaListener3p);
		
		IMediaReader mediaReader4p = ToolFactory.makeReader("http://localhost:8888/camera3processed");    //right processed
		//IMediaReader mediaReader4p = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader4p.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader4p.setQueryMetaData(false);
		mediaReader4p.addListener(mediaListener4p);
		
		
		IMediaReader mediaReader5p = ToolFactory.makeReader("http://localhost:8888/camera4processed");    //right processed
		//IMediaReader mediaReader5p = ToolFactory.makeReader("C:\\Users\\hp\\Downloads\\video\\radar1.mp4"); 
		mediaReader5p.setBufferedImageTypeToGenerate(BufferedImage.TYPE_3BYTE_BGR);
		mediaReader5p.setQueryMetaData(false);
		mediaReader5p.addListener(mediaListener5p);
		
		
		 while (true) {
			 
         if (mediaReader != null)
            mediaReader.readPacket();
         
      if(mediaReader2 != null)
        	 mediaReader2.readPacket();
         
        if(mediaReader3 != null)
        	 mediaReader3.readPacket();
         
        if(mediaReader4 != null)
       	mediaReader4.readPacket();
         
        if(mediaReader5 != null)
        	 mediaReader5.readPacket();
         
        if (mediaReaderp != null)
            mediaReaderp.readPacket();
         
       if (mediaReader2p != null)
           mediaReader2p.readPacket();
         
        if (mediaReader3p != null)
            mediaReader3p.readPacket();
         
       if (mediaReader4p != null)
           mediaReader4p.readPacket();
         
         if (mediaReader5p != null)
             mediaReader5p.readPacket();
		 Thread.sleep(1);
		 }
     
        
	
	
		  
	}
	
}