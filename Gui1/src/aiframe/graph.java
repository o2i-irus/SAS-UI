package aiframe;


import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BorderFactory;

import javax.swing.JPanel;

import javax.swing.SwingWorker;


import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XChartPanel;
import org.knowm.xchart.XYChart;






public class graph
{
	
	public static MySwingWorker mySwingWorker;
	 public static SwingWrapper<XYChart> sw;
	 public static XYChart chart;
	 public static JPanel graphhold;
public void main() 
{
	   
	
	chart = QuickChart.getChart(" ", "Time", "Value", "randomWalk", new double[] { 0}, new double[] { 0 });
	   chart.getStyler().setLegendVisible(false);
	    chart.getStyler().setXAxisTicksVisible(false);
	    chart.getStyler().setChartBackgroundColor(Color.GRAY);   
	    chart.getStyler().setChartFontColor(Color.YELLOW);
	    chart.getStyler().setToolTipHighlightColor(Color.YELLOW);
	    chart.getStyler().setChartTitleBoxBackgroundColor(Color.YELLOW);
	    chart.getStyler().setPlotBackgroundColor(Color.BLACK);
	    chart.getStyler().setPlotBorderColor(Color.YELLOW);
	    chart.getStyler().setAnnotationsFont(new Font("Bahnschrift", Font.PLAIN, 18));
	    chart.getStyler().setChartPadding(1);
	    chart.getStyler().setPlotContentSize(1);

	    
	    graphhold = new XChartPanel<XYChart>(chart);
	    graphhold.setBounds(740, 374, 352, 272);
	  	graphhold.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
    	graphhold.setBackground(Color.BLACK);
    	graphhold.setVisible(true);
	    Frame.frame.add(graphhold);
	 
	  
	    
	  mySwingWorker = new MySwingWorker();
	   mySwingWorker.execute();
	 
	   
	   
}
public class MySwingWorker extends SwingWorker<Boolean, double[]> {
	 
    LinkedList<Double> fifo = new LinkedList<Double>();
 
    public MySwingWorker() {
 
      fifo.add(0.0);
    }
 
    @Override
    public Boolean doInBackground() throws Exception {
 
      while (!isCancelled()) {
 
        fifo.add(fifo.get(fifo.size() - 1) + Math.random() - .5);
        if (fifo.size() > 100) {
          fifo.removeFirst();
        }
 
        double[] array = new double[fifo.size()];
        for (int i = 0; i < fifo.size(); i++) {
          array[i] = fifo.get(i);
        }
        publish(array);
        graphhold.repaint();
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          // eat it. caught when interrupt is called
          System.out.println("MySwingWorker shut down.");
        }
 
      }
 
      return true;
    }
 
    @Override
    public void process(List<double[]> chunks) {
 
      System.out.println("number of chunks: " + chunks.size());
 
      double[] mostRecentDataSet = chunks.get(chunks.size() - 1);
 
      chart.updateXYSeries("randomWalk", null, mostRecentDataSet, null);
      sw.repaintChart();
 
      long start = System.currentTimeMillis();
      long duration = System.currentTimeMillis() - start;
      try {
       // Thread.sleep(40 - duration); // 40 ms ==> 25fps
        Thread.sleep(400 - duration); // 40 ms ==> 2.5fps
      } catch (InterruptedException e) {
      }
 
    }
  }
}