package aiframe;




import java.util.Timer;

public class CCTV {
	//public static JPanel c = new JPanel();
	
	
	
	
	
	public static String imageOne = "";
   // public static String imageTwo = "http://131940.qld.gov.au/DMR.Controls/WebCams/DisplayImage.ashx?FilePath=\\Metropolitan\\MRMETRO-1464.jpg&-713108812";
   // public static String imageThree = "http://131940.qld.gov.au/DMR.Controls/WebCams/DisplayImage.ashx?FilePath=\\Metropolitan\\MRMETRO-1224.jpg&-681858012";
    public static void runnable (String[] args)
    {
    	Timer timer = new Timer();
        timer.schedule(new RefreshTask(), 0, 10);
       
    	
    	
    	
    }
}
