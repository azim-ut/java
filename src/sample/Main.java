package sample;

import sample.test.VariableTypesTest;
import sample.utils.FileUtils;

public class Main {

    public static void main(String[] args) {

        String fileData = FileUtils.readFileToString("data/config_slip_express_log.js");
        System.out.println("My files data: "+fileData);


        System.out.println("********Start***********");

        VariableTypesTest test = new VariableTypesTest();
        test.outStringMethods();
        test.outIntegerMethods();
        test.outDoubleMethods();
        test.outFloatMethods();
        test.outLongMethods();
        test.outBooleanMethods();



        System.out.println("***********Finish***********");
    }

}