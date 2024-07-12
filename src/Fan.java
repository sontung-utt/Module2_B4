public class Fan {
    public int speed;
    public boolean isOn;
    public double radius;
    public String color;

    public Fan() {
        this.speed = 1;
        this.isOn = false;
        this.radius = 5;
        this.color = "xanh";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
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

    public String toString() {
        if(isOn){
            return "Quạt đang bật [Tốc độ: " + speed + " - màu sắc: " + color + " - vòng quay: " + radius + "]";
        } else {
            return "Quạt đang tắt [Màu sắc: " + color + " - vòng quay: " + radius + "]";
        }
    }
}
