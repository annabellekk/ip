package Dawn.Gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserInterface extends Application {
    private Dawn.Dawn dawn = new Dawn.Dawn();

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(UserInterface.class.getResource("/view/MainWindow.fxml"));
            AnchorPane ap = fxmlLoader.load();
            Scene scene = new Scene(ap);
            stage.setScene(scene);
            stage.setMinHeight(650);
            stage.setMinWidth(400);
            fxmlLoader.<MainWindow>getController().setDawn(dawn);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
