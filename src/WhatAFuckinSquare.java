import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import  javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class WhatAFuckinSquare extends Application {

    @Override
    public void start(Stage primaryStage) {

       Rectangle r1 = new Rectangle(25,10,60,30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);

    }

    Scene scene = new Scene(new BorderPane());

}
