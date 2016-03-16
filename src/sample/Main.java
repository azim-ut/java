package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pane.AuthorisationStackPane;

public class Main extends Application {
    private Scene authorisationScene;
    private Parent root;

    @Override public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(getAuthorisationScene());
        primaryStage.show();
    }

    private Scene getAuthorisationScene() {
        if (authorisationScene == null) {
            authorisationScene = new Scene(new AuthorisationStackPane(), 300, 250);
        }
        return authorisationScene;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
