package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }
    public static int yoYo(String str){
        if (!str.contains("yo"))
        return 0;
   else{
            str = str.replaceFirst("yo", "");
            return yoYo(str) + 1;
        }
    }
}
