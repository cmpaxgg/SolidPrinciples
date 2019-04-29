package io;

public interface IData extends IReader, IWriter {

    default int input(String text) {
        print(text);
        return read();
    }
}
