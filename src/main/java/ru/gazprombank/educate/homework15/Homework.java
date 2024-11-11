package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

        repeatChar("The");
    }
    public static String repeatChar(String str){


        StringBuffer buffer = new StringBuffer();

        for(int c = 0; c < str.length(); c++){
            char i = str.charAt(c);
            buffer.append(i);
            buffer.append(i);
        }

        return String.valueOf(buffer);
    }
}
