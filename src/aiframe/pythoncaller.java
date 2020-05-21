package aiframe;

import java.io.*;
 
class pythoncaller{
public static void main(String args[]){
try{

	
	
	ProcessBuilder pb = new ProcessBuilder("python","C:\\Users\\hp\\Desktop\\test1.py", "right");
	Process p = pb.start();
}catch(Exception e){}
}
}
