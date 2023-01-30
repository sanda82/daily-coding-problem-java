package com.problem;

import java.util.List;
public class Problem01290 {

    class Point {
        double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    List<Point> points;

    public Problem01290(List<Point> points) {
        this.points = points;
    }

    public boolean contains(Point p) {
        int n = points.size();
        int inside = 0;
        double x = p.x;
        double y = p.y;
        Point prev = points.get(n - 1);
        for (Point curr : points) {
            if (curr.y > y != prev.y > y && x < (prev.x - curr.x) * (y - curr.y) / (prev.y - curr.y) + curr.x) {
                inside = 1 - inside;
            }
            prev = curr;
        }
        return inside != 0;
    }
}