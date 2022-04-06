package ru.gazprombank.educate.test.util.print;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintWrapper {
    private final PrintStream odlOut = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    public void on() {
        System.setOut(new PrintStream(out));
    }

    public void off() {
        System.setOut(odlOut);
    }

    public void clear() {
        out.reset();
    }

    public String getOutString() {
        return out.toString();
    }
}
