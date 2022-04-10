package ru.gazprombank.educate.homework6;

public class HomeWork {

    public static void main(String[] args) {

    }
    public static int speedingFine (int speed, boolean isHoliday){
        int fine0 = 60;
        int fine100 = 80;
        int fine200 = 81;
        int holidaySpeedUp = 5;
        if (isHoliday){
            fine0 = fine0 + holidaySpeedUp;
            fine100 = fine100 + holidaySpeedUp;
            fine200 = fine200 +holidaySpeedUp;
        }
        if (speed<=fine0){
            return 0;
        }
        else if (speed>fine0 && speed<=fine100){
            return 100;
        }
        else {
            return 200;
        }

    }
}
