package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1= Integer.parseInt(scanner.nextLine());
        int n2= Integer.parseInt(scanner.nextLine());
        int n3= Integer.parseInt(scanner.nextLine());
        int n4= Integer.parseInt(scanner.nextLine());
        System.out.println(max(n1, n2, n3, n4));
    }

    private static int max(int n1, int n2, int n3, int n4)
    {

        return max(n1, n2)>max(n3,n4)? max(n1, n2):max(n3,n4);
    }

    private static int max(int n1, int n2)
    {
        return n1>n2 ? n1 :n2;
    }
}
