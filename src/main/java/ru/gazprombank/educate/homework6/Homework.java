package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        System.out.println(speedingFine(65, true));
    }
    public static int speedingFine(int speed, boolean isHoliday){
        int shtraf=0;
        if (isHoliday != true) {
            if (speed<=60) {
                shtraf = 0;
            } else if (speed<=80 && speed >60) {
                shtraf = 100;
            } else if (speed >81) {
                shtraf = 200;
            }

        } else {
            if (speed<=60+5) {
                shtraf = 0;
            } else if (speed<=80+5 && speed >60+5) {
                shtraf = 100;
            } else if (speed >81+5) {
                shtraf = 200;
            }
        }
        return shtraf;

    }
}
