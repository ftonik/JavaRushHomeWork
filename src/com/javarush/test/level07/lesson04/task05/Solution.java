package com.javarush.test.level07.lesson04.task05;

import java.util.Scanner;/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] ints = new int[20];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ints.length; i++)
        {
            ints[i]= Integer.parseInt(scanner.nextLine());
        }
        int[] ints1 = new int[10];
        int[] ints2 = new int[10];
        for (int j = 0; j < ints.length; )
        {

            for (int re = 0; re < ints1.length; re++)
            {   int large1=ints[j];
                ints1[re]=large1;
                j++;

            }
            for (int qw = 0; qw < ints2.length; qw++)
            {   int large2=ints[j];
                ints2[qw]=large2;
                j++;

            }
        }
        for (int m = 0; m < ints2.length; m++)
        {
            int i = ints2[m];
            System.out.println(i);
        }


    }
}
