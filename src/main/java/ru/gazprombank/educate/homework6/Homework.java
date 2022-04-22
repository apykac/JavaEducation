package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        speedingFine(65, true);
        System.out.println();
    }

    public static void speedingFine(int speed, boolean isHoliday) {
        if (isHoliday) {
            speed = speed - 5;
        }
        if (speed <= 60) {
            int fine = 0;
            System.out.println("Fine is 0");
        }
        if (speed > 60 && speed <= 80) {
            int fine = 100;
            System.out.println("Fine is 100");
        }
        if (speed > 80) {
            int fine = 200;
            System.out.println("Fine is 200");
        }

    }
}








