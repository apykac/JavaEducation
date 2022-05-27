package ru.gazprombank.educate.homework21;

 public class Homework {

     public static void main(String[] args) {
         String str = "oore";
         System.out.println(endooo(str));
     }

     public static String endooo(String str) {
         if (str.length() < 1)
             return "";
         String newStr = str.substring(1);

         if (str.indexOf("o") == 0) {
             return endooo(newStr) + "o";

         } else {
             return str.charAt(0) + endooo(newStr);
         }
     }
 }