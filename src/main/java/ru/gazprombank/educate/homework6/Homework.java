package ru.gazprombank.educate.homework6;

public class Homework {
        public static int speedingFine (int speed, boolean isHoliday) {
            int result = 0;
            if (isHoliday) {
                if (speed <= 60+5) {
                    return 0;
                } else if (speed <= 80+5 && speed > 61+5) {
                    return 100;
                } else if (speed > 81+5) {
                    return 200;
                }
            } else {
                if (speed <= 60) {
                    return 0;
                }
                if (speed <= 80 && speed >= 60) {
                    return 100;
                }
                if (speed > 81) {
                    return 200;
                }
            }
            return result;
        }
    }

