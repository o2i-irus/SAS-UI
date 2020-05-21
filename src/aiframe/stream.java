package aiframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;
import uk.co.caprica.vlcj.player.embedded.windows.Win32FullScreenStrategy;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.runtime.x.LibXUtil;

public class stream {
	
	public static MediaPlayerFactory mpf1;
	public static EmbeddedMediaPlayer emp1;
	public static CanvasVideoSurface v1;
	
	public static MediaPlayerFactory mpf2;
	public static EmbeddedMediaPlayer emp2;
	public static CanvasVideoSurface v2;
	
	public static MediaPlayerFactory mpf3;
	public static EmbeddedMediaPlayer emp3;
	public static CanvasVideoSurface v3;
	
	public static MediaPlayerFactory mpf4;
	public static EmbeddedMediaPlayer emp4;
	public static CanvasVideoSurface v4;
	
	public static MediaPlayerFactory mpf5;
	public static EmbeddedMediaPlayer emp5;
	public static CanvasVideoSurface v5;
	
	public static MediaPlayerFactory mpf6;
	public static EmbeddedMediaPlayer emp6;
	public static CanvasVideoSurface v6;
	
	public static MediaPlayerFactory mpf7;
	public static EmbeddedMediaPlayer emp7;
	public static CanvasVideoSurface v7;
	
	public static MediaPlayerFactory mpf8;
	public static EmbeddedMediaPlayer emp8;
	public static CanvasVideoSurface v8;
	
	public static MediaPlayerFactory mpf9;
	public static EmbeddedMediaPlayer emp9;
	public static CanvasVideoSurface v9;
	
	public static MediaPlayerFactory mpf10;
	public static EmbeddedMediaPlayer emp10;
	public static CanvasVideoSurface v10;
	
	public static String s = "http://localhost:";
	static int port=8888;
    
	
	
public void main()
{
	LibXUtil.initialise();
	    //NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "C:\\Program Files\\VideoLAN\\VLC");
		//Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);	
	 
//	NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), "\"libvlc\", vlcInstallPath.getAbsolutePath()");
	//		Native.loadLibrary(RuntimeUtil.getLibVlcLibraryName(), LibVlc.class);	
	
	                            EventQueue.invokeLater(new Runnable() {
			                      public void run() {
				                     try { 
					
				                        mpf1 = new MediaPlayerFactory();
                                       emp1 = mpf1.newEmbeddedMediaPlayer();
                                       v1 = mpf1.newVideoSurface(canvas.campanel1);
                                       
                                       emp1.setVideoSurface(v1); 
                                      // emp1.setAudioOutput(null);
                                              
				
                                                  
                                                  mpf2 = new MediaPlayerFactory();
										             emp2 = mpf2.newEmbeddedMediaPlayer();
										             v2 = mpf2.newVideoSurface(canvas.campanel2);
										             emp2.setVideoSurface(v2);
										            // emp2.setAudioOutput(null);
										      
										      
										            
										            mpf3 = new MediaPlayerFactory();
										             emp3 = mpf3.newEmbeddedMediaPlayer();
										             v3 = mpf3.newVideoSurface(canvas.campanel3);
										             emp3.setVideoSurface(v3);
										       //      emp3.setAudioOutput(null);
										       
										       
										            
										       	 mpf4 = new MediaPlayerFactory();
									             emp4 = mpf4.newEmbeddedMediaPlayer();
									             v4 = mpf4.newVideoSurface(canvas.campanel4);
									             emp4.setVideoSurface(v4);
									           //  emp4.setAudioOutput(null);
									        
									         
									             
									             mpf5 = new MediaPlayerFactory();
									             emp5 = mpf5.newEmbeddedMediaPlayer();
									             v5 = mpf5.newVideoSurface(canvas.campanel5);
									            emp5.setVideoSurface(v5);
									          //  emp5.setAudioOutput(null);
									     
									            
									             
									             mpf6 = new MediaPlayerFactory();
									             emp6 = mpf6.newEmbeddedMediaPlayer();
									            v6 = mpf6.newVideoSurface(canvas.campanel1p);
									             emp6.setVideoSurface(v6);
									         //    emp6.setAudioOutput(null);
									           
									           
									             
									             mpf7 = new MediaPlayerFactory();
									             emp7 = mpf7.newEmbeddedMediaPlayer();
									           v7 = mpf7.newVideoSurface(canvas.campanel2p);
									            emp7.setVideoSurface(v7);
									          //  emp7.setAudioOutput(null);
									        
									           
									           
									           mpf8 = new MediaPlayerFactory();
									             emp8 = mpf8.newEmbeddedMediaPlayer();
									          v8 = mpf8.newVideoSurface(canvas.campanel3p);
									             emp8.setVideoSurface(v8);
									          //   emp8.setAudioOutput(null);
									       
									             
									             
									             mpf9 = new MediaPlayerFactory();
									             emp9 = mpf9.newEmbeddedMediaPlayer();
									            v9 = mpf9.newVideoSurface(canvas.campanel4p);
									             emp9.setVideoSurface(v9);
									           //  emp9.setAudioOutput(null);							             
									         
									          
									            
									            mpf10 = new MediaPlayerFactory();
									             emp10 = mpf10.newEmbeddedMediaPlayer();
									             v10 = mpf10.newVideoSurface(canvas.campanel5p);
									             emp10.setVideoSurface(v10);
									           //  emp10.setAudioOutput(null);
									      
									     
			                               	} catch (Exception e) {
					                    e.printStackTrace();
				                        }
			                          }
		                            });
					              
	                         
			                   	
			                   		
						          
						            EventQueue.invokeLater(new Runnable() {
					                      public void run() {
						                     try {  
						                 		//emp1.playMedia("http://localhost:8888/camera1");
					                   			emp6.playMedia(s + port + "/cameraprocessed1");      
						                    	 
						      
						                    	 
						                  //  emp1.playMedia(s + port + "/camera1");    //ptz camera
				                            
						                    	 // emp1.playMedia("C:\\Users\\hp\\Downloads\\Video\\raw1.mp4");
						                    	//emp1.playMedia("/home/pratish/Desktop/pro5.mp4");
				                                //  emp1.setAudioOutput(null);
				                                //emp1.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try {//emp6.playMedia(s + port + "/cameraprocessed1"); 
						                    	    	  // emp2.playMedia(s + port + "/camera1");      //right cam
												  //  em-p2.playMedia(s + port + "/camera0");
						                    	    	//    emp2.playMedia("C:\\Users\\hp\\Downloads\\video\\raw2.mp4");
						                    	    	//    emp2.setAudioOutput(null);
						                    	    //	    emp2.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try {
						                    	 	 //emp3.playMedia(s + port + "/camera2");         //front cam
						                    	 	// emp3.playMedia(s + port + "/camera0");
						                    	 	//   emp3.playMedia("C:\\Users\\hp\\Downloads\\video\\raw3.mp4");
						                    	 	//  emp3.setAudioOutput(null);
						                    	 	//  emp3.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                  	   //emp4.playMedia(s + port + "/camera3");     //left cam
						                  	// emp4.playMedia(s + port + "/camera0");
						                  	//  emp4.playMedia("C:\\Users\\hp\\Downloads\\video\\raw4.mp4");
						                  //	 emp4.setAudioOutput(null);
						               //   	  emp4.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                    	  //emp5.playMedia(s + port + "/camera4");           //back cam
						                    	 // emp5.playMedia(s + port + "/camera0");
						                    	//  emp5.playMedia("C:\\Users\\hp\\Downloads\\video\\raw5.mp4");
						                    	//  emp5.setAudioOutput(null);
						                    	  emp5.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                    	        // ptz cam processed
						                    	//  emp6.playMedia(s + port + "/cameraprocessed0");
						                    	//  emp6.playMedia("C:\\Users\\hp\\Downloads\\video\\pro1.mp4");
						                    	//  emp6.setAudioOutput(null);
						                    	//  emp6.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                    	 //emp7.playMedia(s + port + "/cameraprocessed1");         //right cam processed
						                    	// emp7.playMedia(s + port + "/cameraprocessed0");
						                    	// emp7.playMedia("C:\\Users\\hp\\Downloads\\video\\pro2.mp4");
						                    	// emp7.setAudioOutput(null);
						                    	//  emp7.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                   //  emp8.playMedia(s + port + "/cameraprocessed2");           //front cam processed
						                  //   emp8.playMedia(s + port + "/cameraprocessed0");   
						                    //   emp8.playMedia("C:\\Users\\hp\\Downloads\\video\\pro3.mp4");
						                      // emp8.setAudioOutput(null);
						                   //    emp8.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                    	  	 //emp9.playMedia(s + port + "/cameraprocessed3");            //left cam processed
						                    	//  	 emp9.playMedia(s + port + "/cameraprocessed0");
						                    	  	  //   emp9.playMedia("C:\\Users\\hp\\Downloads\\video\\pro4.mp4");
						                    	  	//   emp9.setAudioOutput(null);
						                    	  //	   emp9.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     try { 
						                    // emp10.playMedia(s + port + "/cameraprocessed4");             //back cam processed
						                  //   emp10.playMedia(s + port + "/cameraprocessed0");        
						                    //   emp10.playMedia("C:\\Users\\hp\\Downloads\\video\\pro5.mp4");
						                     //  emp10.setAudioOutput(null);
						                     //  emp10.setRepeat(true);
						                     } catch (Exception e) {e.printStackTrace();}
						                     
						           
					                          }
				                            });
					                
					 
			
	
	}
}
