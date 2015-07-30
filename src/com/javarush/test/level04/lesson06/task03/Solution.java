package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1= Integer.parseInt(scanner.nextLine());
        int n2= Integer.parseInt(scanner.nextLine());
        int n3= Integer.parseInt(scanner.nextLine());//напишите тут ваш код
        int[] a = {n1, n2, n3};
        sort(a);
        for (int qrw : a)
        {
            System.out.println(qrw);
        }
    }

    private static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++){

            for (int j = i+1; j < arr.length; j++)
            {
                if (arr[j] > arr[i])
                {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
