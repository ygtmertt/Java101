package OOP.BoxMatch;

public class Test {
    public static void main(String[] args) {
        Fighter mikeTyson = new Fighter("Mike Tyson", "Welterweight", 300, 1200, 90, 25.5);
        Fighter israelAdesanya = new Fighter("Israel Adesanya", "Flyweight", 225, 850, 75, 40);

        Ring MSG = new Ring(mikeTyson, israelAdesanya, 100, 70);

        MSG.startFight();
    }
}
