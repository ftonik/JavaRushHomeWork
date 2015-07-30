package com.javarush.test.level03.lesson08.task05;

/* Чистая любовь
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!
Пример: Вася + Ева + Анжелика = Чистая любовь, да-да!
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {Scanner sc = new Scanner(System.in);//напишите тут ваш код
        String name = sc.nextLine();//напишите тут ваш код
        String name1 = sc.nextLine();//напишите тут ваш код
        String name3 = sc.nextLine();//напишите тут ваш код
        System.out.println(name+" + "+name1+" + "+name3+" = Чистая любовь, да-да!");
        //напишите тут ваш код

    }
}