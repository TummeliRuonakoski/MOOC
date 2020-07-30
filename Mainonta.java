package Mainonta;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Mainonta extends Application{

	public static void main(String[] args) {
		launch(Mainonta.class);

	}

	@Override
	public void start(Stage ikkuna) throws Exception {

		CategoryAxis xAkseli = new CategoryAxis();

		NumberAxis yAkseli = new NumberAxis();

		BarChart<String, Number> pylvaskaavio = new BarChart<>(xAkseli, yAkseli);

		pylvaskaavio.setTitle("Liittymän nopeus");
		pylvaskaavio.setLegendVisible(false);

		XYChart.Series asukasluvut = new XYChart.Series();
		asukasluvut.getData().add(new XYChart.Data("NDA", 9801616));
		asukasluvut.getData().add(new XYChart.Data("Tomera", 5678348));
		asukasluvut.getData().add(new XYChart.Data("Liisa", 5483533));
		asukasluvut.getData().add(new XYChart.Data("Ratiolinja", 5165800));

		pylvaskaavio.getData().add(asukasluvut);
		Scene nakyma = new Scene(pylvaskaavio, 640, 480);

		ikkuna.setScene(nakyma);
		ikkuna.show();

	}

}
