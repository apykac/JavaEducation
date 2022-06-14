package ru.gazprombank.educate.homework26;

import javax.lang.model.type.NullType;
import javax.xml.namespace.QName;

public class Cat {
    static Cat schrrr;
    private final String name;
    private final int age;
    private final double weight;
    private final double power;


    public Cat() {
        this.name = "Кот Шрёдингера";
        this.age = 999;
        this.weight = 999;
        this.power = this.age * this.weight;
//        throw new CollapseOfUniverse("Поздравляю! Вы сошли с ума и спровоцировали коллапс Вселенной");
    }

    public Cat (String name, int age, double weight) throws IllegalArgumentException, CollapseOfUniverse {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        else {
            this.name = name;
        }

        if (name.equals("Кот Шрёдингера")){
            throw new CollapseOfUniverse("Поздравляю! Вы сошли с ума и спровоцировали коллапс Вселенной");
        }

        if (age < 1 || age > 18){
            throw new IllegalArgumentException("Возраст должен иметь разумные пределы");
        } else {
            this.age = age;
        }

        if (weight <= 0 || weight > 13.0){
            throw new IllegalArgumentException("Вес должен иметь разумные пределы");
        } else {
            this.weight = weight;
        }

        this.power = this.age * this.weight;
    }

    public boolean stronger(Cat cat) throws CatFoundNoOne, CollapseOfUniverse{
        if (cat == null){
            throw new CatFoundNoOne("Самое трудное – поймать кошку в темной комнате, особенно тогда, когда ее там нет");
        }

        if (this.name.equals("Кот Шрёдингера") && cat.name.equals("Кот Шрёдингера")){
            throw new CollapseOfUniverse("Играясь, котики уничтожили Вселенную");
        }

        if (cat.name.equals("Кот Шрёдингера")){
            return false;
        }

        if (this.name.equals("Кот Шрёдингера")){
            return true;
        }

        return this.power > cat.power;

    }
}
