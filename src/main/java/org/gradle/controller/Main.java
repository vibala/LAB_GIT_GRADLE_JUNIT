package org.gradle.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
			
		Pane mainPane=(Pane) FXMLLoader.load(Main.class.getResource("/org/gradle/vue/vue.fxml"));
		primaryStage.setScene(new Scene(mainPane));
			primaryStage.show();
}
	}
