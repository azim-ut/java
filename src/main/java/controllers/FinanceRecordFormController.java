package controllers;

import java.util.HashMap;
import java.util.Map;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * Created by Aleksandr Kostyukov on 5/19/2016.
 */
public class FinanceRecordFormController{
    @FXML
    private TextArea textInput, textResult;

    @FXML
    protected void parseText(ActionEvent event){
        String result = textInput.getText();
        String[] list = result.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Number> wordsMap = new HashMap<String, Number>();

        for (String word : list) {
            if(!wordsMap.containsKey(word)){
                wordsMap.put(word, 0);
            }else{
                wordsMap.put(word, (wordsMap.get(word).intValue() + 1));
            }
        }

        //iterate words map
        for (Map.Entry<String, Number> entry : wordsMap.entrySet()) {
            String key = entry.getKey();
            Number value = entry.getValue();
            System.out.println(key + "-" + value);
        }

        //sort words map by value  - google request - java map comparator


        textResult.setText(stringBuilder.toString());
    }
}
