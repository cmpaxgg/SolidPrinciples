package controller;

import io.IData;
import io.IWriter;
import service.IService;

public class Controller {
    private int x, y, sum;

    public void init(IData data) {
        x = data.input("Enter x : ");
        y = data.input("Enter y : ");
    }

    public void calc(IService service) {
        sum = service.calculate(x, y);

    }

    public void done(IWriter writer) {
        writer.print("Result : ");
        writer.print(sum);
    }
}
