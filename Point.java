import java.util.Random;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        Random random = new Random();
        this.x = random.nextInt(20) - 10;
        this.y = random.nextInt(20) - 10;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void getPrintPoint(){
        System.out.println("Point = " + x + "," + y);

    }
}
