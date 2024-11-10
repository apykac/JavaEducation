package ru.gazprombank.educate.homework2;

import java.text.DecimalFormat;

public class Homework {
    public static void main(String[] args) {
/*    int a = 8;
    int b = 4;
    int c = 7;
    calculateTriangleArea(a,b,c);*/
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {
        if(a > b + c || b > a + c || c > a + b){
            throw new TriangleExistException();
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        double p = (double) (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        String triagleString = decimalFormat.format(s);

        return Double.parseDouble(triagleString.replace(",", "."));
    }
}
