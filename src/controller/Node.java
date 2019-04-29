package controller;

import io.Data;
import io.IData;
import io.IReader;
import io.IWriter;
import service.IService;

public class Node {

    private IReader reader;
    private IWriter writer;
    private IService service;
    private IData data;

    public Node(IReader reader, IWriter writer, IService service) {
        this.reader = reader;
        this.writer = writer;
        this.service = service;
        this.data = new Data(reader,writer);
    }

    public void execute() {
        Controller controller = new Controller();
        controller.init(data);
        controller.calc(service);
        controller.done(writer);
    }
}
