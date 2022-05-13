package ru.gazprombank.educate.homework26;

public class Homework {
    public static void main(String[] args) throws CatFoundNoOne {
        Cat cat1 = new Cat();
        Cat cat3 = new Cat();
        Cat cat2 = new Cat("Kot", 4, 4.3);
//        Cat cat4 = new Cat("Кот Шрёдингера", 10, 9.9);
        Cat cat4 = new Cat("afasf", 10, 9.9);

        System.out.println(cat4.stronger(cat2));
    }
}
