package store;
import static java.lang.Math.*;
public class Products {
private String name;
private double price;
private double quantity;
private final int  SerialID;

public void setName(String name) {
    this.name = name;
}

public void setPrice(double price) {
    this.price = price;
}

public void setQuantity(int quantity) {
    this.quantity = quantity;
}

public String getName() {
    return name;
}

public double getPrice() {
    return price;
}

public double getQuantity() {
    return quantity;
}
    
public int getSerialID() {
    return SerialID;
}

public double getTotalPrice(double quantity){
    return quantity*price;
}




public Products(String name, double price, int quantity, int SerialID) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.SerialID = SerialID;
}

public Products() {
    this.name = " ";
    this.price = 0;
    this.quantity = 0;
    this.SerialID = (int) (random() * 1000000);
}


}