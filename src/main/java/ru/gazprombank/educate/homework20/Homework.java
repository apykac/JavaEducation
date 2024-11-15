package ru.gazprombank.educate.homework20;

public class Homework {

    private static int count;
    private static int index = 0;

    public static void main(String[] args) {

        //yoYo("xyoxhxiyohhyoh");
    }


    public static int yoYo(String str){


        if(!str.contains("yo")) {
            return count;
        }
            index = str.lastIndexOf("yo");
            yoYo(str.substring(0, index));

        count++;

        //System.out.println(count);

        return count;
    }
}
