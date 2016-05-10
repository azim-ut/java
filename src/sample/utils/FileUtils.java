package sample.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Aleksandr Kostyukov on 4/7/2016.
 */
public class FileUtils {


    public static String getGreetingsStr(){
        return "----------------- Lets do something!";
    }

    public static String getFinishStr(){
        return "----------------- We have done!";
    }

    public static boolean isFileExists(String filePath){
        File file = new File(filePath);
        return file.exists();
    }


    public static String readFileToString(String fileName){

        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(file.getPath()), StandardCharsets.UTF_8)){
            String line;
            while((line = reader.readLine()) != null){
                stringBuilder.append(line);
            }
        }catch(IOException e){

        }
        return stringBuilder.toString();
    }

    /*public static void writeStringToFile (File file,String data,boolean append);
    String string = "This is\na new test";
    File file = new File("test.txt");
    FileUtils.writeStringToFile(file, string);*/

    public static void write(String fileName, String text) {
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(text);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


}
