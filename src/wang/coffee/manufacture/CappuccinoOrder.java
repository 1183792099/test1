package wang.coffee.manufacture;

import java.util.ArrayList;
import java.util.List;

public class CappuccinoOrder extends Order {

    List<CappuccinoManufacture> cappuccino = new ArrayList<>();
    @Override
    void setTaste() {

    }

    @Override
    void production() {
        System.out.println();
    }

}
