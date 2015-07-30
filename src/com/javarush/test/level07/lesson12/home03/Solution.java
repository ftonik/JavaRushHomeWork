package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] mass = new int[20];
        for (int i = 0; i < 20; i++)
        {
            mass[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = mass[0];
        int minimum = mass[0];
        for (int next : mass)
        {
            if (next > maximum)
                maximum = next;
            if (next < minimum)
                minimum = next;

        }


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
