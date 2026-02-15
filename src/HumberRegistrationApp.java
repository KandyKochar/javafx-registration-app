package ModernWeb;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HumberRegistrationApp extends Application {
	@Override// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(20, 20, 20, 20));
		pane.setHgap(10);
		pane.setVgap(10);

		//  background styling
		pane.setStyle("-fx-background-color: #ffe6f0;");

		// Labels
		Label lblName = new Label("Name:");
		lblName.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #cc0066;");

		Label lblEmail = new Label("Email:");
		lblEmail.setStyle("-fx-font-size: 14px; -fx-font-weight: bold; -fx-text-fill: #cc0066;");

		// text fields + styling
		TextField txtName = new TextField();
		txtName.setPrefWidth(250);
		txtName.setPrefHeight(35);
		txtName.setStyle("-fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #ff99cc;");

		TextField txtEmail = new TextField();
		txtEmail.setPrefWidth(250);
		txtEmail.setPrefHeight(35);
		txtEmail.setStyle("-fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #ff99cc;");

		// Add to pane
		pane.add(lblName, 0, 0);
		pane.add(txtName, 1, 0);
		pane.add(lblEmail, 0, 2);
		pane.add(txtEmail, 1, 2);

		// Submit button styling
		Button btAdd = new Button("Submit");
		btAdd.setPrefWidth(120);
		btAdd.setPrefHeight(35);
		btAdd.setStyle(
			"-fx-background-color: #ff66b2; " +
			"-fx-text-fill: white; " +
			"-fx-font-weight: bold; " +
			"-fx-background-radius: 20;"
		);

		pane.add(btAdd, 1, 3);
		GridPane.setHalignment(btAdd, HPos.LEFT);

		// Scene
		Scene scene = new Scene(pane, 420, 260); // window size 
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
