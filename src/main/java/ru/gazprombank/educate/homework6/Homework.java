package ru.gazprombank.educate.homework6;

public class Homework {

    public static int speedingFine(int speed, boolean isHoliday) {
        int skm = 0;
        if (isHoliday == true) {
             if (speed <= 65) {
                return 0;
            } else if (speed <= 85 && speed > 66) {
                return 100;
            } else if (speed > 86) {
                return 200;
            }
        } else {
            if (speed <= 60) {
                return 0;
            }
            if (speed <= 80 && speed > 60) {
                return 100;
            }
            if (speed > 81) {
                return 200;
            }
        }
        return skm;
    }
    public static void main(String[] args) {

    }
}