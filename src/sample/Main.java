package sample;

import com.google.gson.Gson;
import sample.bins.Advert;
import sample.utils.FileUtils;

public class Main {

    public static Gson gson = new Gson();

    public static void main(String[] args) {
        Advert adv = new Advert();
        adv.setTitle("Need worker");
        adv.setText("Work description");

        String fileName = "data/test.txt";
        String data = gson.toJson(adv);
        FileUtils.write(fileName, data);

        //JSON
        String fileData = FileUtils.readFileToString(fileName);
        Advert stored = gson.fromJson(fileData, Advert.class);


        System.out.println(fileData);
    }

}