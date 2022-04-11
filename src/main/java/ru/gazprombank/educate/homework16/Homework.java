package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {
        System.out.println(starKill("ss**abcd*dd"));

    }
    public static String starKill(String str){
            String result ="";
            int index = str.indexOf('*');
            if (index != -1) {
                for (int i = 0; i < str.length() - 1; i++) {
                    if (index - 1 > i && str.charAt(i) != '*') {
                        result = result + str.charAt(i);
                    } else if (str.charAt(i) == '*') {
                        index = i;
                    }else if (index + 1 < i && str.charAt(i + 1) != '*'){
                        result = result + str.charAt(i);
                    }
                }
                if (index + 1 < str.length()-1 && str.charAt(str.length()-1) != '*') {
                    result = result + str.charAt(str.length() - 1);
                }

            } else {
                result = str;
            }
            return result;
        }

}
