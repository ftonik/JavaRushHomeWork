package com.javarush.test.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String name1=scanner.nextLine();
        int age= Integer.parseInt(scanner.nextLine());
        //напишите тут ваш код
        if (age > 20)
        {
            System.out.println("И 18-ти достаточно");
        }

    }
}
