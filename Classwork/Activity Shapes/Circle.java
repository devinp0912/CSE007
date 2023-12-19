/* Devin Pombo
 * 11/28/22
 * CSE007 - Activity
 * Purpose: Create shape classes with inheritance and abstraction
 */

public class Circle extends Shape{
    //data fields
    private double radius;
    private static int numCircles = 0;

    //constructors
    public Circle(){
        super();
        numCircles++;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
        numCircles++;
    }
    public Circle(String color, String name, double radius){
        super(color, name);
        this.radius = radius;
        numCircles++;
    }

    //getter/setter methods
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public static int getNumCircles(){
        return numCircles;
    }

    //Other methods
    @Override
    public double computeArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public double computePerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return super.toString() + "Radius: " + getRadius() + "   Area: " + computeArea() + "   Perimeter: " + computePerimeter(); 
    }

}