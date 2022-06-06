package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {

    }
    public static String starKill(String str){
        String conclusion = " ";
        int values = str.indexOf('*');
        if (values != -1) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (values - 1 > i && str.charAt(i) != '*') {
                    conclusion = conclusion + str.charAt(i);
                }
                else if (str.charAt(i) == '*') {
                    values = i;
                }
                else if (values + 1 < i && str.charAt(i + 1) != '*'){
                    conclusion = conclusion + str.charAt(i);
                }
            }
            if (values + 1 < str.length()-1 && str.charAt(str.length()-1) != '*') {
                conclusion = conclusion + str.charAt(str.length() - 1);
            }

        } else {
            conclusion = str;
        }
        return conclusion;
    }
}