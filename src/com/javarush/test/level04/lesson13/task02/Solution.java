package com.javarush.test.level04.lesson13.task02;

import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int m =scanner.nextByte();
        int n= scanner.nextByte();
        String res="";
         for (int i = 0; i < n; i++)
        {
            res=res+8;
        }
        for (int k = 0; k < m; k++)
        {
            System.out.println(res);
        }
    }
}
