import java.util.ArrayList;

public class LineRunner {
    public static void main(String[] args) {

        Point point = new Point();
        point.getPrintPoint();

        Line line = new Line();
        line.getPointStart();
        line.getPointEnd();
        System.out.println("Line length = " + line.getLength());

        Lines lines = new Lines();
        lines.getLines();
        Line line2 = lines.longestLine();
        System.out.println(line2.getLength());




    }
}
