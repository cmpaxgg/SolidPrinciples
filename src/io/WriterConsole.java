package io;

public class WriterConsole implements IWriter {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int number) {
        System.out.println(number);

    }
}
