package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {
        System.out.println(repeatChar("Hi-There"));
    }

    public static String repeatChar (String str){
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < str.length(); i++)   {
            myString.append(str.charAt(i)).append(str.charAt(i));
        }
        return myString.toString();
    }
}
