package ru.gazprombank.educate.homework6;

public class Homework {

    public static int speedingFine(int speed, boolean isHoliday) {
        int bill = 0;
        if (isHoliday == true) {
            speed = speed - 5;
        }
            if (speed <= 60) {
                bill = 0;
            } else if (speed > 60 && speed <= 80) {
                bill = 100;
            } else if (speed > 81) {
                bill = 200;
            }



        return bill;
    }

    ;

    public static void main(String[] args) {

    }
}
