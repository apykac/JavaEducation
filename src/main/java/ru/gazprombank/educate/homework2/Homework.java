package ru.gazprombank.educate.homework2;

public class Homework {
    public static void main(String[] args) {
    }

    public static double calculateTriangleArea(int a, int b, int c) throws TriangleExistException {

        if ((a+b<c) | (a+c<b) | (b+c<a)) throw new TriangleExistException();

        double p = (double) (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        s=s*1000;
        int result = (int)Math.round(s);
        s = (double) result / 1000;
/*        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(s);
        s = Double.parseDouble(result);*/
        return s;

    }
}
