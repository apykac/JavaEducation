package ru.gazprombank.educate.homework19;

public class Homework {

    public static void main(String[] args) {
        //longestStreak("xyzz");
    }

    public static int longestStreak(String str){

        int count = 1;
        int countMax = 1;
        StringBuffer buffer = new StringBuffer(str);

        if(str.isEmpty()){
            return 0;
        }
        else{
            for(int i = 1; i < buffer.length(); i++){
                char char1;
                char1 = buffer.charAt(i);
                if(char1 == buffer.charAt(i - 1)) {
                    count++;
                    if(count > countMax) {
                        countMax = count;
                    }
                }
                else{
                    count = 1;

                 }
            }
        }
        //System.out.println(countMax);
        return countMax;
    }


}

