package wang.coffee.manufacture;

public class test {
    public static void main(String[] args) {
        CappuccinoOrder A = new CappuccinoOrder();
        Cappucino cappucino = new CappuccinoManufacture().Manufacture(A);
        System.out.println(cappucino.bubble);

        CafeAmericanoOrder B = new CafeAmericanoOrder();
        B.milk(true);
        B.sugar(3);
        CafeAmericano cafeAmericano = new CafeAmericanoManufacture().Manufacture(B);
        System.out.println(cafeAmericano.suger);

        MochaCoffeeOrder C = new MochaCoffeeOrder();
        C.bubble(true);
        MochaCoffee mochaCoffee = new MochaCoffeeManufacture().Manufacture(C);
        System.out.println("奶泡：牛奶：巧克力：浓缩咖啡 = "+mochaCoffee.bubble+" : "+mochaCoffee.milk+" : "+mochaCoffee.chocolate+" : "+mochaCoffee.espresso);
    }
}
