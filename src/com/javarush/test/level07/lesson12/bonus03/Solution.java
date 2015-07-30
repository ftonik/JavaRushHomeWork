package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
            //шелла
    {int[] resMas=array;
        for (int i = 0; i <resMas.length ; i++) {
            int min=resMas[i];
            int index=i;
            for (int j = i+1; j <resMas.length ; j++) {
                if (resMas[j]>min) {
                    min=resMas[j];
                    index=j;
                }
            }
            if(resMas[i]!=min){
                resMas[index]=resMas[i];
                resMas[i]=min;}
        }
    }
}
