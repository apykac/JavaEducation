package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {

    }

    public static int speedingFine(int speed, boolean isHoliday){
        int bonus = 0;
        int fine;

        if (isHoliday){
            bonus = 5;
        }

        int spd = speed - bonus;

        if (spd <= 60){
            fine = 0;
        } else if (spd <= 80){
            fine = 100;
        } else {
            fine = 200;
        }

        return fine;
    }
}
