package OOP_Java.seminar_2;

public class Main {
    public static void main(String[] args) { 
        Market market = new Market();
        Human human1 = new Human("Vasya");
        Human human2 = new Human("Pesla");
        System.out.println("-------------------------");
        market.acceptToMarket(human1);
        market.update();
        System.out.println("-------------------------");
        market.acceptToMarket(human2);
        market.update();
        System.out.println("-------------------------");

    }
}
