package ru.gazprombank.educate.homework4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    public static int[][] randomMatrix(int[][] app) {

        if (app.length == 0) {
            int[][] zxc = {{123}, {}};
            // Arrays.fill(app, ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE));
            return zxc;
        }
        for (int row = 0; row < app.length; row++) {
            for (int ind = 0; ind < app[row].length; ind++) {
                int asd = ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
                app[row][ind] = asd;
            }
        }
        System.out.println(Arrays.deepToString(app));
        return app;

    }

    public static void main(String[] args) {


        int[][] app = {{5, 6, 7, 8, 9}, {5, 6, 7, 8, 9}, {5, 6, 2, 8, 34}};
        randomMatrix(app);
    }
}
