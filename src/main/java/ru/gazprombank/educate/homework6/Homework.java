package ru.gazprombank.educate.homework6;

public class Homework {

    public static void main(String[] args) {

    }

    public static int speedingFine (int speed, boolean isHoliday) {
        int pay = 0;

        // Булевы переменные можно не сравнивать с false/true
        // Выражение if(isHoliday) { } эквивалентно выражению if(isHoliday == true) { }
        if (isHoliday == false) {
           if (speed <= 60)
               // Это не имеет смысла, у тебя и так переменная имеет значение 0
               pay = 0;
           if ((speed > 60) & (speed <= 80))
               pay = 100;
           if (speed > 80)
               pay = 200;
        }
        else {
            if (speed <= 65)
                // Это не имеет смысла, у тебя и так переменная имеет значение 0
                pay = 0;
            if ((speed > 65) & (speed <= 85))
                pay = 100;
            if (speed > 85)
                pay = 200;
        }
        return pay;
    }
}
