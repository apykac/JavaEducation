package ru.gazprombank.educate.homework20;

public class Homework {

    private static int count;
    private static int index = 0;

    public static void main(String[] args) {

        yoYo("xyoxhxiyohhyoh");
    }


    public static int yoYo(String str){
        System.out.println("Base str - " + str + ";     Current count - " + count);

        if(!str.contains("yo")) {
            return count;
        }
        index = str.lastIndexOf("yo");
        count++;
        yoYo(str.substring(0, index));


        //System.out.println(count);

        return count;
    }
}
