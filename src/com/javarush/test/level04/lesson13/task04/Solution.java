package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int n=8;
        String result="";
        for (int i = 0; i <10; i++)
        {
            result=result+n;
        }
        System.out.println(result);
        for (int k = 0; k < 10; k++)
        {
            System.out.println(n);
        }
    }
}
