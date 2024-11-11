package ru.gazprombank.educate.homework15;

public class Homework {

    public static void main(String[] args) {

        repeatChar("The");
    }
    public static String repeatChar(String str){

        char[] array = str.toCharArray();
       // char[] arrayResult = new char[str.length() * 2];
        StringBuffer buffer = new StringBuffer();

        for(int c = 0; c < array.length; c++){
            StringBuffer append;
            append = buffer.append(array[c] * 2);

            //arrayResult = (char) (array[c] + array[c]);
        }

        return String.valueOf(buffer);
    }
}
