package com.javarush.test.level08.lesson11.home04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (Integer integer : array) {
            min=(min>integer)?integer:min;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> integers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            integers.add(Integer.valueOf(scanner.nextLine()));
        }
        return integers;
    }
}
