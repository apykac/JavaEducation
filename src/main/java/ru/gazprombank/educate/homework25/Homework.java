package ru.gazprombank.educate.homework25;

public class Homework {

    public static void main(String[] args) {

    }
    public static String getPrefix(String[] s) {
        if (s.length == 0) return "";

        String prefix = s[0];
        for (int i = 1; i < s.length; i++) {
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;
    }
}
