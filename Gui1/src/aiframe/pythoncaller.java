package aiframe;

import java.io.*;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;



public class pythoncaller {
	public static  StringWriter writer;
	public static  ScriptEngineManager manager;
	public static ScriptContext context;
	public static  ScriptEngine engine ;
	
 public static void main(String[] args) throws IOException, ScriptException, InterruptedException 
 {
	
	try {
		 ProcessBuilder builder = new ProcessBuilder();
	     builder.command("python", "D://webcam.py");
	   // builder.command("python", "D://test.py" , "up");
	   
	     Process process = builder.start();
	     process.waitFor();
	   // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	   //  bufferedReader.lines().forEach(System.out::println);
		    	
		   }
 catch (IOException ie) {ie.printStackTrace();}
	

  
	   
  
 }

	
	 
 
}

