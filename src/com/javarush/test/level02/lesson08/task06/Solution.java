package com.javarush.test.level02.lesson08.task06;

/* Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
*/
public class Solution
{
    public static void print3(String s)
    {

          System.out.print(s.trim() + " ");
        System.out.print(s.trim() + " ");
        System.out.println(s.trim());

        //напишите тут ваш код

    }
    public static void main(String[] args)
    {
        print3("window");
        print3(" file");
    }
}