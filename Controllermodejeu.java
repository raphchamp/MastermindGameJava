package mheistermind;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controllermodejeu {
	
	public Stage primaryStage;
	public Stage dialogStage;

	@FXML
	private void handleButtonCouleurFacile() throws Exception {
		
		primaryStage.close();
		Stage dialogStage= new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.initOwner(primaryStage);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("InterfaceCouleurFacile.fxml"));
		AnchorPane Interfacecouleurfacile= (AnchorPane) loader.load();
		Scene scene= new Scene(Interfacecouleurfacile,660,410);
		dialogStage.setScene(scene);
		dialogStage.setTitle("Mastermind");
		dialogStage.showAndWait();
		primaryStage.show();
		
		}
	
	@FXML
	private void handleButtonCouleurDifficile() throws Exception {
		
		primaryStage.close();
		Stage dialogStage= new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.initOwner(primaryStage);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("InterfaceCouleurDifficile.fxml"));
		AnchorPane Interfacecouleurdifficile= (AnchorPane) loader.load();
		Scene scene= new Scene(Interfacecouleurdifficile,670,420);
		dialogStage.setScene(scene);
		dialogStage.setTitle("Mastermind");
		dialogStage.showAndWait();
		primaryStage.show();
		
		}

	
	@FXML
	private void handleButtonDaltonienFacile() throws Exception {
		
		primaryStage.close();
		Stage dialogStage= new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.initOwner(primaryStage);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("InterfaceDaltonienFacile.fxml"));
		AnchorPane Interfacedaltonienfacile= (AnchorPane) loader.load();
		Scene scene= new Scene(Interfacedaltonienfacile,660,400);
		dialogStage.setScene(scene);
		dialogStage.setTitle("Mastermind");
		dialogStage.showAndWait();
		dialogStage.close();
		primaryStage.show();
		}
	
	@FXML
	private void handleButtonDaltonienDifficile() throws Exception {
		
		primaryStage.close();
		Stage dialogStage= new Stage();
		dialogStage.initModality(Modality.WINDOW_MODAL);
		dialogStage.initOwner(primaryStage);
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("InterfaceDaltonienDifficile.fxml"));
		AnchorPane Interfacedaltoniendifficile= (AnchorPane) loader.load();
		Scene scene= new Scene(Interfacedaltoniendifficile,660,380);
		dialogStage.setScene(scene);
		dialogStage.setTitle("Mastermind");
		dialogStage.showAndWait();
		dialogStage.close();
		primaryStage.show();
		}
}
