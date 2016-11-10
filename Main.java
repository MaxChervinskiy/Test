package Chervinskiy.Maxim;

import java.util.Scanner;

/**
 * Created by maxch on 10.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Iactions[]mass = new Iactions[4];
        mass[0]=new Plus();
        mass[1]=new Minus();
        mass[2]=new Multip();
        mass[3]=new Division();
        Integer action = 0;
        System.out.println(mass[action].func(1,2));
        System.out.println(mass[action].func(5.5,6.7));
        System.out.println(mass[action].func("bla","bla"));
        action = 1;
        System.out.println(mass[action].func(5,3));
        System.out.println(mass[action].func(5.2,1.7));
       // System.out.println(mass[action].func("bla","bla"));
        action = 2;
        System.out.println(mass[action].func(2,3));
        System.out.println(mass[action].func(3.4,2.2));
      //  System.out.println(mass[action].func("bla","bla"));
        action = 3;
        System.out.println(mass[action].func(12,3));
        System.out.println(mass[action].func(8.8,2.2));
       // System.out.println(mass[action].func("bla","bla"));
    }
//        System.out.println("rezult is: " + func(4,5,1));
//        System.out.println("rezult is: " + func(4.5,5,2));
//        System.out.println("rezult is: " + func(4.3,5.7,3));
//        System.out.println("rezult is: " + func(4,5.1,0));
//        System.out.println("rezult is: " + func(4,"5",0));
//        System.out.println("rezult is: " + func("7",4,0));
//        System.out.println("rezult is: " + func("8","2",0));
//
//    }
//    public static int func(Integer a,Integer b, Integer action)throws Exception{
//        if (action == 0)
//            return a+b;
//        else if (action == 1)
//            return a-b;
//        else if (action == 2)
//            return a*b;
//        else if (action == 3)
//            return a/b;
//        throw new Exception();
//    }
//    public static double func(Integer a,Double b, Integer action)throws Exception{
//        if (action == 0)
//            return a + b;
//        else if (action == 1)
//            return a-b;
//        else if (action == 2)
//            return a*b;
//        else if (action == 3)
//            return a/b;
//        throw new Exception();
//    }
//    public static double func(Double a,Integer b, Integer action)throws Exception{
//        if (action == 0)
//            return a + b;
//        else if (action == 1)
//            return a-b;
//        else if (action == 2)
//            return a*b;
//        else if (action == 3)
//            return a/b;
//        throw new Exception();
//    } public static double func(Double a,Double b, Integer action)throws Exception{
//        if (action == 0)
//            return a + b;
//        else if (action == 1)
//            return a-b;
//        else if (action == 2)
//            return a*b;
//        else if (action == 3)
//            return a/b;
//        throw new Exception();
//    }
//    public static String func(Integer a,String b, Integer action)throws Exception{
//        if (action == 0)
//            return a + b;
//        throw new Exception();
//    }
//    public static String func(String a,Integer b, Integer action)throws Exception{
//        if (action == 0)
//            return a + b;
//        throw new Exception();
//    }
//    public static String func(String a, String b, Integer action) throws Exception {
//        if (action == 0)
//            return a+b;
//        throw new Exception();
//    }
}
