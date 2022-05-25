package ru.gazprombank.educate.homework16;

public class Homework {

        public static void main(String[] args) {
            System.out.println(starKill("sdf*ff**"));
        }

        public static String starKill(String str) {
            String text = "";
            boolean star = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '*') {
                    if (!star) {
                        star = true;
                        if (text.length() > 1)
                            text = text.substring(0, text.length() - 1);
                        else
                            text = "";
                    }
                } else {
                    if (!star)
                        text = text + str.charAt(i);
                    else
                        star = false;
                }
            }
            return text;
        }
    }