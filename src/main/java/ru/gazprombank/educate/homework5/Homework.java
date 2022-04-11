package ru.gazprombank.educate.homework5;

public class Homework {

    public static void main(String[] args) {
        String result = middleThree("peter");
        System.out.println(result);
    }
    public static String middleThree(String a) {
        String result="";
        char[] str = a.toCharArray();
        if (a.length()>3){
            for(int i =a.length()/2 -1  ; i<=a.length()/2+1;i++){
                result = result+str[i];
            }
        } else {
            result = a;
        }
        return result;
    }
}
