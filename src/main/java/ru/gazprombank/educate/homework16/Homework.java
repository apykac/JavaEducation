package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {

    }

    public static String starKill (String str) {
        StringBuilder newStr = new StringBuilder();
        boolean more = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')  {
                if (!more) {
                    more = true;
                    if (newStr.length() > 1) {
                        newStr = new StringBuilder(newStr.substring(0, newStr.length() - 1));
                    } else {
                        newStr = new StringBuilder();
                    }
                }
            } else {
                if (!more) {
                    newStr = newStr.append(str.charAt(i));
                } else {
                    more = false;
                }
            }
        }
        return newStr.toString();
    }
}
