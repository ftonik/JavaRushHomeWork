package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<String,String> map=createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair3 : map.entrySet()) {
            System.out.println(pair3.getValue());
        }

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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        Set<String> setNames = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();

        for ( Map.Entry<String, String> pair : map.entrySet() )
        {
            String name = pair.getValue();

            if ( setNames.contains( name ) )
            {
                duplicateNames.add( name );
            }
            else
            {
                setNames.add( name );
            }
        }

        for ( String name : duplicateNames )
        {
            removeItemFromMapByValue( map, name );
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
