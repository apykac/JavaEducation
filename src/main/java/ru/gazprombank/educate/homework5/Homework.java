package ru.gazprombank.educate.homework5;

public class Homework {

    public static String middleThree(String stroka) {

        char[] cArray = stroka.toCharArray();
        int dlina = cArray.length;
        if (dlina <= 3) {
            return stroka;
        }
        {
            int i1 = dlina % 2;
            int position = ((dlina - 1) / 2);
            if (i1 == 1) {
                char[] cArray2 = {cArray[position - 1], cArray[position], cArray[position + 1]};
                return new String(cArray2);
            } else {
                {
                    char[] cArray2 = {cArray[position - 1], cArray[position]};
                    return new String(cArray2);
                }
            }
        }
    }

    public static void main(String[] args) {

        String stroka = "zxc";
        middleThree(stroka);
    }
}
