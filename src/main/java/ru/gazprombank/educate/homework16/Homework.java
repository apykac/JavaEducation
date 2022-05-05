package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {

    }

    public static String starKill (String str) {
        String newStr = "";
        boolean more = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*')  {
                // Булева переменная сравнивается другим способом
                if (more == false) {
                    more = true;
                    if (newStr.length() > 1)
                        newStr = newStr.substring(0, newStr.length() - 1);
                    else
                        newStr = "";
                }
            } else {
                // Булева переменная сравнивается другим способом
                if (more == false)
                    // Можно заменить на StringBuilder
                    newStr = newStr + str.charAt(i);
                else
                    more = false;
            }
        }
        return newStr;
    }
}
