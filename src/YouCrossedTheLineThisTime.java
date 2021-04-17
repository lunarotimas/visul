import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class YouCrossedTheLineThisTime extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600);
        Stage stage = new Stage();

        Line line = new Line(100,50,200,50);
        line.setStroke(Color.GREEN);
        line.setStrokeWidth(5);


        Line line2 = new Line(150,0,150,150);
        line2.setStroke(Color.GREEN);
        line2.setStrokeWidth(5);

        root.getChildren().add(line);
        root.getChildren().add(line2);


        stage.setScene(scene);
        stage.show();
    }
}
