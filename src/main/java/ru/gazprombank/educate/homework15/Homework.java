package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {
        System.out.println(repeatChar("Hello"));
    }
    public static String repeatChar(String str){
        char [] text = str.toCharArray();
        String textRepeat = "";
        for (int i = 0; i<text.length; i++){
            textRepeat = textRepeat + text[i] + text[i];
        }
        return textRepeat;
    }
}
