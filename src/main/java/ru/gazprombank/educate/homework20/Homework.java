package ru.gazprombank.educate.homework20;

public class Homework {
    public static int yoYo(String str){
        if (str.contains("yo")){
            str = str.substring(str.indexOf("yo") + 2);
            return yoYo(str) +1;
        }
        else return 0;
    }

    public static void main(String[] args) {

    }
}