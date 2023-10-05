package org.example;

public class ExceptionsPractice {
    public static void main(String[] args) {
        pause(650);
        arithmeticException(9,0);

    }

    public static void arithmeticException(int numDivided, int numDivider) {
        try {
            int res = numDivided/numDivider;
            System.out.println("Res: " + res);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally {
            System.out.println("finally arithmeticException");
        }
    }

    public static void pause(int time) {
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally pause");
        }
    }
}
