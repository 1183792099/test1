public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int  FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){}
    public String toString() {
        if (on == true)
            return speed+" "+ color+" " + radius;
            else
        return "fan is off "+color+" "+radius;
    }
}
