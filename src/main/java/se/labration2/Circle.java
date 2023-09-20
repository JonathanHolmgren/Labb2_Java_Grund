package se.labration2;

import java.util.Objects;

public class Circle extends Shape implements Comparable<Shape>  {

    private float radius;
    public Circle(float radius){
        this.radius = radius;

    }
    @Override
    public float getArea() {

        return (float) (radius * radius * Math.PI);
    }

    @Override
    public float getPerimeter() {

        return (float) (2 * Math.PI * radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "se.labration2.Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


    @Override
    public int compareTo(Shape o) {
        double areaDiff = this.getArea() - o.getArea();

        if (areaDiff < 0) {
            return -1;
        } else if (areaDiff > 0) {
            return 1;
        } else {
            return 0;
        }

    }

}
