package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }
    public static int yoYo(String str){
        String i = str;
        String newStr;
        if(str.contains("yo")) {
            newStr = str.replace("yo", "");
        }
        else{
            newStr = str;
        }
        if (i.length() != newStr.length()){
            return  (i.length() - newStr.length()) / 2;
        }
        else {
            return 0;
        }
    }
}
