package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> strings = new ArrayList<String>();
        List<String> strings2 = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            strings.add(scanner.nextLine());
        }
        for (int i = strings.size()-1; i >=0; i--)
        {
            strings2.add(strings.get(i));
        }
        for (Iterator<String> iterator = strings2.iterator(); iterator.hasNext(); )
        {
            String next = iterator.next();
            System.out.println(next);
        }

    }
}
