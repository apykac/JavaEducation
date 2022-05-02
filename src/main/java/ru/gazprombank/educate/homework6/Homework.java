package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {
        int speed = 86;
        boolean isHoliday = true;
        System.out.println(speedingFine(speed, isHoliday));
    }
    public static int speedingFine(int speed, boolean isHoliday){
        int speed60 = 60;
        int speed80 = 80;

        if (isHoliday) {
            speed60 = speed60 + 5;
            speed80 = speed80 + 5;
        }

        if( speed <= speed60){
            return 0;
        } else {
            if (speed <= speed80 ){
                return 100;
            } else {
                return 200;
            }

        }

    }


    }

