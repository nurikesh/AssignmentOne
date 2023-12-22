public class Shape {
    private Point[] points;

    public Shape(Point[] points) {
        this.points = points;
    }

    public double perimeter() {
        double perimeter = 0;
        int numPoints = points.length;
        for (int i = 0; i < numPoints - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        perimeter += points[numPoints - 1].distanceTo(points[0]);
        return perimeter;
    }

    public double longestSide() {
        double maxLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double length = points[i].distanceTo(points[i + 1]);
            maxLength = Math.max(maxLength, length);
        }
        double length = points[points.length - 1].distanceTo(points[0]);
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }

    public double averageSide() {
        double totalLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            totalLength += points[i].distanceTo(points[i + 1]);
        }
        totalLength += points[points.length - 1].distanceTo(points[0]);
        return totalLength / points.length;
    }
}