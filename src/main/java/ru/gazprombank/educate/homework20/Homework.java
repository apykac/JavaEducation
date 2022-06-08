package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {

    }

    public static int yoYo(String str){
        String yo = "yo";

        if (!str.contains(yo)) {
            return 0;
        } else if (str.substring(0, yo.length()).equals(yo)){
            return yoYo(str.substring(1)) + 1;
        } else {
            return yoYo(str.substring(1));
        }
    }
}
