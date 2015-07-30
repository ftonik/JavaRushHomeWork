package com.javarush.test.level07.lesson09.task01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<Integer> beforeList = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
            beforeList.add(Integer.valueOf(scanner.nextLine()));

        for (Iterator<Integer> iterator = beforeList.iterator(); iterator.hasNext(); )
        {
            Integer nextInt =  iterator.next();
            if (nextInt % 3 == 0) three.add(nextInt);
            if (nextInt %2 ==0) two.add(nextInt);
            if(!three.contains(nextInt) && !two.contains(nextInt)) other.add(nextInt);

        }
        printList(three);
        printList(two);
        printList(other);

    }

    public static void printList(List<Integer> list)
    {
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); )
        {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
