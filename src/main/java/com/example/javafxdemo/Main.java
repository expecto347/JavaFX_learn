package com.example.javafxdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 1920, 1080, Color.WHITE);
        Stage stage = new Stage();

        stage.setTitle("Title");
        stage.setScene(scene);
        stage.setWidth(1080);
        stage.setHeight(720);
        stage.setResizable(false);
        stage.setFullScreen(true);

        Text text = new Text();
        text.setText("Hello World!");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Verdana", 100));
        text.setFill(Color.BLACK);

        Line line = new Line();
        line.setStartX(100);
        line.setStartY(200);
        line.setEndX(1000);
        line.setEndY(200);

        Rectangle  rectangle = new Rectangle();
        rectangle.setX(300);
        rectangle.setY(300);

        Image image = new Image("file:pizza.jpeg");
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(200);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(imageView);
        stage.setFullScreenExitHint("YOU CAN NOT ESCAPE UNLESS YOU PRESS Q!");
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
