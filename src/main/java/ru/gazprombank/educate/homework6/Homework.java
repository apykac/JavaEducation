package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        int speed = 139;
        boolean isHoliday = true;
        System.out.println(speedingFine(speed,isHoliday));
    }

    public static int speedingFine(int speed, boolean isHoliday) {
        int speedingFine = 0;
        if ((speed > 65 && speed <= 85) && (isHoliday)) speedingFine = 100;
        else if ((speed > 86) && (isHoliday)) speedingFine = 200;
        else if ((speed > 60 && speed <= 80) && !(isHoliday)) speedingFine = 100;
        else if ((speed > 81) && !(isHoliday)) speedingFine = 200;
        return speedingFine;
    }
}

