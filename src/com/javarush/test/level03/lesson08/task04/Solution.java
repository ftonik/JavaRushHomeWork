package com.javarush.test.level03.lesson08.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);//напишите тут ваш код
        String name = sc.nextLine();//напишите тут ваш код
        String name1 = sc.nextLine();//напишите тут ваш код
        System.out.println(name+" проспонсировал "+name1+", и она стала известной певицей.");
    }
}