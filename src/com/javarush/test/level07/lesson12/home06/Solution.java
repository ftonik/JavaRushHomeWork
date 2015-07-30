package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandmother1=new Human("Катя",false,78);
        Human grandmother2=new Human("Аня",false,75);
        Human grandfather1=new Human("Коля",true,75);
        Human grandfather2=new Human("Петя",true,75);
        Human father1=new Human("Саша",true,41,grandfather1,grandmother1);
        Human mother1=new Human("Вика",false,39,grandfather2,grandmother2);
        Human children1=new Human("Аня",false,12,father1,mother1);
        Human children2=new Human("Митя",true,6,father1,mother1);
        Human children3=new Human("Костя",true,17,father1,mother1);
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father1.toString());
        System.out.println(mother1.toString());
        System.out.println(children1.toString());
        System.out.println(children2.toString());
        System.out.println(children3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
