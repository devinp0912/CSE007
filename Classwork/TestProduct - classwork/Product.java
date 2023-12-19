/* Devin Pombo
 * 11/4/22
 * CSE007 - classwork
 * Purpose: practice class/object oriented programming
 */

public class Product{
    private String productCode;
    private double productPrice;
    private int productInventory;
    private static int totalProducts; //using static allows all everyone to get access to it. 

    //constructor
    public Product(String productCode, double productPrice, int productInventory){
        this.productCode = productCode; //this command says, especially in the case of same name variables, that this variable is the one created in the class;;; no the method
        this.productPrice = productPrice;
        this.productInventory = productInventory;
        totalProducts++;
    }
    //constructor
    public Product(){
        productCode = "no code";
        productPrice = 0;
        productInventory = 0;
        totalProducts++;
    }
    public int getTotalProducts(){
        return totalProducts;
    }
    public void setCode(String code){
        productCode = code;
    }
    public String getCode(){
        return productCode;
    }
    public void setPrice(double price){
        productPrice = price;
    }
    public double getPrice(){
        return productPrice;
    }
    public void setCount(int inventory){
        productInventory = inventory;
    }
    public int getCount(){
        return productInventory;
    }
    public void addInventory(int amt){
        productInventory = productInventory + amt;
    }
    public void sellInventory(int amt){
        productInventory = productInventory - amt;
    }
}