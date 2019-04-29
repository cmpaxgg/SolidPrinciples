package service;

public class Service implements IService {

    @Override
    public int calculate(int x, int y) {
        return x + y;
    }
}
