package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }

    public static int count = 0;
    public static String strN = "";

    public static int yoYo (String str) {
        int countN = 0;
        // Метод indexOf возвращает результат вхождения подстроки в строку. Для того чтобы просто определить есть ли подстрока в строке, есть метод contains
        if ((str.length() <= 1) || str.indexOf("yo") == -1) {
            countN = count;
            count = 0;
            return countN;
        }
        strN = str.substring(str.indexOf("yo") + 2);
        count ++;
        return yoYo(strN);
    }
}
