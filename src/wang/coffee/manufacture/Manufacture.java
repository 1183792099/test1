package wang.coffee.manufacture;

import java.util.List;

public abstract class Manufacture<Order> {
    abstract List<Order> getCoffee(String taste,String way);
    abstract void test();
}
