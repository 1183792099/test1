package wang.coffee.manufacture;

public class MochaCoffeeManufacture extends Manufacture<MochaCoffee,MochaCoffeeOrder> {
    @Override
    MochaCoffee Manufacture(MochaCoffeeOrder mochaCoffeeOrder) {
        MochaCoffee mochaCoffee = new MochaCoffee();
        mochaCoffee.bubble = mochaCoffeeOrder.n;
        return mochaCoffee;
    }
}
