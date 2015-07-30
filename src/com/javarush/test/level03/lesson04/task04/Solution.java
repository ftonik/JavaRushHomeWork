package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int[] cifr=new int[10];
        for (int i=0; i<cifr.length; i++){
            cifr[i]=i+1;
        }
        int result=1;
        for (int k : cifr)
        {

            result=result*k;
        }
        System.out.println(result);
    }
}