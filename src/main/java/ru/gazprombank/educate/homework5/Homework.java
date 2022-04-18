package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        String str1 = "Muminka";
        middleThree(str1);
        System.out.println(middleThree(str1));
    }

    public static String middleThree(String str1) {
        int x = str1.length() / 2;
        if (str1.length() <= 3) {
            return str1;

        }
        return str1.substring(x - 1, x + 2);
    }

}
