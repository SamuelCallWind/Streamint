package com.streamint;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamintApplication extends Application {

    @Override
    public void start(Stage stage) {
        Button button = new Button("Click me!");
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.setTitle("Hello world!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
