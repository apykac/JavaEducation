package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {
        System.out.println(repeatChar("AAbb"));

    }
    public static String repeatChar(String str) {
        String result ="";
        for (int i = 0 ; i<str.length();i++){
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }
}
