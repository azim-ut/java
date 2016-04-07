package sample.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Aleksandr Kostyukov on 4/7/2016.
 */
public class FileUtils {

    public static String readFileToString(String fileName){

        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(file.exists());
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(file.getPath()), StandardCharsets.UTF_8)){
            String line;
            while((line = reader.readLine()) != null){
                stringBuilder.append(line);
            }
        }catch(IOException e){

        }
        return stringBuilder.toString();
    }
}
