package aiframe;
import java.util.Locale;
public class detectOS 
{
  
  public enum OSType 
  {
    Windows, MacOS, Linux, Other;
  }


  public static OSType detectedOS;
  public static String OS;
 
  public static OSType getOperatingSystemType() 
  {
    if (detectedOS == null) {
      OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
      if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) 
      {
        detectedOS = OSType.MacOS;
      }
      else if (OS.indexOf("win") >= 0) 
      {
        detectedOS = OSType.Windows;
      }
      else if (OS.indexOf("nux") >= 0) 
      {
        detectedOS = OSType.Linux;
      } else {
        detectedOS = OSType.Other;
      }
    }
    return detectedOS;
  }
}