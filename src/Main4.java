public class Main4 {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        try {
            Thread.sleep(7000);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();
        System.out.println("Thời gian đã trôi qua bằng mili giây: " + stopwatch.getElapsedTime());
    }
}
