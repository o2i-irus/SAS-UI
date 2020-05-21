package aiframe;
import java.io.File;


public class createfolder {
	public static File rleft;
	public static File rright;
	public static File rfront;
	public static File rback;
	public static File rptz;
	public static File pleft;
	public static File pright;
	public static File pfront;
	public static File pback;
	public static File pptz;
  public void createfoldermain()
  {
	 if (detectOS.OS.indexOf("win") >= 0)    //if OS is windows
		 
	  {
	   rleft = new File("C:\\Saved Videos\\RAW\\Left Camera");
	  if(!rleft.exists()) {rleft.mkdirs();}
	  
	  
	   rright = new File("C:\\Saved Videos\\RAW\\Right Camera");
	  if(!rright.exists()) {rright.mkdirs();}
	  
	  
	   rfront = new File("C:\\Saved Videos\\RAW\\Front Camera");
	  if(!rfront.exists()) {rfront.mkdirs();}
	  
	  
	   rback = new File("C:\\Saved Videos\\RAW\\Back Camera");
	  if(!rback.exists()) {rback.mkdirs();}
	  
	  
	   rptz = new File("C:\\Saved Videos\\RAW\\PTZ Camera");
	  if(!rptz.exists()) {rptz.mkdirs();}
	  
	  
	   pleft = new File("C:\\Saved Videos\\PROCESSED\\Left Camera");
	  if(!pleft.exists()) {pleft.mkdirs();}
	 
	  
	   pright = new File("C:\\Saved Videos\\PROCESSED\\Right Camera");
	  if(!pright.exists()) {pright.mkdirs();}
	 
	  
	  
	   pfront = new File("C:\\Saved Videos\\PROCESSED\\Front Camera");
	  if(!pfront.exists()) {pfront.mkdirs();}
	  
	  
	   pback = new File("C:\\Saved Videos\\PROCESSED\\Back Camera");
	  if(!pback.exists()) {pback.mkdirs();}
	   
	  
	   pptz = new File("C:\\Saved Videos\\PROCESSED\\PTZ Camera");
	  if(!pptz.exists()) {pptz.mkdirs();}
	  }
	
	 
	/* if (detectOS.OS.indexOf("nux") >= 0)   //if OS is linux
	 {
		 rleft = new File("Saved Videos/RAW/Left Camera");
		  if(!rleft.exists()) {rleft.mkdirs();}
		  
		  
		   rright = new File("/Saved Videos/RAW/Right Camera");
		  if(!rright.exists()) {rright.mkdirs();}
		  
		  
		   rfront = new File("/Saved Videos/RAW/Front Camera");
		  if(!rfront.exists()) {rfront.mkdirs();}
		  
		  
		   rback = new File("/Saved Videos/RAW/Back Camera");
		  if(!rback.exists()) {rback.mkdirs();}
		  
		  
		   rptz = new File("/Saved Videos/RAW/PTZ Camera");
		  if(!rptz.exists()) {rptz.mkdirs();}
		  
		  
		   pleft = new File("/Saved Videos/PROCESSED/Left Camera");
		  if(!pleft.exists()) {pleft.mkdirs();}
		 
		  
		   pright = new File("/Saved Videos/PROCESSED/Right Camera");
		  if(!pright.exists()) {pright.mkdirs();}
		 
		  
		  
		   pfront = new File("/Saved Videos/PROCESSED/Front Camera");
		  if(!pfront.exists()) {pfront.mkdirs();}
		  
		  
		   pback = new File("/Saved Videos/PROCESSED/Back Camera");
		  if(!pback.exists()) {pback.mkdirs();}
		   
		  
		   pptz = new File("/Saved Videos/PROCESSED/PTZ Camera");
		  if(!pptz.exists()) {pptz.mkdirs();} 
	 }  */
	 
	 
	 }
}
