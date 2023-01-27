package ru.gazprombank.educate.homework26;

public class Homework extends Cat{
    public Homework(String name, int age, double weight) throws CollapseOfUniverse {
        super(name, age, weight);
    }

    public  void main(String[] args) throws CollapseOfUniverse, CatFoundNoOne {

        Cat justcat = new Cat("uoyo",13,2);
      //  Cat shred = new Cat();
        stronger(justcat);
    }
}
