package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }
    public static String repeatChar(String str){
        char[] string =str.toCharArray();
        String string1 = "";
        for (int i = 0; i<string.length; i++){
            string1 = string1 +string[i]+string[i];

        }
        return string1;
    }
}
