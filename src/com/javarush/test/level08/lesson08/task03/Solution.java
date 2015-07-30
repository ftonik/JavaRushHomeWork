package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(),"Валя"));
        System.out.println(getCountTheSameLastName(createMap(), "Мразинов"));
    }
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
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

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int getCountTheSameFirstName = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name))
            {
                getCountTheSameFirstName++;
            }
        }
        return getCountTheSameFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int getCountTheSameLastName = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(familiya))
            {
                getCountTheSameLastName++;
            }
        }
        return getCountTheSameLastName;
    }
}
