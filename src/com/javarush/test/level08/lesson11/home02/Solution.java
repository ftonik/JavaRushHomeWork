package com.javarush.test.level08.lesson11.home02;

import java.util.*;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> resultDog = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            resultDog.add(new Dog());
        }
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet pets = new HashSet();
        for (Iterator<Cat> iterator = cats.iterator(); iterator.hasNext(); ) {
            Cat next = iterator.next();
            pets.add(next);
        }
        for (Iterator<Dog> iterator = dogs.iterator(); iterator.hasNext(); ) {
            Dog dog = iterator.next();
            pets.add(dog);
        }
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        Iterator it = pets.iterator();
        while (it.hasNext()) {
            Object pet = it.next();
            System.out.println(pet);
        }
    }

    public static class Cat {
    }

    public static class Dog {
    }

    //напишите тут ваш код
}
