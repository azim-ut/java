package pane;

import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

/**
 * Created by Aleksandr Kostyukov on 3/16/2016.
 */

public class AuthorisationStackPane extends StackPane {
    public AuthorisationStackPane() {
        super();

        Button button = new Button();
        button.setText("Are you developer?");

        this.getChildren().add(button);
    }

}
