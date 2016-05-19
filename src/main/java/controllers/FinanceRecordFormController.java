package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * Created by Aleksandr Kostyukov on 5/19/2016.
 */
public class FinanceRecordFormController{
    @FXML
    private Text actionTarget;

    @FXML
    protected void handleAddFinanceRow(ActionEvent event){
        actionTarget.setText("Adok");
    }


}
