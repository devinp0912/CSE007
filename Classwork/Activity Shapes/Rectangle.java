/* Devin Pombo
 * 11/28/22
 * CSE007 - Activity
 * Purpose: Create shape classes with inheritance and abstraction
 */

public class Rectangle extends Shape{
    //data fields
    private double length;
    private double width;
    private static int numRects = 0;

    //constructors
    public Rectangle(){
        super();
        numRects++;
    }
    public Rectangle(double length, double width){
        super();
        this.length = length;
        this.width = width;
        numRects++;
    }
    public Rectangle(String color, String name, double length, double width){
        super(color, name);
        this.length = length;
        this.width = width;
        numRects++;
    }

    //getter and setter
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public static int getNumRects(){
        return numRects;
    }

    //other methods
    @Override
    public double computeArea(){
        return length * width;
    }
    @Override
    public double computePerimeter(){
        return 2 * length + 2 * width;
    }
    @Override
    public String toString(){
        return super.toString() + "Length/Width: " + getLength() + "/" + getWidth() + "   Area: " + computeArea() + "   Perimeter: " + computePerimeter();
    }
}