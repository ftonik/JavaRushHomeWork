package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextByte();
        int n2 = scanner.nextByte();
        int n3 = scanner.nextByte();
        System.out.println(medNumb(n1, n2, n3));
    }

    private static int medNumb(int n1, int n2, int n3)
    {
        if (n1 >n2)
        {
            if (n1 < n3) return n1;
            else return (n2>n3) ? n2:n3;

        }else if (n1>n3)return n1;
        else return (n2>n3) ? n3:n2;
    }
}
