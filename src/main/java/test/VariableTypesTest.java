package test;

/**
 * Created by Aleksandr Kostyukov on 4/7/2016.
 */
public class VariableTypesTest {
    public void outStringMethods(){
        /**
         * String
         */
        System.out.println("--------1---------");
        String name = "Test";
        System.out.println(name);
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(1,3).toLowerCase());
        System.out.println(name.toUpperCase());//Добавил. This method converts all of the characters in this String to upper case using the rules of the default locale.
    }

    public void outFloatMethods(){
        System.out.println("--------4---------");
        float rate = 18.4f;
        Float rateObj = 15f;
        Float rateObj2 = 16.4f;
        System.out.println(rateObj);
        //Метод "int compareTo(Float anotherFloat)". This method compares two Float objects numerically.
        int y =  rateObj.compareTo(rateObj2);
        if(y > 0) {
            System.out.println("obj1 is greater than obj2");
        }
        else if(y < 0) {
            System.out.println("obj1 is less than obj2");
        }
        else {
            System.out.println("obj1 is equal to obj2");
        }
        //И еще пример с float (static float parseFloat(String s))
        String str1 = "30";
        float retval1 = rateObj.parseFloat(str1);
        System.out.println("Значение = " + retval1);
    }

    public void outLongMethods(){
        System.out.println("--------5---------");
        long hair = 150000;
        Long hairObj = new Long (151);
        System.out.println(hairObj);
        //Метод "static long rotateLeft(long i, int distance)"
        /*This method returns the value obtained by rotating the two's complement binary representation
        of the specified long value left by the specified number of bits.*/
        for(int i = 0; i < 4; i++) {
            hairObj = Long.rotateLeft(hairObj, 4);
            System.out.println(hairObj);

            //Метод "static String toOctalString(long i)" This method returns a string representation of the long argument as an unsigned integer in base 8.
            System.out.println("Number = " + hairObj);
            System.out.println("Octal = " + Long.toOctalString(hairObj));
        }
    }

    public void outBooleanMethods(){

        System.out.println("--------6---------");
        //Метод "static String toString(boolean b)". This method returns a String object representing the specified boolean.
        boolean bool1, bool2;
        bool1 = true;
        bool2 = false;
        String s1, s2;
        s1 = Boolean.toString(bool1);
        s2 = Boolean.toString(bool2);
        String str10 = "String value of boolean primitive " +bool1+ " is "  +s1;
        String str20 = "String value of boolean primitive " +bool2+ " is "  +s2;
        System.out.println( str10 );
        System.out.println( str20 );
        // пример другого метода. This method returns true if and only if the system property named by the argument exists and is equal to the string "true".
        Boolean b1, b2;
        b1 = new Boolean(true);
        b2 = new Boolean(false);
        int res;
        res = b1.compareTo(b2);
        String str15 = "Оба значения равны ";
        String str16 = "Значение объекта правдиво";
        String str17 = "Значение аргумента правдиво";
        if( res == 0 ){
            System.out.println( str15 );
        }
        else if( res > 0 ){
            System.out.println( str16 );
        }
        else if( res < 0 ){
            System.out.println( str17 );
        }
    }



    public void outDoubleMethods(){
        System.out.println("--------3---------");
        double money = 6.9;
        Double moneyObj = 7.5;
        System.out.println(moneyObj);
        //Метод "int hashCode()". This method returns a hash code for this Double object.
        int retval = moneyObj.hashCode();
        System.out.println("Хэш = " + retval);
        //Метод "static Double valueOf(String s)". This method returns a Double object holding the double value represented by the argument string s.
        String str = "65";
        System.out.println("Значение = " +  moneyObj.valueOf(str));
    }

    public void outIntegerMethods(){
        System.out.println("--------2---------");
        int age = 29;
        System.out.println(age);
        Number ageObj = 29;
        System.out.println(ageObj);
        System.out.println(ageObj.equals(age));//Correct equals primitive and objective variables
        System.out.println(ageObj.floatValue());//Добавил коммент по методу. This method returns the value of this Integer as a float.
        //Метод "static int	bitCount(int i)"
        System.out.println("Бинарный код = " + Integer.toBinaryString(age));
        System.out.println("Число единичек в бинарном коде = " + Integer.bitCount(age));
    }
}
