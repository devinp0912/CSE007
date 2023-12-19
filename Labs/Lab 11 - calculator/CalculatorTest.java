/* Devin Pombo
 * 11/10/22
 * CSE007 - Lab 11
 * Purpose: exercise practicing implementing object oriented programming
 */
import java.util.Scanner;

public class CalculatorTest{
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        double x = dataValidate(keyboard);
        System.out.println("Enter a value for y: ");
        double y = dataValidate(keyboard);
        System.out.println("Enter a value for z: ");
        double z = dataValidate(keyboard);

        // 4 x y^3 z
        Calculator calc1 = new Calculator();
        System.out.println("Before any operations, value: " + calc1.getValue());
        calc1.add(4);
        System.out.println("Value: " + calc1.getValue());
        calc1.multiply(x);
        System.out.println("Value: " + calc1.getValue());
        for(int i = 1; i<=3; i++){
            calc1.multiply(y);
            System.out.println("Value: " + calc1.getValue());
        }
        calc1.multiply(z);
        System.out.println("Value: " + calc1.getValue());

        //(2+y)^x
        Calculator calc2 = new Calculator();
        System.out.println("Before any operations, value 2: " + calc2.getValue());
        calc2.add(2);
        System.out.println("Value 2: " + calc2.getValue());
        calc2.add(y);
        System.out.println("Value 2: " + calc2.getValue());
        double temp = calc2.getValue();
        for(int i = 1; i < x; i++){
            calc2.multiply(temp);
            System.out.println("Value: " + calc2.getValue());
        }

        //7z
        Calculator calc3 = new Calculator();
        System.out.println("Before any operations, value 3: " + calc3.getValue());
        calc3.add(7);
        System.out.println("Value 3: " + calc3.getValue());
        calc3.multiply(z);
        System.out.println("Value 3: " + calc3.getValue());

        //calculator numerator
        Calculator calcNumerator = new Calculator();
        System.out.println("Before any operations, numerator value: " + calc3.getValue());
        calcNumerator.add(calc1.getValue());
        System.out.println("Numerator Value: " + calcNumerator.getValue());
        calcNumerator.add(calc2.getValue());
        System.out.println("Numerator Value: " + calcNumerator.getValue());
        calcNumerator.substract(calc3.getValue());
        System.out.println("Numerator Value: " + calcNumerator.getValue());
          

        //5xy
        Calculator calc4 = new Calculator();
        System.out.println("Before any operations, value 4: " + calc4.getValue());
        calc4.add(5);
        System.out.println("Value 4: " + calc4.getValue());
        calc4.multiply(x);
        System.out.println("Value 4: " + calc4.getValue());
        calc4.multiply(y);

        //4z - x
        Calculator calc5 = new Calculator();
        System.out.println("Before any operations, value 5: " + calc5.getValue());
        calc5.add(4);
        System.out.println("Value 5: " + calc5.getValue());
        calc5.multiply(z);
        System.out.println("Value 5: " + calc5.getValue());
        calc5.substract(x);
        System.out.println("Value 5: " + calc5.getValue());
    
        //Calculator Denominator
        Calculator calcDenominator = new Calculator();
        System.out.println("Before any operations, denominator value: " + calcDenominator.getValue());
        calcDenominator.add(calc4.getValue());
        System.out.println("Numerator Value: " + calcDenominator.getValue());
        calcDenominator.add(calc5.getValue());
        System.out.println("Numerator Value: " + calcDenominator.getValue());
        
        //Calculate ANSWER
        Calculator calcAnswer = new Calculator();
        System.out.println("Before any operations, answer value: " + calcAnswer.getValue());
        calcAnswer.add(calcNumerator.getValue());
        System.out.println("Answer Value: " + calcAnswer.getValue());
        calcAnswer.divide(calcDenominator.getValue());
        System.out.println("Answer Value: " + calcAnswer.getValue());

        //print total operations
        System.out.println("Total operations before clear: " + calc1.getOperations());

        //clear calc
        calc1.clear();
        calc2.clear();
        calc3.clear();
        calc4.clear();
        calc5.clear();
        calcAnswer.clear();
        calcDenominator.clear();
        calcNumerator.clear();
        System.out.println("value: " + (calc1.getValue() + calc2.getValue() + calc3.getValue() + calc4.getValue() + calc5.getValue() + calcAnswer.getValue() + calcNumerator.getValue() + calcDenominator.getValue()));

        
    }

    public static double dataValidate(Scanner keyboard){
        boolean doForever = true;
        while(doForever){//will keep running until an int is entered
            boolean isDouble = keyboard.hasNextDouble();
            if(isDouble == true){
                double num = keyboard.nextDouble();
                return num;
            }else{
                System.out.println("ERROR: invalid entry");

            }
        }
        double thisNumWillNeverGetReturned = 0;
        return thisNumWillNeverGetReturned;
    }
}