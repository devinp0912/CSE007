/* Devin Pombo
 * 11/10/22
 * CSE007 - Lab 11
 * Purpose: exercise practicing implementing object oriented programming
 */

public class Calculator{
    private double value;
    private static int operations = 0;

    public Calculator(){
        this.value = 0.0;
    }

    public void add(double val){
        this.value = this.value + val;
        operations++;
    }
    public void substract(double val){
        this.value = this.value - val;
        operations++;
    }
    public void multiply(double val){
        this.value = this.value * val;
        operations++;
    }
    public void divide(double val){
        this.value = this.value / val;
        operations++;
    }
    public void clear(){
        this.value = 0.0;
    }
    public double getValue(){
        return this.value;
    }
    public int getOperations(){
        return operations;
    }
}