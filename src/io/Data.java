package io;


public class Data implements IData {

    private IReader reader;
    private IWriter writer;

    public Data(IReader reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public void print(String text) {
        writer.print(text);
    }

    @Override
    public void print(int number) {
        writer.print(number);
    }

    @Override
    public int read() {
        return reader.read();
    }
}
