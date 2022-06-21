package ru.gazprombank.educate.homework26;

public class Homework {
    public static void main(String[] args) throws CatFoundNoOne, CollapseOfUniverse, IllegalArgumentException {
        Cat cat1 = new Cat();
        Cat cat3 = new Cat();
        Cat cat2 = new Cat("Мурка", 25, 1.3);
        Cat cat4 = new Cat("Ивка", 15, 15.9);

        System.out.println(cat4.stronger(cat2));
    }
}