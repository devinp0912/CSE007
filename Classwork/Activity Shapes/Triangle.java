/* Devin Pombo
 * 11/28/22
 * CSE007 - Activity
 * Purpose: Create shape classes with inheritance and abstraction
 */

import java.util.Scanner;

public class Triangle extends Shape{
    Scanner keyboard = new Scanner(System.in);
    //data fields
    private double base;
    private double height;
    private static int numTris = 0;

    //constructors
    public Triangle(){
        super();
        numTris++;
    }
    public Triangle(double base, double height){
        super();
        this.base = base;
        this.height = height;
        numTris++;
    }
    public Triangle(String color, String name, double base, double height){
        super(color, name);
        this.base = base;
        this.height = height;
        numTris++;
    }

    //getter and setters
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base = base;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public static int getNumTris(){
        return numTris;
    }

    //other methods
    @Override
    public double computeArea(){
        return (.5) * base * height;
    }
    @Override
    public double computePerimeter(){
        System.out.println("Perimeter = 3 sides of triangle added up. x+y+Base");
        boolean bothPositive = false;
        double x = 0;
        double y = 0;
        do{
            System.out.println("Enter value of side \"x\"");
            x = keyboard.nextInt();
            System.out.println("Enter value of other side \"y\"");
            y = keyboard.nextInt();
            if(x > 0 && y > 0){
                bothPositive = true;
            }else{
                System.out.println("ERROR: x or y wasn't a positive number");
            }
        }while(bothPositive == false);
        return x+y+base;
    }
    @Override
    public String toString(){
        return super.toString() + "Base/Height: " + getBase() + "/" + getHeight() + "   Area: " + computeArea(); 
    }
}
