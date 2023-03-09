package wang.coffee.manufacture;

import java.util.ArrayList;
import java.util.List;

public class CafeAmericanoOrder extends Order {
    Boolean f = false;
    int n = 0;
    void milk(Boolean f){
        this.f = f;
    }
    void sugar(int n){
        this.n = n;
    }

    @Override
    void setTaste() {

    }

    @Override
    void production() {

        System.out.println("水：浓缩咖啡=3:1");
    }
}
