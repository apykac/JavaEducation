package ru.gazprombank.educate.homework16;

public class HomeWork {

    public static void main(String[] args) {

    }

    public static String starKill (String str) {
        String newStr = "";
        boolean more = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')  {
                if (more == false) {
                    more = true;
                    if (newStr.length() > 1) {
                        newStr = newStr.substring(0, newStr.length() - 1);
                    } else {
                        newStr = "";
                    }
                }
            } else {
                if (more == false) {
                    newStr = newStr + str.charAt(i);
                } else {
                    more = false;
                }
            }
        }
        return newStr;
    }
}
