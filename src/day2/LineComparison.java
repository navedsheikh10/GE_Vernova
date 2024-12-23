package day2;

// UC0: Display Welcome Message
public class LineComparison {
    public static void main(String[] args) {

        System.out.println("Welcome to the Line Comparison System");

        // UC1: Calculate the Length of a Line
        computeLineLength(1, 1, 4, 5); // Example: Line from (1,1) to (4,5)

        // UC2: Check if Two Lines are Equal
        checkLinesEquality(2, 3, 6, 7, 0, 0, 4, 4); // Example: Two lines (2,3) to (6,7) and (0,0) to (4,4)

        // UC3: Compare Two Lines
        compareLineLengths(0, 0, 3, 4, -1, -1, 2, 2); // Example: Two lines (0,0) to (3,4) and (-1,-1) to (2,2)
    }

    // UC1: Compute the Length of a Line
    public static void computeLineLength(double startX, double startY, double endX, double endY) {
        double lineLength = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        System.out.printf("The length of the line is: %.2f units\n", lineLength);
    }

    // UC2: Verify if Two Lines are Equal
    public static void checkLinesEquality(
            double line1StartX, double line1StartY, double line1EndX, double line1EndY,
            double line2StartX, double line2StartY, double line2EndX, double line2EndY) {

        double line1Length = Math.sqrt(Math.pow(line1EndX - line1StartX, 2) + Math.pow(line1EndY - line1StartY, 2));
        double line2Length = Math.sqrt(Math.pow(line2EndX - line2StartX, 2) + Math.pow(line2EndY - line2StartY, 2));

        if (Double.compare(line1Length, line2Length) == 0) {
            System.out.println("The two lines are of equal length.");
        } else {
            System.out.println("The two lines have different lengths.");
        }
    }

    // UC3: Compare the Lengths of Two Lines
    public static void compareLineLengths(
            double line1StartX, double line1StartY, double line1EndX, double line1EndY,
            double line2StartX, double line2StartY, double line2EndX, double line2EndY) {

        double line1Length = Math.sqrt(Math.pow(line1EndX - line1StartX, 2) + Math.pow(line1EndY - line1StartY, 2));
        double line2Length = Math.sqrt(Math.pow(line2EndX - line2StartX, 2) + Math.pow(line2EndY - line2StartY, 2));

        int comparisonResult = Double.compare(line1Length, line2Length);

        if (comparisonResult > 0) {
            System.out.println("The first line is longer than the second line.");
        } else if (comparisonResult < 0) {
            System.out.println("The first line is shorter than the second line.");
        } else {
            System.out.println("The two lines are of equal length.");
        }
    }
}

