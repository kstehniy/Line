
public class Line {

    private final Point pointStart;
    private final Point pointEnd;

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Line(){
        this.pointStart = new Point();
        this.pointEnd = new Point();
    }

    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public double getLength(){
        double x1 = (pointEnd.getX() - pointStart.getX());
        double y2 = (pointEnd.getY() - pointStart.getY());
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(y2, 2));
    }


}
