package OOP;

public class Car {
    String type;
    String color;
    String model;
    int topSpeed;
    int speed = 0;
    int year;

    public void increaseSpeed(int increase) {
        if (speed + increase <= topSpeed) {
            speed += increase;
        }
    }

    public void decreaseSpeed(int decrease) {
        if (speed > 0) {
            if ((speed -= decrease) > 0) {
                speed -= decrease;
            } else if ((speed -= decrease) <= 0) {
                speed = 0;
            }
        }
    }

    public void showSpeed() {
        System.out.println("Your speed is: " + speed);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
