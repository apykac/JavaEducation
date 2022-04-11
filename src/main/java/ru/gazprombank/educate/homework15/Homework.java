package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

    }
    public static String repeatChar(String str){
        char [] ch = str.toCharArray();
        String result = "";
        for (int i = 0; i<ch.length; i++){
            result = result + ch[i] + ch[i];
        }
        return result;
    }
}
