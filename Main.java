package mheistermind;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Mastermind");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("Interfaceaccueil.fxml"));
		AnchorPane root= (AnchorPane) loader.load();
		Controllermodejeu controller=loader.getController();
		controller.primaryStage=primaryStage;
		Scene scene= new Scene(root,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}
