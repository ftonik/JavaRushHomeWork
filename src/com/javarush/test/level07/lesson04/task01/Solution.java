package com.javarush.test.level07.lesson04.task01;

import java.io.IOException;
import java.util.Scanner;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        return arr;
    }

    public static int max(int[] array)
    {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
        {
            int i1 = array[i];
        if (i1>max)max=i1;

        }

        return max;
    }


}

