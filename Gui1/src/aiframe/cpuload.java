package aiframe;
import java.lang.management.*;
import java.io.File;
import java.lang.management.ManagementFactory;
//import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.management.RuntimeMXBean;
import java.io.*;
import java.net.*;
import java.util.*;
import java.io.LineNumberReader;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.util.Random;
import aiframe.test;
public class cpuload {
public void cpuload()
{
	ThreadMXBean TMB = ManagementFactory.getThreadMXBean();
	long time = new Date().getTime() * 1000000;
	long cput = 0;
	double cpuperc = -1;
	 
	//Begin loop.
	 
	if( TMB.isThreadCpuTimeSupported() )
	{
	        if(new Date().getTime() * 1000000 - time > 1000000000) //Reset once per second
	        {
	            time = new Date().getTime() * 1000000;
	            cput = TMB.getCurrentThreadCpuTime();
	        }
	                     
	        if(!TMB.isThreadCpuTimeEnabled())
	        {
	            TMB.setThreadCpuTimeEnabled(true);
	        }
	                     
	        if(new Date().getTime() * 1000000 - time != 0)
	            cpuperc = (TMB.getCurrentThreadCpuTime() - cput) / (new Date().getTime() * 1000000.0 - time) * 100.0;               
	}
	else
	{
	    cpuperc = -2;
	}
	 
	//Do cpu intensive stuff
	 
	//End Loop
	
}
}