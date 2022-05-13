package ru.gazprombank.educate.homework26;

public class Cat {

    private final String name;
    private final Integer age;
    private final Double weight;

    public Cat() {
        name = "Кот Шрёдингера";
        age = 10;
        weight = 5.5;
    }

    public Cat(String name, Integer age, Double weight) {
        if (name.equals("Кот Шрёдингера")) {
            try {
                throw new CollapseOfUniverse();
            } catch (CollapseOfUniverse e) {
                throw new RuntimeException(e);
            }
        }

        if (null != name && !name.equals(""))
            this.name = name;
        else {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
        }

        if (age > 1 && age < 20)
            this.age = age;
        else
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }

        if (weight > 0.1 && weight < 10)
            this.weight = weight;
        else
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            }
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

    public boolean stronger(Cat cat) {
        if (null == cat) {
            try {
                throw new CatFoundNoOne();
            } catch (CatFoundNoOne e) {
                throw new RuntimeException(e);
            }
        }

        if (this.name.equals("Кот Шрёдингера")) {
            if (cat.name.equals("Кот Шрёдингера")) {
                try {
                    throw new CollapseOfUniverse();
                } catch (CollapseOfUniverse e) {
                    throw new RuntimeException(e);
                }
            } else
                return true;
        }

        if (cat == this)
            return false;

        double myCatoficient = this.weight * this.age;
        double catoficient = cat.weight * cat.age;


        if (myCatoficient > catoficient)
            return true;
        else if (myCatoficient == catoficient)
            return false;
        else
            return false;
    }
}
