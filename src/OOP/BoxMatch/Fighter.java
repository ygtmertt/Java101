package OOP.BoxMatch;

public class Fighter {
    String name;
    String fighterClass;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, String fighterClass, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.fighterClass = fighterClass;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public boolean dodge() {
        double dodgeChance = Math.random() * 100;  // 0.0 to 99.9
        return dodgeChance < this.dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + "\t" + this.damage + " damage dealt.");

        if (foe.dodge()) {
            System.out.println(foe.name + " has deflected the attack.");
            return foe.health;
        }

        return Math.max(foe.health - this.damage, 0);  // returns either 0 or the remaining health. Whichever is larger.

    }
}
