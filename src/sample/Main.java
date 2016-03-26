package sample;

public class Main {

    public static void main(String[] args) {

        System.out.println("********Start***********");

        /**
         * String
         */
        System.out.println("--------1---------");
        String name = "Test";
        System.out.println(name);
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1,3).toLowerCase());

        /**
         * int, Integer
         */
        System.out.println("--------2---------");
        int age = 29;
        System.out.println(age);
        Number ageObj = 29;
        System.out.println(ageObj);
        System.out.println(ageObj.equals(age));//Correct equals primitive and objective variables
        System.out.println(ageObj.floatValue());// test some other methods


        /**
         * double, Double
         */
        System.out.println("--------3---------");


        /**
         * float, Float
         */
        System.out.println("--------4---------");

        /**
         * boolean, Boolean
         */
        System.out.println("--------4---------");



        System.out.println("***********Finish***********");
    }

}
