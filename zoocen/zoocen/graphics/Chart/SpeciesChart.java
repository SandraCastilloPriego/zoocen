/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package graphics.Chart;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author bicha
 */
public class SpeciesChart extends JFrame {
    JFreeChart chart; 
    XYSeriesCollection dataset;
    XYSeries[] series;
    String[] species;
    ChartPanel chartPanel;
    public SpeciesChart(String title, String[] species){        
        super(title);
        dataset = new XYSeriesCollection(); 
        this.species = species;
        this.setSeries();
        this.setSize(new Dimension(700, 600));
        chart = ChartFactory.createXYLineChart(
            title,
            "Generations",
            "Inhabitants",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );            
      
        chart.setBackgroundPaint(new Color(0xCC,0xCC, 0xFF));
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }
    
    public ChartPanel getChartPanel(){
        return chartPanel;
    }
    
    public void setSeries(){       
        this.series = new XYSeries[species.length];
        for(int i = 0; i < species.length; i++){
            series[i] = new XYSeries(species[i]);
            this.dataset.addSeries(series[i]);
        }        
    }
    
    public void addData(double[] inhabitants, int iteration) {  
        
        for (int i = 0; i < this.species.length; i++) { 
            if(series[i].getItemCount() > 2000){
                series[i].remove(0);
            }
            series[i].add(iteration, inhabitants[i]);
        }          
        this.repaint();
    }
}
