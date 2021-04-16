import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class uhhm extends Application {


    @Override
    public void start(Stage primaryStage)  {


        Scene scene = new Scene(new Button("Ok"), 400, 250);
        primaryStage.setTitle("THIS FIRST STAGE MY BITCH YO");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("STAGE NUMBER TWO COMIN ATCHU");
        stage.setScene(new Scene(new Button("NOT OK"), 400, 250));
        stage.show();
    }
}
