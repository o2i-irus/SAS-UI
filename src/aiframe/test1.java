package aiframe;
import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.FFmpegFrameRecorder;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.avutil;
import com.googlecode.javacv.cpp.opencv_core.IplImage;

public class test1 {

    public static final String FILENAME = "output.mp4";

    public static void test1main() throws Exception {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();
        IplImage grabbedImage = grabber.grab();

        CanvasFrame canvasFrame = new CanvasFrame("Cam");
        canvasFrame.setCanvasSize(grabbedImage.width(), grabbedImage.height());

        System.out.println("framerate = " + grabber.getFrameRate());
        grabber.setFrameRate(grabber.getFrameRate());
        FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(FILENAME,  grabber.getImageWidth(),grabber.getImageHeight());

        recorder.setCodecID(13);
        recorder.setFormat("mp4");
        recorder.setPixelFormat(avutil.PIX_FMT_YUV420P);
        recorder.setFrameRate(30);
        recorder.setBitrate(10 * 1024 * 1024);

        recorder.start();
        while (canvasFrame.isVisible() && (grabbedImage = grabber.grab()) != null) {
            canvasFrame.showImage(grabbedImage);
            recorder.record(grabbedImage);
        }
        recorder.stop();
        grabber.stop();
        canvasFrame.dispose();
    }
}