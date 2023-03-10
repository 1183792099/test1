package wang.coffee.manufacture;

import java.util.List;

public abstract class Manufacture<CoffeeType,OrderType> {
    abstract CoffeeType Manufacture(OrderType order);
}
