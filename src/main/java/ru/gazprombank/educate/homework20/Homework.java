package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }

    public static int count = 0;
    public static String strN = "";
  //  public static int countN = 0;

    public static int yoYo (String str) {
        int countN = 0;
        if (str.length() == 0) return countN;
        if (str.length() == 1) {
            countN = count;
            count = 0;
            return countN;
        }
        if (str.charAt(0) == 'y' & str.charAt(1) == 'o') {
               strN = str.substring(2);
               count ++;
        } else strN = str.substring(1);
        yoYo(strN);
        return countN;
    }
}
