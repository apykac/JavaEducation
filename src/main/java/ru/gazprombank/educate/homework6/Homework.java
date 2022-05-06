package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {

    }

    public static int speedingFine (int speed, boolean isHoliday) {
        int pay = 0;

        if (!isHoliday) {
           if ((speed > 60) & (speed <= 80)) {
               pay = 100;
           }
           if (speed > 80) {
               pay = 200;
           }
        }
        else {
            if ((speed > 65) & (speed <= 85)) {
                pay = 100;
            }
            if (speed > 85) {
                pay = 200;
            }
        }
        return pay;
    }
}
