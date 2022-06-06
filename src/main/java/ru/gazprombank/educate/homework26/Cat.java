package ru.gazprombank.educate.homework26;

import java.util.Objects;

public class Cat {
    private final String name;
    private final int age;
    private final double weight;

    Cat() {
        name = "Кот Шрёдингера";
        age = 10;
        weight = 10.1;
    }

    Cat(String name, int age, double weight) throws CollapseOfUniverse {
        if (Objects.equals(name, "") || name == null) {
            throw new IllegalArgumentException("");
        } else if (name.equals("Кот Шрёдингера")) {
            throw new CollapseOfUniverse("");
        } else {
            this.name = name;
        }

        if (age < 19 && age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("");
        }

        if (weight >= 0 && weight < 25) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getWeight() {
        return weight;
    }

    public boolean stronger(Cat cat) throws CatFoundNoOne {
        if (cat == null)
            throw new CatFoundNoOne("");

        if (cat == this) return false;

        if (this.weight > cat.weight) return true;
        else if (this.weight == cat.weight) return false;
        else return false;
    }
}