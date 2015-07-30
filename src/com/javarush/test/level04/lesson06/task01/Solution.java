package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1= Integer.parseInt(scanner.nextLine());
        int n2= Integer.parseInt(scanner.nextLine());
        System.out.println(min(n1, n2));
    }

    private static int min(int n1, int n2)
    {
        return n1<n2 ? n1:n2;
    }
}