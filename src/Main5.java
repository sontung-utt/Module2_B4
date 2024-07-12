public class Main5 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("đỏ");
        fan1.setOn(false);
        fan1.setRadius(5);
        fan1.setSpeed(3);

        Fan fan2 = new Fan();
        fan2.setColor("xanh");
        fan2.setOn(true);
        fan2.setRadius(10);
        fan2.setSpeed(2);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
