package ru.gazprombank.educate.homework1;


import java.util.Arrays;

public class Homework {
    public static void main(final String[] args) {
        String text = "В=опрос. о смысле, жизни также может, пониматься как субъективная!!! оценка!!стая целью жизни?";
        int counter = 0;
        String [] punctuations = {"",".", "!", ";", "?"};
        for (int i = 0; i < text.length(); i++){
            if (Arrays.asList(punctuations).contains(String.valueOf(text.charAt(i)))){
                // Arrays.asList(punctuations) - метод
                // String.valueOf(text.charAt(i)) - возвращает строковое представление переданного аргумента.
                // contains -это метод Java, позволяющий проверить, содержит ли String другую подстроку или нет. Возвращает логическое значение, поэтому его можно использовать непосредственно внутри операторов if.
                counter++;
            }
        }

        System.out.println("количество знаков припинания: " + counter);
    }
}