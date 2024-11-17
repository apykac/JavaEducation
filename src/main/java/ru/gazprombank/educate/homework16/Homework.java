package ru.gazprombank.educate.homework16;

public class Homework {

    public static void main(String[] args) {

        starKill("sm**eil*ly");
    }

    public static String starKill(String str) {

        StringBuffer result = new StringBuffer(str);
        int countIndex = 1;
        char c = '*';

        while(result.indexOf("*") >= 0 ){
            int index = result.indexOf("*");
            if (index == 0) {
                //sub = result.substring(index, index + 2);
                result = result.delete(index, index + 2);
            }else if (result.charAt(index + 1) == c){
                countIndex++;
            }else{
                // sub = result.substring(index - 1, index + 2);
                result = result.delete(index - 1, index + countIndex + 1);
                countIndex = 1;
            }


        }

        for (int i = 0; i < result.length(); i++){
            if( (i + 1) == '*'){

            }else{

            }
        }
        System.out.println(result);
        return result.toString();
    }
}
