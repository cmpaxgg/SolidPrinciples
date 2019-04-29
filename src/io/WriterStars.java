package io;

public class WriterStars implements IWriter {

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int number) {
        for (int i = 0; i < number ; i++) {
            print("*");

        }
    }
}
