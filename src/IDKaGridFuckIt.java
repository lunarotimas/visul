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
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.awt.*;

public class IDKaGridFuckIt extends Application {
    @Override
    public void start(Stage primaryStage) {

        //create a pane and set its properties
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(10, 10, 10,10));

        //Create blue rectangle
        Rectangle square = new Rectangle(0,0,85,85);
        square.setStroke(Color.BLUE);
        square.setFill(Color.BLUE);

        //position rectangle in top left of the grid
        pane.add(square, 0,0);

        //create red circle
        Circle circle1 = new Circle();
        circle1.setCenterX(100);
        circle1.setCenterY(100);
        circle1.setRadius(50);
        circle1.setStroke(Color.RED);
        circle1.setFill(Color.RED);

        //position circle in center
        pane.add(circle1, 1,1);

        //adding this here now incase I forget, but I struggled a TON with the cross and I don't know if I'm stupid, or what but
        //collaboration https://www.youtube.com/watch?v=7nlU3_kEjTE

        //calling the LinePane method and positioning it bottom right
        pane.add(new Cross(), 2,2);

        //Creating a scene and placing it on the stage
        Scene scene = new Scene(pane, 350, 350);
        primaryStage.setTitle("123 colours and shapes"); //set title
        primaryStage.setScene(scene); //place scene in stage
        primaryStage.show(); //display stage


    }
}

//class to make a constructor method making a cross
class Cross extends Pane
{
    public Cross() {

        Line line = new Line(10, 40, 90, 40);
        line.setStroke(Color.GREEN);
        line.setStrokeWidth(8);


        Line line2 = new Line(50, 0, 50, 115);
        line2.setStroke(Color.GREEN);
        line2.setStrokeWidth(8);

        getChildren().add(line);
        getChildren().add(line2);
    }}
