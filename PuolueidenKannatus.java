package Puolueet;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PuolueidenKannatus extends Application {

	public static void main(String[] args) {
		launch(PuolueidenKannatus.class);

	}

	@Override
	public void start(Stage ikkuna) throws Exception {
		
		NumberAxis xAkseli = new NumberAxis(1968, 2008, 4);
		

		NumberAxis yAkseli = new NumberAxis(0, 30, 5);
		

		LineChart<Number, Number> viivakaavio = new LineChart<>(xAkseli, yAkseli);
		viivakaavio.setTitle("Puolueiden suhteellinen kannatus");



		XYChart.Series kokoomus = new XYChart.Series();
		kokoomus.setName("KOK");
		kokoomus.getData().add(new XYChart.Data(1968,16.1));
		kokoomus.getData().add(new XYChart.Data(1972,18.1));
		kokoomus.getData().add(new XYChart.Data(1976,20.9));
		kokoomus.getData().add(new XYChart.Data(1980,22.9));
		kokoomus.getData().add(new XYChart.Data(1984,23.0));
		kokoomus.getData().add(new XYChart.Data(1988,22.9));
		kokoomus.getData().add(new XYChart.Data(1992,19.1));
		kokoomus.getData().add(new XYChart.Data(1996,21.6));
		kokoomus.getData().add(new XYChart.Data(2000, 20.8));
		kokoomus.getData().add(new XYChart.Data(2004, 21.8));
		kokoomus.getData().add(new XYChart.Data(2008, 23.4));
		
		XYChart.Series sdp = new XYChart.Series();
		sdp.setName("SDP");
		sdp.getData().add(new XYChart.Data(1968,23.9));
		sdp.getData().add(new XYChart.Data(1972,27.1));
		sdp.getData().add(new XYChart.Data(1976,24.8));
		sdp.getData().add(new XYChart.Data(1980,25.5));
		sdp.getData().add(new XYChart.Data(1984,24.7));
		sdp.getData().add(new XYChart.Data(1988,25.2));
		sdp.getData().add(new XYChart.Data(1992,27.1));
		sdp.getData().add(new XYChart.Data(1996,24.5));
		sdp.getData().add(new XYChart.Data(2000, 23.0));
		sdp.getData().add(new XYChart.Data(2004, 24.1));
		sdp.getData().add(new XYChart.Data(2008, 21.2));
		
		
		XYChart.Series keskusta = new XYChart.Series();
		keskusta.setName("KESK");
		keskusta.getData().add(new XYChart.Data(1968,18.9));
		keskusta.getData().add(new XYChart.Data(1972,18.0));
		keskusta.getData().add(new XYChart.Data(1976,18.4));
		keskusta.getData().add(new XYChart.Data(1980,18.7));
		keskusta.getData().add(new XYChart.Data(1984,20.2));
		keskusta.getData().add(new XYChart.Data(1988,21.1));
		keskusta.getData().add(new XYChart.Data(1992,19.2));
		keskusta.getData().add(new XYChart.Data(1996,21.8));
		keskusta.getData().add(new XYChart.Data(2000, 23.8));
		keskusta.getData().add(new XYChart.Data(2004, 22.8));
		keskusta.getData().add(new XYChart.Data(2008, 20.1));
		
		
		XYChart.Series vihreät = new XYChart.Series();
		vihreät.setName("VIHR");
		//vihreät.getData().add(new XYChart.Data(1968, 0));
		//vihreät.getData().add(new XYChart.Data(1972,18.1));
		//vihreät.getData().add(new XYChart.Data(1976,20.9));
		//vihreät.getData().add(new XYChart.Data(1980,22.9));
		vihreät.getData().add(new XYChart.Data(1984,2.8));
		vihreät.getData().add(new XYChart.Data(1988,2.3));
		vihreät.getData().add(new XYChart.Data(1992,6.9	));
		vihreät.getData().add(new XYChart.Data(1996,6.3));
		vihreät.getData().add(new XYChart.Data(2000, 7.7));
		vihreät.getData().add(new XYChart.Data(2004, 7.4));
		vihreät.getData().add(new XYChart.Data(2008, 8.9));
		
		
		XYChart.Series vasemmisto = new XYChart.Series();
		vasemmisto.setName("VAS");
		vasemmisto.getData().add(new XYChart.Data(1968,16.9));
		vasemmisto.getData().add(new XYChart.Data(1972,17.5));
		vasemmisto.getData().add(new XYChart.Data(1976,18.5));
		vasemmisto.getData().add(new XYChart.Data(1980,16.6));
		vasemmisto.getData().add(new XYChart.Data(1984,13.1));
		vasemmisto.getData().add(new XYChart.Data(1988,12.6));
		vasemmisto.getData().add(new XYChart.Data(1992,11.7));
		vasemmisto.getData().add(new XYChart.Data(1996,10.4));
		vasemmisto.getData().add(new XYChart.Data(2000, 9.9));
		vasemmisto.getData().add(new XYChart.Data(2004, 9.6));
		vasemmisto.getData().add(new XYChart.Data(2008, 8.8));
		
		
		XYChart.Series persut = new XYChart.Series();
		persut.setName("PS");
		persut.getData().add(new XYChart.Data(1968,7.3));
		persut.getData().add(new XYChart.Data(1972,5.0));
		persut.getData().add(new XYChart.Data(1976,2.1));
		persut.getData().add(new XYChart.Data(1980,3.0));
		persut.getData().add(new XYChart.Data(1984,5.3));
		persut.getData().add(new XYChart.Data(1988,3.6));
		persut.getData().add(new XYChart.Data(1992,2.4));
		persut.getData().add(new XYChart.Data(1996,0.9));
		persut.getData().add(new XYChart.Data(2000, 0.7));
		persut.getData().add(new XYChart.Data(2004, 0.9));
		persut.getData().add(new XYChart.Data(2008, 5.4));
		
		
		XYChart.Series sruotsi = new XYChart.Series();
		sruotsi.setName("RKP");
		sruotsi.getData().add(new XYChart.Data(1968,5.6));
		sruotsi.getData().add(new XYChart.Data(1972,5.2));
		sruotsi.getData().add(new XYChart.Data(1976,4.7));
		sruotsi.getData().add(new XYChart.Data(1980,4.7));
		sruotsi.getData().add(new XYChart.Data(1984,5.1));
		sruotsi.getData().add(new XYChart.Data(1988,5.3));
		sruotsi.getData().add(new XYChart.Data(1992,5.0));
		sruotsi.getData().add(new XYChart.Data(1996,5.4));
		sruotsi.getData().add(new XYChart.Data(2000, 5.1));
		sruotsi.getData().add(new XYChart.Data(2004, 5.2));
		sruotsi.getData().add(new XYChart.Data(2008, 4.7));
		
		
		viivakaavio.getData().add(kokoomus);
		viivakaavio.getData().add(sdp);
		viivakaavio.getData().add(keskusta);
		viivakaavio.getData().add(vihreät);
		viivakaavio.getData().add(vasemmisto);
		viivakaavio.getData().add(persut);
		viivakaavio.getData().add(sruotsi);

	

		Scene nakyma = new Scene(viivakaavio, 640, 480);

		ikkuna.setScene(nakyma);
		ikkuna.show();

		
	}

}
