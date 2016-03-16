package scene;

import javafx.beans.NamedArg;
import javafx.scene.Parent;
import javafx.scene.Scene;
import pane.AuthorisationStackPane;

/**
 * Created by Aleksandr Kostyukov on 3/16/2016.
 */
public class AuthorisationScene extends Scene {

    public AuthorisationScene(@NamedArg("root") Parent root) {
        super(root);

        new AuthorisationStackPane();

    }
}
