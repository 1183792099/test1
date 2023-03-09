package wang.coffee.manufacture;

import java.util.ArrayList;
import java.util.List;

public class MochaCoffeeOrder extends Order {
    boolean f = false;
    int n = 1;
    void bubble(Boolean f){
        this.f = f;
        if(f = true)
            n = 0;
    }

    @Override
    void setTaste() {

    }

    @Override
    void production() {

    }

}
