package class_1_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/2
 */
public class Main {
    static class Point {
        public double x, y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        double[] toDouble(Point point) {
            return new double[]{x, y};
        }
    }

    public static double distance(Point p1, Point p2) {
        return ((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }

    public static double[] divide(Point[] points, int left, int right) {
        return null;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            String useless = in.nextLine();
            for (int cnt = 0; cnt < T; cnt++) {
                String source = in.nextLine();
                String[] ins = source.split(",");
                int len = ins.length;
                Point[] points = new Point[len];
                for (int i = 0; i < len; i++) {
                    String[] tmp = ins[i].split(" ");
                    double x = Double.parseDouble(tmp[0]);
                    double y = Double.parseDouble(tmp[1]);
                    points[i] = new Point(x, y);
                }
                Arrays.sort(points, Comparator.comparingDouble(point -> point.x));
                System.out.println(divide(points, 0, 0));
            }
        }
    }
}

