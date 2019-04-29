import controller.Controller;
import controller.Node;
import io.*;
import service.IService;
import service.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //File file = new File("numbers.txt");

        Scanner scanner = new Scanner(System.in);
        IReader reader = new ReaderConsole(scanner);
        IWriter writer = new WriterConsole();
        IData data = new Data(reader, writer);
        IService service = new Service();
        Node node = new Node(reader, writer,service);
        node.execute();


    }
}