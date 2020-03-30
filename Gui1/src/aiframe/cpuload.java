package aiframe;



import java.lang.management.ManagementFactory;
//import java.lang.management.OperatingSystemMXBean;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.sun.management.OperatingSystemMXBean;


import javax.swing.Timer;
//import java.util.TimerTask; 

import javax.swing.BorderFactory;


public class cpuload 
{
	

	public static double dcpu;
	public static int icpu;
	public static String scpu;
	
	public static double dram;
	public static int iram;
	public static String sram;
	
	
	
   public void cpuloadmain()
   { 
	   
	   
	   OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
	
	   Timer timer = new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	double a = (osBean.getProcessCpuLoad()*100);
	        	 double b = (osBean.getSystemCpuLoad()*100);
	        		dcpu = (osBean.getSystemCpuLoad()*100);
	        		icpu = (int)dcpu;
	        		scpu= String.valueOf(icpu);
	        	    dram = ((osBean.getTotalPhysicalMemorySize()-(osBean.getFreePhysicalMemorySize()))*0.0000000000931*100);
	        	    iram = (int)dram;
	        	    sram = String.valueOf(iram);
	        	    txtcpuram.txtram.setText(sram + "%");
	        	    barcpuram.cpumeter.setValue(icpu);
	        	    if(icpu > 80) 
	        	    { 
	        	    	barcpuram.cpumeter.setForeground(Color.RED);
	        	    	barcpuram.cpumeter.setBorder(BorderFactory.createLineBorder(Color.RED));
	        	    }
	        	    else
	        	    {
	        	    	barcpuram.cpumeter.setForeground(Color.YELLOW);
	        	    	barcpuram.cpumeter.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	        	    }
	        	    txtcpuram.txtcpu.setText(scpu + "%");
	        	    barcpuram.rammeter.setValue(iram);
	        	    if(iram>80)
	        	    {
	        	    	barcpuram.rammeter.setForeground(Color.RED);
	        	    	barcpuram.rammeter.setBorder(BorderFactory.createLineBorder(Color.RED));
	        	    }
	        	    else 
	        	    {
	        	    	barcpuram.rammeter.setForeground(Color.YELLOW);
	        	    	barcpuram.rammeter.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
	        	    }
	        }
	    });
		timer.setRepeats(true);
		 timer.setCoalesce(true);
	     timer.start();
	   
	   
	   
	   
	  
	 
	 
	    
 
    
    
   
   }  
}