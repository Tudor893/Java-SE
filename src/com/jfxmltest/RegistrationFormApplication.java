package com.jfxmltest;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class RegistrationFormApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	FXMLLoader loader = new FXMLLoader();

    	
    	FileInputStream fxmlStream = new FileInputStream("registration_form.fxml");
    	Parent root = loader.load(fxmlStream);
    	primaryStage.setTitle("Registration Form FXML Application");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
