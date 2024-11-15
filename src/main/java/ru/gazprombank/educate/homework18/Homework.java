package ru.gazprombank.educate.homework18;

public class Homework {

    public static void main(String[] args) {

/*        String[] a = {"b", "xx", "y", "z"};
        String[] b = {"a", "xx", "yyy", "zzz"};
        matchingChar(a, b);*/
    }
    public static int matchingChar(String[] a, String[] b){

        int count = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == "" || b[i] == "") {
                continue;
            }
            else if(a[i].charAt(0) == b[i].charAt(0)){
                count++;
            }
        }
         return count;

    }
}
