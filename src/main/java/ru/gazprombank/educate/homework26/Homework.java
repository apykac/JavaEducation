package ru.gazprombank.educate.homework26;

public class Homework {
    public static void main(String[] args) throws CatFoundNoOne, CollapseOfUniverse, IllegalArgumentException {
        Cat cat_1 = new Cat();
        Cat cat_2 = new Cat("Cat_2", 2, 10.0);
        Cat cat3 = new Cat("Cat_3", 1, 5.0);
        Cat cat_4 = new Cat("Kot_Shrodengera", 10, 19.0);
        Cat cat_5 = new Cat("Cat_5", 7, 25.0);

        System.out.println(cat_5.stronger(cat_2));

    }
}
