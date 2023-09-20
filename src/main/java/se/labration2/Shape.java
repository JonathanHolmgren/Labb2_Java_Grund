package se.labration2;

public abstract class Shape {

    public abstract float getArea();

    public abstract float getPerimeter();


    // Här skapar jag Overloaded metoder för att skapa olika shape med hjälp av en statisk metod på klassen se.labration2.Shape.
    // Skulle även funka att använda en metod som har olika if satser för att bestämma vilken shape det ska vara.
    public static Shape createShape(float radius){

        if(radius >= 0.0f){
            return new Circle(radius);
        } else {
            throw new IllegalArgumentException("Ogiltig radie. Radie måste vara större än 0");
        }

    }
    public static Shape createShape(float width, float length){
        if(width > length || width < length){
            return new Rectangle(width, length);
        } else {
            throw new IllegalArgumentException("Ena värdet måste vara större än de andra.");
        }

    }

}
