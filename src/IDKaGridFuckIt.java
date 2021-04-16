import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class IDKaGridFuckIt extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10,10));


        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        //samestuff
        circle.setRadius(50);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setFill(Color.WHITE);

        pane.add(circle, 0,0);

        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        //samestuff
        circle1.setRadius(50);
        circle1.setStroke(Color.PLUM);
        circle1.setFill(Color.WHITE);

        pane.add(circle1, 1,1);

        Circle circle2 = new Circle();
        circle2.setCenterX(100);
        circle2.setCenterY(100);
        //samestuff
        circle2.setRadius(50);
        circle2.setStroke(Color.POWDERBLUE);
        circle2.setFill(Color.WHITE);

        pane.add(circle2, 2,2);



        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();






    }
}
