package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }

    public static int count = 0;
    public static String strN = "";

    public static int yoYo (String str) {
        int countN = 0;
        if ((str.length() <= 1) || (!str.contains("yo"))) {
            countN = count;
            count = 0;
            return countN;
        }
        strN = str.substring(str.indexOf("yo") + 2);
        count ++;
        return yoYo(strN);
    }
}
