import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class uh extends Application {
    @Override
    public void start(Stage primaryStage){
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK,200,250);
        primaryStage.setTitle("My Java FX");
        primaryStage.setScene(scene);
        primaryStage.show();

        //new stage
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
