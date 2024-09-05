package OOP.BoxMatch;

public class Ring {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    public Ring(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public boolean checkWeight() {
        return (f1.weight <= this.maxWeight && f1.weight >= this.minWeight) &&
                (f2.weight <= this.maxWeight && f2.weight >= this.minWeight);
    }

    public boolean isWin() {
        if(f1.health<=0) {
            System.out.println("WINNER IS:\t"+f2.name);
            return true;
        }
        else if(f2.health<=0) {
            System.out.println("WINNER IS:\t"+f1.name);
            return true;
        }
        else {
            return false;
        }
    }

    public void printScore() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(f1.name+"'s remaining health:\t"+f1.health);
        System.out.println(f2.name+"'s remaining health:\t"+f2.health);
    }

    public void startFight() {
        if(checkWeight()) {
            while(f1.health>0 && f2.health>0) {
                System.out.println("~~~~~~~~~~~~~~ NEW ROUND ~~~~~~~~~~~~~~");
                if(Math.random()*100>Math.random()*100) {
                    f2.health=f1.hit(f2);
                }
                else {
                    f1.health=f2.hit(f1);
                }
                if(isWin()) {
                    break;
                }
                printScore();
            }
        }
        else {
            System.out.println("Weight difference is illegal. Match cannot be carried out.");
        }
    }
}
