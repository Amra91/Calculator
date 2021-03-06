package calculatorApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application{

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Operations.fxml"));
		BorderPane mainLayout = loader.load();
		Scene scene = new Scene (mainLayout);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	


	public static void main(String[] args) {
		Application.launch(args);
	}
}
