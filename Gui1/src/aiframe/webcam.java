package aiframe;



//import java.io.File;
//import java.io.IOException;
import com.github.sarxos.webcam.Webcam;


//import com.github.sarxos.webcam.WebcamPanel;
//import com.github.sarxos.webcam.WebcamResolution;
//import com.github.sarxos.webcam.ds.gstreamer.GStreamerDriver;
//import com.github.sarxos.webcam.WebcamDevice;
//import com.github.sarxos.webcam.WebcamDriver;
//import java.awt.Canvas;
//import java.awt.Color;
//import javax.media.CaptureDeviceInfo;
//import javax.media.CaptureDeviceManager;
//import javax.media.Format;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;



//import com.github.sarxos.webcam.WebcamDevice;
//import com.github.sarxos.webcam.WebcamDiscoverySupport;
//import com.github.sarxos.webcam.WebcamDriver;
//import com.github.sarxos.webcam.util.OsUtils;

//import uk.co.caprica.vlcj.discovery.NativeDiscovery;
//import uk.co.caprica.vlcj.medialist.MediaList;
//import uk.co.caprica.vlcj.medialist.MediaListItem;
//import uk.co.caprica.vlcj.player.MediaPlayerFactory;
//import uk.co.caprica.vlcj.player.discoverer.MediaDiscoverer;
//import com.github.sarxos.webcam.ds.civil.LtiCivilDriver;

//import com.sun.jna.Memory;


//import uk.co.caprica.vlcj.medialist.MediaListItem;
//import uk.co.caprica.vlcj.player.MediaPlayer;
//import uk.co.caprica.vlcj.player.MediaPlayerFactory;
//import uk.co.caprica.vlcj.player.direct.BufferFormat;
//import uk.co.caprica.vlcj.player.direct.BufferFormatCallback;
//import uk.co.caprica.vlcj.player.direct.DirectMediaPlayer;
//import uk.co.caprica.vlcj.player.direct.RenderCallback;
///import uk.co.caprica.vlcj.player.direct.format.RV32BufferFormat;




//import java.awt.Canvas;
public class webcam {
	public static Webcam cam1;
	public static Webcam cam2;
	public static Webcam cam3;
	public static Webcam cam4;
	public static Webcam cam5;

	
static	{	
	//Webcam.setDriver(new GStreamerDriver());
    //  Webcam.setDriver(new JmfDriver());
    //  Webcam.setDriver(new V4l4jDriver());
    //  Webcam.setDriver(new VlcjDriver());
	 // Webcam.setDriver(new LtiCivilDriver());
	}
      
public void webcammain()  throws InterruptedException
{
  
	
	
	cam1 = Webcam.getDefault();
	cam1.open();
	
	
	cam2 = Webcam.getDefault();
	cam2.open();

	cam3 = Webcam.getDefault();
	cam3.open();
	
	cam4 = Webcam.getDefault();
	cam4.open();
	
	cam5 = Webcam.getDefault();
	cam5.open();
	

}
    
 
 
    }  
	
