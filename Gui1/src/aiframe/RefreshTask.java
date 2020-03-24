package aiframe;
import javax.imageio.ImageIO;
import aiframe.Frame.*;
import javax.swing.*;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.TimerTask;

import aiframe.Frame.*;
public class RefreshTask extends TimerTask  {
public static BufferedImage cameraOne;
	
@Override
    public void run() {
        try {
            cameraOne = ImageIO.read(new URL(CCTV.imageOne));
         //  BufferedImage cameraTwo = ImageIO.read(new URL(CCTV.imageTwo));
         //  BufferedImage cameraThree = ImageIO.read(new URL(CCTV.imageThree));

          // frame.setImage(cameraOne);
          // CCTV.c.cPanel2.setImage(cameraTwo);
          // CCTV.c.cPanel3.setImage(cameraThree);
        } catch (MalformedURLException ex) {
            throw new Error("One of the cameras you are trying to connect to doesn't exist!");
        } catch (IOException ex) {
            throw new Error("CCTV couldn't connect to the required camera feeds!");
        }
    }
}

