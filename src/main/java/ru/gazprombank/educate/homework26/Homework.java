package ru.gazprombank.educate.homework26;

public class Homework {
    public static void main(String[] args) throws CatFoundNoOne, IllegalAccessError, CollapseOfUniverse {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("cat2", 8, 7.2);
        Cat cat3= new Cat("cat3", 14, 10.9);

        System.out.println(cat3.stronger(cat1));
    }
}
