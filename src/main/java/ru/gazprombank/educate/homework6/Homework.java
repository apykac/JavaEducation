package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        speedingFine(65, false);
    }

    public static int speedingFine(int speed, boolean isHoliday) {
        if (!isHoliday) {
            if (speed <= 60) {
                return 0;
            } else if (speed > 60 && 80 >= speed) {
                return 100;
            } else if (speed > 80) {
                return 200;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed > 65 && 85 >= speed) {
                return 100;
            } else if (speed > 85) {
                return 200;
            }
        }
        return speed;
    }
}
