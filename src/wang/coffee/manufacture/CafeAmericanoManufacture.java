package wang.coffee.manufacture;

public class CafeAmericanoManufacture extends Manufacture<CafeAmericano,CafeAmericanoOrder> {

    @Override
    CafeAmericano Manufacture(CafeAmericanoOrder cafeAmericanoOrder) {
        CafeAmericano cafeAmericano = new CafeAmericano();
        cafeAmericano.milk = cafeAmericanoOrder.f;
        cafeAmericano.suger = cafeAmericanoOrder.n;
        return cafeAmericano;
    }
}
