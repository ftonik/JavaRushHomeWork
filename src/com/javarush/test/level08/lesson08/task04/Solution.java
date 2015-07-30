package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Мразинов", "Вася");
        map.put("Быдлянов", "Петя");
        map.put("Губошлеп", "Катя");
        map.put("Квадратное", "Очко");
        map.put("Васильев", "Вася");
        map.put("Гнидов1", "Валя"); // Эта строка игнорится
        map.put("Гнидов", "Иван");
        map.put("Круглое", "Валя");
        map.put("Тотальный", "Долбоеб");
        map.put("Чмо", "Последнее");
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if (rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }


    }
}