package Persons;
import java.util.*;
import store.*;
public class Person {
    private String name;
    private int age;
    private double balance;
    private final int SerialID;
    private final ArrayList<Products> productsList;
    public int getAge() {

        return age;
    }

   final public double PayActivity() {
        for(int i=0;i<this.productsList.size();i++){
            if(this.productsList.get(i).getSerialID()==this.SerialID){
                if(this.productsList.get(i).getSerialID()==this.SerialID){
                    if(balance>=this.productsList.get(i).getPrice()){
                        this.balance = balance-this.productsList.get(i).getPrice();
                        System.out.println("Payment successful. Remaining balance: " + this.balance);
                    }else{
                        System.out.println("Insufficient balance. Payment failed.");
                    }
                }
            }else{
                System.out.println("Product not found. Payment failed.");
            }
        }
        return this.balance;
    }
    
    final public String getName() {
        return name;
    }
    
    final public void setAge(int age) {
        this.age = age;
   
    }
   
    final public void SetBalanceFromArrayList(double balance) {
        this.balance = balance;
        
    }
   
    final public void setName(String name) {
        this.name = name;
    }

    public Person(final int SerialID, ArrayList<Products> productsList , double balance) {
        this.SerialID = SerialID;
        this.productsList = productsList;
        this.balance = balance;
    }
}
