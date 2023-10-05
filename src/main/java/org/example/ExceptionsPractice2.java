package org.example;

public class ExceptionsPractice2 {
    public static void main(String[] args) throws InterruptedException, ArithmeticException {
        pause(650);
        arithmeticException(9,0);
    }

    public static void arithmeticException(int numDivided, int numDivider) throws ArithmeticException {
        int res = numDivided/numDivider;
        System.out.println("Res: " + res);
    }

    public static void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }
}
