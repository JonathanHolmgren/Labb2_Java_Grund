package se.labration2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = run();

        shapes.sort(null);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }

    }

    public static ArrayList<Shape> run(){

        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle1 = Shape.createShape(3);
        Shape circle2 = Shape.createShape(5);
        Shape circle3 = Shape.createShape(7);

        Shape rectangle1 = Shape.createShape(5, 6);
        Shape rectangle2 = Shape.createShape(4, 8);
        Shape rectangle3 = Shape.createShape(6, 7);


        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(rectangle3);

        return shapes;
    }


}







//Lite kod till main

         /*
        System.out.println("Skapas av hjälp av konstruktören på klassen se.labration2.Circle");
        se.labration2.Circle testOne = new se.labration2.Circle(3);
        System.out.println("Arean: " + testOne.getArea());
        System.out.println("Omkretsen: " + testOne.getPerimeter());

        System.out.println("Skapas av hjälp av konstruktören på klassen se.labration2.Rectangle");
        se.labration2.Rectangle testTwo = new se.labration2.Rectangle(5, 4);
        System.out.println("Arean: " + testTwo.getArea());
        System.out.println("Omkretsen: " + testTwo.getPerimeter());

        System.out.println("Skapas av en Statisk metod på se.labration2.Shape");
        se.labration2.Shape newCircle = se.labration2.Shape.createShape(3);
        System.out.println("Arean: " + newCircle.getArea());
        System.out.println("Omkretsen: " + newCircle.getPerimeter());

        System.out.println("Skapas av en Statisk metod på se.labration2.Shape");
        se.labration2.Shape newRectangle = se.labration2.Shape.createShape(5,4);
        System.out.println("Arean: " + newRectangle.getArea());
        System.out.println("Omkretsen: " + newRectangle.getPerimeter());

        System.out.println(testTwo.equals(newRectangle));
*/