package wang.coffee.manufacture;

public class CappuccinoManufacture extends Manufacture<Cappucino,CappuccinoOrder>{

    @Override
    Cappucino Manufacture(CappuccinoOrder cappuccinoOrder) {
        Cappucino cappucino = new Cappucino();
        return cappucino;
    }

}
