package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        //middleThree("Jamaica");
    }
    String string = new String();
    public static String middleThree(String string){
        if( string.length() < 4){
            return string;
        }
        else{
            int c = string.length() / 2;
            String s = string.substring(c - 1, c + 2);
            return s;
        }

    }
}
