package ru.gazprombank.educate.homework5;

public class HomeWork {

    public static void main(String[] args) {
        String text = "apple";
        System.out.println(middleThree(text));

    }
    public static String middleThree(String text){

        int center = text.length() / 2;
        if (text.length() < 3){
            return text;
        } else{
            return text.substring(center-1,center+2);
        }

    }
}
