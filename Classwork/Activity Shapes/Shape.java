/* Devin Pombo
 * 11/28/22
 * CSE007 - Activity
 * Purpose: Create shape classes with inheritance and abstraction
 */

public abstract class Shape{
    //data fields
    private String color;
    private String name;
    private static int numShapes = 0;

    //constructors
    protected Shape(){
        this.color = "n/a";
        this.name = "n/a";
        numShapes++;
    }
    protected Shape(String color, String name){
        this.color = color;
        this.name = name;
        numShapes++;
    }

    //Getter/Setter Methods
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    } 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static int getNumShapes(){
        return numShapes;
    }

    //Other Methods
    protected abstract double computeArea();
    protected abstract double computePerimeter();
    @Override 
    public String toString(){
        return "Name: " + getName() + "   Color: " + getColor() + "   ";
    }

} 