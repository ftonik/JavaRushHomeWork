package com.javarush.test;

public class ExceptionExample {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() {
        method2();

    }

    public static void method2() {
        method3();

    }

    private static void method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}
