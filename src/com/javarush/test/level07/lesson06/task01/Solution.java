package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<String> strings = new ArrayList<String>();
        strings.add("dasd");
        strings.add("dasd2");
        strings.add("dasd3");
        strings.add("dasd4");
        strings.add("dasd5");
        System.out.println(strings.size());
        for (Iterator<String> iterator = strings.iterator(); iterator.hasNext(); )
        {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
