import java.util.ArrayList;

public class Lines {

    private ArrayList<Line> lines = new ArrayList<Line>();

    public ArrayList<Line> getLines() {
        for (int i = 0; i < 5; i++) {
            lines.add(new Line(new Point(), new Point()));
        }
        return lines;
    }

    public ArrayList<Line> addNewLine(Line line) {
        lines.add(line);
        return lines;
    }

    public double sumLength(){
        double sum = 0;
        for(Line line:lines)
            sum+=line.getLength();
        return sum;
    }

    public Line longestLine(){
        Line line = lines.get(0);
        double max = 0;
        for(Line line1: lines){
            if(line1.getLength()>max) {
                max = line1.getLength();
                line = line1;
            }
        }
        return line;
    }
}
