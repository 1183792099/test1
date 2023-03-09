package wang.coffee.manufacture;

public class CappuccinoManufacture extends Manufacture<Cappucino>{

    @Override
    Cappucino Manufacture(Order order) {
        Cappucino cappucino = new Cappucino();
        return cappucino;
    }

}
