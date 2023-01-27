package ru.gazprombank.educate.homework26;


import ru.gazprombank.educate.homework2.TriangleExistException;

import javax.xml.catalog.CatalogFeatures;

public class Cat extends java.lang.IllegalArgumentException {


    private final String name; // имя кота
    private final int age; // возраст кота
    private final double weight; // вес кота
    private int strength;

    {
        name = "Кот Шрёдингера";

        age = 7;
        weight = 8;

        if (name == "Кот Шрёдингера") {
            strength = 3;
        }else if (age >= 3 && weight >= 3 && age <= 8 && weight <= 8) {
            strength = 2;
        } else if ((age < 3 || age > 8) && weight > 3 && weight < 8) {
            strength = 1;
        } else if ((weight < 3 || weight > 8) && age > 3 && age < 8) {
            strength = 1;
        } else {
            strength = 0;
        }

    }

    public Cat() throws CollapseOfUniverse {
    }

    public Cat (String name, int age, double weight) throws CollapseOfUniverse {
        if (age < 0 || name == "" || name == null || age > 18) throw new java.lang.IllegalArgumentException();
        else if (name == "Кот Шрёдингера") throw new CollapseOfUniverse();

    }


    public boolean stronger(Cat doeramon) throws CatFoundNoOne, CollapseOfUniverse {



        if (doeramon == null) {
            throw new CatFoundNoOne();
        }

        Cat okay  = new Cat(name, age, weight);


        if (okay.name.equals(doeramon.name)) {
            throw new CollapseOfUniverse();
        }

        if (!(okay.strength>doeramon.strength)) { return false;}



 return true;
    }

    public void main(String[] args) throws CollapseOfUniverse, CatFoundNoOne {


    }

    }

