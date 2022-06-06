package ru.gazprombank.educate.homework18;

public class Homework {

    public static void main(String[] args) {

    }
    public static int matchingChar(String[] a, String[] b){
int values =0;
for (int i=0;i<a.length;i++){
    if((a[i] != "")&&(b[i] !=""))
    if(a[i].charAt(0) ==b[i].charAt(0))
        values++;
}
        return values;
    }
}
