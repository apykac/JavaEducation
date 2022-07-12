package ru.gazprombank.educate.homework1;

public class Homework {
    public static void main(String[] args) {
        String ln = "Лето, @, что это!!$!!";
        System.out.println(punctuationCount(ln));

    }

    public static int punctuationCount(String ln) {
        char[] mark = {'.',',',';',':','!','?','-','"','@','#','%','^','&','*','$','\'','[',']','+','/','<','>','(',')','_','`','{','}','~','=','|', '\\'};
        int count = 0;
        for (int i = 0; i < ln.length(); i++) {
            for (int c = 0; c < mark.length; c++) {
                if (ln.charAt(i) == mark[c]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}