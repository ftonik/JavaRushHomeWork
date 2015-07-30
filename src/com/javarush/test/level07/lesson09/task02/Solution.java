package com.javarush.test.level07.lesson09.task02;

import java.util.ArrayList;
import java.util.Scanner;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            stringArrayList.add(scanner.nextLine());
        }

        for (int j = stringArrayList.size() - 1; j >= 0; j--)
        {
            System.out.println(stringArrayList.get(j));
        }

    }
}
