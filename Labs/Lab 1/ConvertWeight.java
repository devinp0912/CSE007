/*
Name: Devin Pombo
date: 8/26/22
CSE007 Fall 2022: Lab 1
purpose: convert weight in pounds to kilos - IDE = Visual Studio Code  
*/

public class ConvertWeight{
    public static void main (String args[]){
        final double kgPerPound = 0.45359237;
        double weightInPounds = 150.32;
        double weightInKilograms; 

        weightInKilograms = kgPerPound * weightInPounds;
        System.out.println(weightInPounds + "lb is equivalent to " + weightInKilograms + "kg");
    }
}