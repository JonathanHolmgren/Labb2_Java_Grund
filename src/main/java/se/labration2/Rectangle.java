package se.labration2;

import java.util.Objects;

public class Rectangle extends Shape implements Comparable<Shape>  {

    private float width;
    private float length;

    public Rectangle(float width, float length){
        this.width = width;
        this.length = length;
    }
    @Override
    public float getArea() {
    return width * length;
    }

    @Override
    public float getPerimeter() {
    return 2 * (width + length);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "se.labration2.Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(width, rectangle.width) == 0 && Float.compare(length, rectangle.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length);
    }

    public int compareTo(Shape o) {
        float areaDiff = this.getArea() - o.getArea();

        if (areaDiff < 0) {
            return -1;
        } else if (areaDiff > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}
