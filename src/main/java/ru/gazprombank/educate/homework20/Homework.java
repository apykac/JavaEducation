package ru.gazprombank.educate.homework20;

public class Homework {

    public static void main(String[] args) {
        System.out.println(yoYo("xhyoxxyo"));
    }
    public static int yoYo(String str){
        int count = 0;
        if (str.indexOf("yo") == -1) {
            return count;
        }
        str = str.substring(str.indexOf("yo") + 2, str.length());
        count = count + 1;
        return count + yoYo(str);
    }

}
