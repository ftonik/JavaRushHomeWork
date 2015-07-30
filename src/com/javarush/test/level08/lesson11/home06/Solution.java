package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> future = new ArrayList<Human>();
        ArrayList<Human> children11 = new ArrayList<Human>();
        ArrayList<Human> children22 = new ArrayList<Human>();
        ArrayList<Human> grandchildren = new ArrayList<Human>();
        Human grandmother1 = new Human("Катя", false, 78, children11);
        Human grandmother2 = new Human("Аня", false, 75, children22);
        Human grandfather1 = new Human("Коля", true, 75, children11);
        Human grandfather2 = new Human("Петя", true, 75, children22);
        Human father1 = new Human("Саша", true, 41, grandchildren);
        Human mother1 = new Human("Вика", false, 39, grandchildren);
        Human children1 = new Human("Аня", false, 12,future);
        Human children2 = new Human("Митя", true, 6,future);
        Human children3 = new Human("Костя", true, 17,future);
        grandchildren.add(children1);
        grandchildren.add(children2);
        grandchildren.add(children3);
        children11.add(father1);
        children22.add(mother1);
        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father1);
        System.out.println(mother1);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
