package ru.gazprombank.educate.homework21;

public class Homework {

    public static void main(String[] args) {
    endoo("ohiohio");
    }

    StringBuffer buffer = new StringBuffer();
    static int  count = 0;
    static int index = 0;

    public static String endoo(String str){

        String buffer = new String();
/*        StringBuffer buffer1 = new StringBuffer();
        System.out.println(buffer.toString());

        if(!str.contains("o")){
            return str;
        }*/
        buffer = str.replaceAll("o", "");


        System.out.println(buffer);
        return buffer.toString();
    }
}
