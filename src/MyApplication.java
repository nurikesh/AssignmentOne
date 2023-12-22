import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Point[] points = readPointsFromFile("C:\\Users\\user\\Desktop\\JavaOOP\\AssignmentOne\\src\\source.txt");
        Shape shape = new Shape(points);
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }

    private static Point[] readPointsFromFile(String fileName) {
        Point[] points = new Point[10];
        try {
            Scanner sc = new Scanner(new File(fileName));
            int count = 0;
            while (sc.hasNext() && count < 10) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                points[count] = new Point(x, y);
                count++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return points;
    }
}