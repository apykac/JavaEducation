package ru.gazprombank.educate.homework9;

public class Homework {

    public static void main(String[] args) {
    //isOrdered(3, 2, 4, true);
    }
    public static boolean isOrdered(int first, int second, int third, boolean itsOk){
        boolean ok = false;

        if(!itsOk){
            if(third > second && second > first){
                ok = true;
            }
        }else if (third > second){
            ok = true;
        }

        return ok;
    }
}
