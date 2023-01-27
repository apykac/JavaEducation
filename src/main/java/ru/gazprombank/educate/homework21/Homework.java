package ru.gazprombank.educate.homework21;

public class Homework {

    public static String endoo(String str) {



        if (str.matches("([^o]*)(o*$)")) {
            return str;
        }

        return (endoo(str.replaceFirst("o", "")).concat("o"));


    }

    public static void main(String[] args) {

        endoo("zalooopaaaoopaa");
    }
}
