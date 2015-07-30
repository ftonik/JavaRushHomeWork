package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 13, 18);
        Dog gdog = new Dog("Archi", 12, 22);
        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    public static class  Dog{
        String name;
        int strange;
        int height;

        public Dog(String name, int strenge, int height)
        {
            this.name = name;
            this.strange = strenge;
            this.height = height;
        }
    }
    public static class  Cat{
        String name;
        int strange;
        int height;

        public Cat(String name, int strange, int height)
        {
            this.name = name;
            this.strange = strange;
            this.height = height;
        }
    }

    //добавьте тут ваши классы

}
