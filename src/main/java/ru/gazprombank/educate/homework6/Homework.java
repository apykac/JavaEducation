package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        System.out.println(speedingFine(65, false));
    }

    public static int speedingFine(int speed, boolean isHoliday) {
        int sizeOfFine = 0;
        if (speed > 65 && speed <= 85 && isHoliday) sizeOfFine = 100;
        else if (speed > 86 && isHoliday) sizeOfFine = 200;
        else if (speed > 60 && speed <= 80 && !isHoliday) sizeOfFine = 100;
        else if (speed > 81 && !isHoliday) sizeOfFine = 200;
        return sizeOfFine;
    }
}
