package com.javarush.test.level05.lesson12.home01;

/* Три класса
По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

            Cat duck3 = new Cat();
        Cat duck4 = new Cat();
        System.out.println(duck3);
        System.out.println(duck4);

        Dog duck5 = new Dog();
        Dog duck6 = new Dog();
        System.out.println(duck5);
        System.out.println(duck6);

        //напишите тут ваш код
    }

    public static class Duck
    {
        public String toString()
        {
            return "Duck";
        }
    }
    public static class Dog
    {
        public String toString()
        {
            return "Dog";
        }
    }
    public static class Cat
    {
        public String toString()
        {
            return "Cat";
        }
    }


}
