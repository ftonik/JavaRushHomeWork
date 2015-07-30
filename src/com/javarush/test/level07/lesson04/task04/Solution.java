package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] ints = new int[11];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 11; i++)
        {
            ints[i]= Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < ints.length/2; i++)
        {
            int temp = ints[i];
            int temp2=ints[(ints.length-1)-i];
            ints[i]=temp2;
            ints[(ints.length-1)-i]=temp;
        }

        for (int j = 0; j < ints.length; j++)
        {
            int anInt = ints[j];
            System.out.println(anInt);
        }

    }
}
