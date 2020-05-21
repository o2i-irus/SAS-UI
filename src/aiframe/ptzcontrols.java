package aiframe;


import java.io.IOException;


public class ptzcontrols {

public void down()
{
  try {
	  ProcessBuilder pb = new ProcessBuilder("python","C:\\Users\\hp\\Desktop\\test1.py", "right");
		pb.start();
    } catch (IOException e) {e.printStackTrace();}
  
}
public void left() 
{
	try {
		ProcessBuilder pb = new ProcessBuilder("python","C:\\Users\\hp\\Desktop\\test1.py", "right");
		pb.start();
	    } catch (IOException e) {e.printStackTrace();}
}
public void right()
{
	try {
		ProcessBuilder pb = new ProcessBuilder("python","C:\\Users\\hp\\Desktop\\test1.py", "right");
	    pb.start();
	    } catch (IOException e) {e.printStackTrace();}
}
public void up()
{
	try {
		ProcessBuilder pb = new ProcessBuilder("python","C:\\Users\\hp\\Desktop\\test1.py", "right");
	    pb.start();
		
	    } catch (IOException e) {e.printStackTrace();}
}
}
