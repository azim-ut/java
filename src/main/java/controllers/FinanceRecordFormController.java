package controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        final Map<String, Number> wordsMap = new HashMap<String, Number>();

        for (String word : list) {
            if(!wordsMap.containsKey(word)){
                wordsMap.put(word, 0);
            }else{
                wordsMap.put(word, (wordsMap.get(word).intValue() + 1));
            }
        }

        //sort words map by value  - google request - java map comparator
        LinkedHashMap<String, Number> sorted = new LinkedHashMap<String, Number>();
        List<String> words = Arrays.asList(wordsMap.keySet().toArray(new String[wordsMap.size()]));
        words.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return wordsMap.get(o2).toString().compareTo(wordsMap.get(o1).toString());
            }
        });

        for (String word : words) {
            sorted.put(word, wordsMap.get(word));
        }

        //iterate words map
        for (Map.Entry<String, Number> entry : sorted.entrySet()) {
            String key = entry.getKey();
            Number value = entry.getValue();
            stringBuilder.append(key + "-" + value);
            stringBuilder.append("\r\n");
        }

        textResult.setText(stringBuilder.toString());
    }
}
