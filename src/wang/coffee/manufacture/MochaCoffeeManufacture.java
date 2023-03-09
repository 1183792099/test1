package wang.coffee.manufacture;

public class MochaCoffeeManufacture extends Manufacture<MochaCoffee> {
    @Override
    MochaCoffee Manufacture(Order order) {
        MochaCoffeeOrder mochaCoffeeOrder = (MochaCoffeeOrder)order;
        MochaCoffee mochaCoffee = new MochaCoffee();
        mochaCoffee.bubble = mochaCoffeeOrder.n;
        return mochaCoffee;
    }
}
