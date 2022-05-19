package ru.gazprombank.educate.homework26;

public class Cat {
    private final String name;
    private final int age;
    private final double weight;

    public Cat() {
        name = "Kot_Shrodengera";
        age = 10;
        weight = 19.0;
    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String getName() throws CollapseOfUniverse {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public boolean stronger(Cat cat) throws CatFoundNoOne, CollapseOfUniverse {
        if (cat == null)
            throw new CatFoundNoOne("Cat found no one!");


        if (this.name.equals("Kot_Shrodengera")) {
            if (cat.name.equals("Kot_Shrodengera"))
                throw new CollapseOfUniverse("Collapse of Universe!!!");
        }

        if (cat == this) {
            System.out.println("The same cat - " + this.name);
            return false;
        }

        if (this.getName() == null || cat.getName() == null)
            throw new IllegalArgumentException();

        if (cat.getName() == "Kot_Shrodengera")
            throw new CollapseOfUniverse("Collapse of Universe!!!");

        if ((this.getWeight() <= 0.1 || this.getWeight() > 30.0) || (cat.getWeight() <= 0.1 || cat.getWeight() > 30.0))
            throw new IllegalArgumentException();

        if ((this.getAge() <= 0 || this.getAge() > 20) || (cat.getAge() <= 0 || cat.getAge() > 20))
            throw new IllegalArgumentException();

        if (this.weight > cat.weight) {
            System.out.println(this.name + " stronger " + cat.name);
            return true;
        } else if (this.weight == cat.weight) {
            System.out.println("No one is stronger!");
            return false;
        } else {
            System.out.println(this.name + " weaker " + cat.name);
            return false;
        }
    }
}
