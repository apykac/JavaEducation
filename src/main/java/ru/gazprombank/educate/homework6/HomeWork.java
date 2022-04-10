package ru.gazprombank.educate.homework6;

public class HomeWork {

    public static void main(String[] args) {
        int speed = 66;
        boolean isHoliday = true;
        System.out.println(speedingFine(speed,isHoliday));
    }

    public static int speedingFine(int speed, boolean isHoliday){
        int speedLimit1 = 60;
        int speedLimit2 = 80;

        if (isHoliday) {
            speedLimit1 += 5;
            speedLimit2 += 5;
        }

        if( speed <= speedLimit1){
            return 0;
        } else {
            if (speed <= speedLimit2 ){
                return 100;
            } else {
                return 200;
            }

        }

    }
}
