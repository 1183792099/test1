package wang.coffee.manufacture;

public class CafeAmericanoManufacture extends Manufacture<CafeAmericano> {

    @Override
    CafeAmericano Manufacture(Order order) {
        CafeAmericanoOrder cafeAmericanoOrder = (CafeAmericanoOrder)order;
        CafeAmericano cafeAmericano = new CafeAmericano();
        cafeAmericano.milk = cafeAmericanoOrder.f;
        cafeAmericano.suger = cafeAmericanoOrder.n;
        return cafeAmericano;
    }
}
