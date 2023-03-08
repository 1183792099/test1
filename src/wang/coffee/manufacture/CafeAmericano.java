package wang.coffee.manufacture;

import java.util.ArrayList;
import java.util.List;

public class CafeAmericano extends Manufacture<CafeAmericano> {
    List<CafeAmericano> cafeAmericanos = new ArrayList<>();
    List<CafeAmericano> getCoffee(String taste,String way){
        return cafeAmericanos;
    }
    void milk(Boolean a){
        if(a==true)
            ;
    }
    void sugar(int b){

    }

    @Override
    void test() {
    }
}
