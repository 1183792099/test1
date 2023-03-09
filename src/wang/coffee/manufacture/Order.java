package wang.coffee.manufacture;

import java.util.List;

public abstract class Order<CoffeeType> {
    abstract void setTaste();
    abstract void production();
}
