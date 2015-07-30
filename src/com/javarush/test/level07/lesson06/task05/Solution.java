package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) list.add(scanner.nextLine());
        for (int j = 0; j < 13; j++)
        {   int num  = list.size()-1;
            String temp = list.get(num);
            list.remove(num);
            list.add(0,temp);
        }
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); )
        {
            String next = iterator.next();
            System.out.println(next);
        }


    }
}
