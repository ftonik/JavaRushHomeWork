package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man = new Man("Jo", "dsadas", 24); //создай по два объекта каждого класса тут
        Woman woman = new Woman("Alice", "dfsfd", 22);
        System.out.println(man.toString());
        System.out.println(woman.toString());

        //выведи их на экран тут
    }

    public static class Man{
        String name,address;
        int age;

        public Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        String name,address;
        int age;

        public Woman(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }//добавьте тут ваши классы
}
