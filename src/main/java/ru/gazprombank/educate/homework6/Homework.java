package ru.gazprombank.educate.homework6;

public class Homework {

    public static int speedingFine(int speed, boolean isHoliday) {
        if (isHoliday)
            speed = speed - 5;

        if (speed <= 60) return 0;
        if (speed > 60 && speed <= 80) return 100;
        if (speed > 80) return 200;

        return 0;
    }

    public static void main(String[] args) {

    }
}
