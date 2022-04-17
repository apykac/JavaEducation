package ru.gazprombank.educate.homework6;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static int speedingFine(int speed, boolean isHoliday){
        int speedingFine =0;
        if ((speed >65 && speed<=85)&&(isHoliday)) speedingFine = 100;
        else if ((speed>86)&&(isHoliday)) speedingFine =200;
        else if ((speed >60 && speed<=80)&& !(isHoliday)) speedingFine = 100;
        else if ((speed>81)&&!(isHoliday)) speedingFine =200;
        return speedingFine;
    }
}
