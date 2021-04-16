import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import sun.swing.CachedPainter;

//now we're gonna have the circle fixed in the center
public class makinCircles extends Application {
    @Override
    public void start(Stage primaryStage) {

        //creating PAIN FOR ALL THE NATIONS
        //moved higher because we're using it higher now
        Pane pane = new Pane();

        //creating a circle
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        //samestuff
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        pane.getChildren().add(circle);

        //creating a SCENE IN THE MIDDLE OF THE STAGE D=<
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("I LIKE CIRCLES THAT'S WHY I HULAHOOP: ISOLATION EDITION");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }




}
