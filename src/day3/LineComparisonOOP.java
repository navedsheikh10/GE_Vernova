package day3;

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line otherLine = (Line) obj;
        return Double.compare(this.calculateLength(), otherLine.calculateLength()) == 0;
    }

    public int compareTo(Line otherLine) {
        return Double.compare(this.calculateLength(), otherLine.calculateLength());
    }
}

public class LineComparisonOOP {
    public static void main(String[] args) {
        Point line1Start = new Point(1, 2);
        Point line1End = new Point(4, 6);
        Line line1 = new Line(line1Start, line1End);

        Point line2Start = new Point(2, 3);
        Point line2End = new Point(5, 7);
        Line line2 = new Line(line2Start, line2End);

        double length1 = line1.calculateLength();
        double length2 = line2.calculateLength();

        System.out.printf("Length of Line 1: %.2f\n", length1);
        System.out.printf("Length of Line 2: %.2f\n", length2);

        // Equality check
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal in length.");
        } else {
            System.out.println("The lines are not equal in length.");
        }

        // Comparison
        int comparisonResult = line1.compareTo(line2);
        if (comparisonResult > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Both lines are of equal length.");
        }
    }
}

