package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        List<String> towns = new ArrayList<String>();
        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) {
                towns.add("---");
                break;
            }
            towns.add(town);
            addresses.add(family);
        }

        //read home number
        String townForSearch = reader.readLine();

        if (towns.contains(townForSearch)) {
            String familySearch = addresses.get(towns.indexOf(townForSearch));
            System.out.println(familySearch);
        }
    }
}
