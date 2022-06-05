package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {

    }

    public static String middleThree(String inText){
        if (inText.length() <= 3){
            return inText;
        } else {
            int index = inText.length() / 2 -1;
            int length = 3;

            return inText.substring(index, index+length);
        }


    }
}
