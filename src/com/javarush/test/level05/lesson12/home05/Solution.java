package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//Напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String s = "";
        while (true)
        {
            s=sc.nextLine();
            if (!s.equals("сумма"))
            {

                int ss = Integer.parseInt(s);
                sum += ss;
            } else break;
        }
        System.out.println(sum);
    }
}
