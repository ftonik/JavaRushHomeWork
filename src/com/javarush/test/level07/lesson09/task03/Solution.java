package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;
import java.util.Iterator;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("мама");
        stringArrayList.add("мыла");
        stringArrayList.add("раму");
        stringArrayList.add(1,"именно");
        stringArrayList.add(3,"именно");
        stringArrayList.add(5, "именно");
        for (Iterator<String> iterator = stringArrayList.iterator(); iterator.hasNext(); )
        {
            String next = iterator.next();
            System.out.println(next);
        }
    }

}
