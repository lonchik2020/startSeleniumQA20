package oop;

public class CastingBaseExample {

    public static void main(String[] args) {
        Integer i = 77;
        System.out.println(i.getClass());//class java.lang.Integer
        String istr = String.valueOf(i);//casting of int to string!!!
        System.out.println(istr.getClass());//class java.lang.String
        System.out.println(i+10); //87
        System.out.println(istr+10);//7710
        Integer j = Integer.parseInt(istr);//casting os string to int!!!
        System.out.println(j+i); //casting of string to int--> 77+77=154

    }
}
