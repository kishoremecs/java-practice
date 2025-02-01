package com.practice;

public class Java16Features {
    // Sealed classes (preview in Java 15, 16)
    public sealed interface Shape permits Circle, Rectangle {
        double area();
    }

    public final class Circle implements Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    public final class Rectangle implements Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }
    }

    public static void main(String[] args) {
        // Records with inheritance
        record Point(int x, int y) {}
        record ColoredPoint(Point point, String color) {}

        ColoredPoint cp = new ColoredPoint(new Point(2, 3), "red");
        System.out.println("Colored Point: " + cp);

        // Pattern matching with instanceof
        /*Shape shape = new Circle(5);
        if (shape instanceof Circle c) {
            System.out.println("Circle area: " + c.area());
        }*/
    }
}