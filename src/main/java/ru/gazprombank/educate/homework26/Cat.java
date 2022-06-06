package ru.gazprombank.educate.homework26;

public class Cat {
    private final String name;
    private final int age;
    private final double weight;

    public Cat() {
        name = "Кот Шрёдингера";
        age = 5;
        weight = 12.4;
    }

    public Cat(String name, int age, double weight) throws IllegalArgumentException, CollapseOfUniverse {
        if (name == null || name.equals(""))
            throw new IllegalArgumentException();
        else
            this.name = name;

        if (name.equals("Кот Шрёдингера"))
            throw new CollapseOfUniverse();

        if (age >= 1 && age <= 18)
            this.age = age;
        else
            throw new IllegalArgumentException();
        if (weight > 0.1 && weight <= 16)
            this.weight = weight;
        else
            throw new IllegalArgumentException();
    }
    public Integer getAge() {

        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean stronger(Cat cat) throws CollapseOfUniverse, CatFoundNoOne {
        if (cat == null)
            throw new CatFoundNoOne();
        if (this.name.equals("Кот Шрёдингера")){
        if (cat.name.equals("Кот Шрёдингера"))
            throw new CollapseOfUniverse();
        else
            return true;
        }
        if (cat == this)
            return false;
        double Cat_1= this.age*this.weight;
        double Cat_2=cat.age*cat.weight;

        if (Cat_1>Cat_2)
            return true;
        else if (Cat_1 == Cat_2)
            return false;
        else
            return false;
    }
}
