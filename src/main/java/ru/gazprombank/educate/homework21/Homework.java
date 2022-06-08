package ru.gazprombank.educate.homework21;

public class Homework {

    public static void main(String[] args) {

    }
    public static String endoo(String str){
        if(str.length()<1)
            return "";
      String newStr=str.substring(1);
      if(str.indexOf("o")==0){
          return endoo(newStr) + "o";
      } else {
    return str.charAt(0)+endoo(newStr);
      }
    }
}
