/* Devin Pombo
 * 11/28/22
 * CSE007 - Activity
 * Purpose: Create shape classes with inheritance and abstraction
 */
import java.util.Scanner;

public class ShapeTest{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        //create array that user can edit
        System.out.println("How many shapes do you want to create?");
        int numShapes = keyboard.nextInt();
        Shape[] shapes = new Shape[numShapes];
        System.out.println("Enter 1 for a Circle, 2 for a triangle, 3 for a rectangle");
        for(int i = 0; i < shapes.length; ){
            System.out.println("Create a new shape: enter 1, 2, or 3");
            int choice = keyboard.nextInt();
            if(choice == 1){
                System.out.print((i+1) + ".) ");
                shapes[i] = createCircle(keyboard);
                i++;
            }else if(choice == 2){
                System.out.print((i+1) + ".) ");
                shapes[i] = createTriangle(keyboard);
                i++;
            }else if(choice == 3){
                System.out.print((i+1) + ".) ");
                shapes[i] = createRectangle(keyboard);
                i++;
            }else{
                System.out.println("Not a value number");
                //do nothing, do not increment i...
            }
        }

        //Pre -- an  area of shape objects has been initalized
        //Post -- the user will continue to get prompted with a menu that allows them to interact with the data in the area until they choose to exit

        displayMenu(keyboard, shapes);

        System.out.println("\n\nRandom Shapes Array: required by assignment description");
        Shape[] randomShapes = new Shape[5];
        for(int i = 0; i < randomShapes.length; i++){
            int random = (int)((Math.random()*3)+1);
            if(random == 1){
                double radius = Math.random()*10;
                Circle c = new Circle(radius);
                randomShapes[i] = c;
            }else if(random == 2){
                double base = Math.random()*10;
                double height = Math.random()*10;
                Triangle t = new Triangle(base, height);
                randomShapes[i] = t;
            }else if(random == 3){
                double length = Math.random()*10;
                double width = Math.random()*10;
                Rectangle r = new Rectangle(length, width);
                randomShapes[i] = r;
            }
        }
        displayMenu(keyboard, randomShapes);

    }

    public static void displayMenu(Scanner myScan, Shape[]list){
        boolean exit = false;
        do{  
            System.out.println("     Menu:");
            System.out.println("\t1.) Display Shapes:");
            System.out.println("\t2.) Edit an Item:");
            System.out.println("\t3.) Display total and average perimeter and area of objects:");
            System.out.println("\t4.) Exit");
            System.out.println("     Please select an action: 1,2,3, or 4");
            
            int choice = myScan.nextInt();
            if(choice == 1){
                String printMe;
                for(int i = 0; i < list.length; i++){
                    printMe = list[i].toString();
                    System.out.println(printMe);
                }
            }else if(choice == 2){
                System.out.println("Enter the index of a shape from the list.");
                for(int i = 0; i < list.length; i++){
                    System.out.println("\t" + (i+1) + ".) " + list[i].getName());
                }
                int index = myScan.nextInt();
                if(index-1 <= list.length){
                    System.out.println("What do you want to edit?");
                    System.out.println("\t1.) color");
                    Circle c = (Circle)list[index - 1];
                    if(list[index-1] instanceof Circle){
                        System.out.println("\t2.) radius");
                        int edit = myScan.nextInt();
                        myScan.nextLine();
                        if(edit == 1){
                            System.out.println("Enter new color:");
                            String color = myScan.nextLine();
                            c.setColor(color);
                        }else{
                            System.out.println("Enter new radius:");
                            double radius = myScan.nextDouble();
                            myScan.nextLine();
                            c.setRadius(radius);
                        }
                    }
                    if(list[index-1] instanceof Triangle){
                        System.out.println("\t2.) base");
                        System.out.println("\t3.) height");
                        int edit = myScan.nextInt();
                        myScan.nextLine();
                        Triangle t = (Triangle)list[index-1];
                        if(edit == 1){
                            System.out.println("Enter new color:");
                            String color = myScan.nextLine();
                            t.setColor(color);
                        }else if(edit == 2){
                            System.out.println("Enter new base");
                            double base = myScan.nextDouble();
                            myScan.nextLine();
                            t.setBase(base);
                        }else{
                            System.out.println("Enter new height");
                            double height = myScan.nextDouble();
                            myScan.nextLine();
                            t.setHeight(height);
                        }
                    }
                    if(list[index-1] instanceof Rectangle){
                        System.out.println("\t2.) length");
                        System.out.println("\t3.) width");
                        int edit = myScan.nextInt();
                        myScan.nextLine();
                        Rectangle r = (Rectangle)list[index-1];
                        if(edit == 1){
                            System.out.println("Enter new color:");
                            String color = myScan.nextLine();
                            r.setColor(color);
                        }else if(edit == 2){
                            System.out.println("Enter new length");
                            double length = myScan.nextDouble();
                            myScan.nextLine();
                            r.setLength(length);
                        }else{
                            System.out.println("Enter new width");
                            double width = myScan.nextDouble();
                            myScan.nextLine();
                            r.setWidth(width);
                        }
                    }
                }
            }else if (choice == 3){
                double totalArea = 0;
                double totalPerimeter = 0;
                for(int i = 0; i < list.length; i++){
                    if(list[i] instanceof Circle){
                        Circle c = (Circle)list[i];
                        totalArea = totalArea + c.computeArea();
                        totalPerimeter = totalPerimeter + c.computePerimeter();
                    }else if(list[i] instanceof Triangle){
                        Triangle t = (Triangle)list[i];
                        System.out.println("Missing info for Triangle at index " + i + " to compute the perimeter.");
                        double perimeter = t.computePerimeter();
                        totalArea = totalArea + t.computeArea();
                        totalPerimeter = totalPerimeter + perimeter;
                    }else if(list[i] instanceof Rectangle){
                        Rectangle r = (Rectangle)list[i];
                        totalArea = totalArea + r.computeArea();
                        totalPerimeter = totalPerimeter + r.computePerimeter();
                    }
                    
                }
                System.out.println("Total Area: " + totalArea);
                System.out.println("Total Perimeter: " + totalPerimeter);
                double averageArea = totalArea/list.length;
                double averagePerimeter = totalPerimeter/list.length;
                System.out.println("Average Area: " + averageArea);
                System.out.println("Average Perimeter: " + averagePerimeter);
            }else{
                System.out.println("Goodbye!");
                exit = true;
            }
        }while(exit == false);
    }


    //Pre - selected a circle
    //Post - cicrlce is created
    public static Circle createCircle(Scanner myScan){
        String name = "circle";
        String color;
        double radius;
        System.out.println("Circle selected");
        System.out.println("Enter radius:");
        radius = myScan.nextDouble();
        myScan.nextLine();
        System.out.println("Enter a color:");
        color = myScan.nextLine();
        Circle circle = new Circle(color, name, radius);
        return circle;
    }
    //Pre - selected a triangel
    //Post - triangle is created
    public static Triangle createTriangle(Scanner myScan){
        String name = "triangle";
        String color;
        double base;
        double height;
        System.out.println("Triangle selected");
        System.out.println("Enter base:");
        base = myScan.nextDouble();
        System.out.println("Enter height:");
        height = myScan.nextDouble();
        myScan.nextLine();
        System.out.println("Enter a color:");
        color = myScan.nextLine();
        Triangle triangle = new Triangle(color, name, base, height);
        return triangle;
    }
    //Pre - selected a triangle
    //Post - triangle is created
    public static Rectangle createRectangle(Scanner myScan){
        String name = "rectangle";
        String color;
        double length;
        double width;
        System.out.println("Rectangle selected");
        System.out.println("Enter length:");
        length = myScan.nextDouble();
        System.out.println("Enter width:");
        width = myScan.nextDouble();
        System.out.println("Enter a color:");
        myScan.nextLine();
        color = myScan.nextLine();
        Rectangle rectangle = new Rectangle(color, name, length, width);
        return rectangle;
    }
}