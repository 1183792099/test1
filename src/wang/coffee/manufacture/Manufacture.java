package wang.coffee.manufacture;

import java.util.List;

public abstract class Manufacture<CoffeeType> {
    abstract CoffeeType Manufacture(Order order);
}
