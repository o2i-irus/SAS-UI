package aiframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class test {
	public static String old;
	public static String olddb;
	public static String oldsp;
public static void main ()
{//==========================notification================================
	Timer timer1 = new Timer(3000, new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent arg0) {
		  Frame.crnot.setText(clock.txt.getText() + "\nSURVEILLANCE SYSTEM ACTIVATED");
		  }
		});
		timer1.setRepeats(false);
		timer1.start();
		
		
		Timer timer2 = new Timer(5000, new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent arg0) {
			    old = Frame.crnot.getText();
			   Frame.crnot.setText(old+"\n"+clock.txt.getText()+"\nCAMERAS ACTIVATED");
			   Frame.crnot.repaint();
			  }
			});
			timer2.setRepeats(false);
			timer2.start();
			
			
			Timer timer3 = new Timer(7000, new ActionListener() {
				  @Override
				  public void actionPerformed(ActionEvent arg0) {
				   old = Frame.crnot.getText();
				   Frame.crnot.setText(old+"\n"+clock.txt.getText()+"\nRAW CAMERA FEED");
				   Frame.crnot.repaint();
				  }
				});
				timer3.setRepeats(false);
				timer3.start();
				
				//=======================special notification
				
				
				Timer timer9 = new Timer(5000, new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent arg0) {
					  oldsp= Frame.spnot.getText();
					   Frame.spnot.setText(clock.txt.getText()+"\nSUSPICIOUS ACTIVITY DETECTED");
					  	
					   
					  }
					});
					timer9.setRepeats(false);
					timer9.start();
					
					
					
					Timer timer10 = new Timer(9000, new ActionListener() {
						  @Override
						  public void actionPerformed(ActionEvent arg0) {
						  oldsp= Frame.spnot.getText();
						   Frame.spnot.setText(oldsp+"\n"+clock.txt.getText()+"\nFIRE DETECTED");
						  	
						   
						  }
						});
						timer10.setRepeats(false);
						timer10.start();
						
						
						Timer timer11 = new Timer(12000, new ActionListener() {
							  @Override
							  public void actionPerformed(ActionEvent arg0) {
							  oldsp= Frame.spnot.getText();
							   Frame.spnot.setText(oldsp+"\n"+clock.txt.getText()+"\nMOB AGGREGATION DETECTED");
							  	
							   
							  }
							});
							timer11.setRepeats(false);
							timer11.start();
							
							
							
							Timer timer12 = new Timer(16000, new ActionListener() {
								  @Override
								  public void actionPerformed(ActionEvent arg0) {
								  oldsp= Frame.spnot.getText();
								   Frame.spnot.setText(oldsp+"\n"+clock.txt.getText()+"\nVEHICLE BEING TOSSED");
								  	
								   
								  }
								});
								timer12.setRepeats(false);
								timer12.start();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//==================================database===================================
				

				
							
		
}
public void dbtest() 
{
	Timer timer4 = new Timer(1, new ActionListener() {
		  @Override
		  public void actionPerformed(ActionEvent arg0) {
		   
		   Frame.dbdetails.setText(clock.txt.getText()+"\nPERSON | VEHICLE TRACKING ACTIVATED");
		   
		  }
		});
		timer4.setRepeats(false);
		timer4.start();
		
		
		Timer timer5 = new Timer(1000, new ActionListener() {
			  @Override
			  public void actionPerformed(ActionEvent arg0) {
			   olddb= Frame.dbdetails.getText();
			   Frame.dbdetails.setText(olddb+"\n"+clock.txt.getText()+"\nCONNECTING TO DATABASE");
			  
			   
			  }
			});
			timer5.setRepeats(false);
			timer5.start();
			
			
			
			Timer timer6 = new Timer(2000, new ActionListener() {
				  @Override
				  public void actionPerformed(ActionEvent arg0) {
				  olddb= Frame.dbdetails.getText();
				   Frame.dbdetails.setText(olddb+"\n"+clock.txt.getText()+"\nCONNECTION ESTABLISHED");
				   
				  }
				});
				timer6.setRepeats(false);
				timer6.start();
				
				
				Timer timer7 = new Timer(3000, new ActionListener() {
					  @Override
					  public void actionPerformed(ActionEvent arg0) {
					  olddb= Frame.dbdetails.getText();
					   Frame.dbdetails.setText(olddb+"\n"+clock.txt.getText()+"\nVEHICLE 1 IDENTIFIED"+"\n"+"MP01AA1234");
					   
					  }
					});
					timer7.setRepeats(false);
					timer7.start();
					
					
					
					Timer timer8 = new Timer(5000, new ActionListener() {
						  @Override
						  public void actionPerformed(ActionEvent arg0) {
						  olddb= Frame.dbdetails.getText();
						   Frame.dbdetails.setText(olddb+"\n"+clock.txt.getText()+"\nPERSON 1 IDENTIFIED"+"\n"+"NAME-RAHUL TIVARI, AGE-28YRS");
						   
						  }
						});
						timer8.setRepeats(false);
						timer8.start();
						
						
						
						
					
				
}
}
