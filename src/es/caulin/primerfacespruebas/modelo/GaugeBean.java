/**
* Author: Héctor Caulín Roldán
* Last Modified: 3/3/2015
* Filename: GaugeBean.java
*/
package es.caulin.primerfacespruebas.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.primefaces.model.chart.MeterGaugeChartModel;

public class GaugeBean implements Serializable {

	private static final long serialVersionUID = 9094640837867808615L;
	
	private MeterGaugeChartModel meterGaugeModel;
	
	public MeterGaugeChartModel getMeterGaugeModel() {
		  meterGaugeModel.setValue((Math.random() * 190) + 20);
		  return meterGaugeModel;
		 }
	
	public GaugeBean() {
		  createMeterGaugeModel();
		 }
	
	 private void createMeterGaugeModel() {
		  List<Number> intervals = new ArrayList<Number>() {
		   /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

		{
		    add(20);
		    add(50);
		    add(120);
		    add(220);
		   }
		  };
		  meterGaugeModel = new MeterGaugeChartModel(0, intervals);
	 } 
}
