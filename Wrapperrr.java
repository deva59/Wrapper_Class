package Wrapper_Class;

import java.util.ArrayList;

public class Wrapperrr {
    public static void main(String[] args) {

       // There are Some Types to Way of Write Wrapper Class
        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf("12");

        Boolean myBoolean = Boolean.valueOf("false");

        System.out.println(obj2*4);

        Integer obj3 = 12; //This is Called Autoboxing

        int age = obj2;//This is Called Unboxing.


        System.out.println(age);

        ArrayList<Integer> aa = new ArrayList<>();
    }
}
