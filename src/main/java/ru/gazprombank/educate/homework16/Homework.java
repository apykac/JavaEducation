package ru.gazprombank.educate.homework16;


public class Homework {

    public static void main(String[] args) {

    }

    public static String starKill(String str) {

        if ((str.length() < 3) && str.contains("*")) return "";
        if ((str.length() < 3) && !str.contains("*")) return str;

        boolean first = false;
        boolean last = false;

        if (str.charAt(0) == '*') first = true;
        if (str.charAt(str.length() - 1) == '*') last = true;

        int[] index = new int[str.length()];
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                index[i] = i;
            }
        }

        for (int k : index) {
            if (index[k] != 0) {
                str = str.replace(str.charAt(k - 1), '*').replace(str.charAt(k + 1), '*');
            }
        }

        if (first) str = str.replace(str.charAt(1), '*');
        if (last) str = str.replace(str.charAt(str.length() - 2), '*');

        return str.replace("*", "");

    }


}