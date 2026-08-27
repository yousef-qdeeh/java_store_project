package Persons;
//import java.util.*;
import static java.lang.Math.*;
public class Employees {
    private String name;
    private int Age;
    private double Balance;
    private float Grade;
    private  final double _EMPLOYEE_ID_;
    
    public void setAge(int age) {
        Age = age;
    }
   
    public void setBalance(double balance) {
        Balance = balance;
    }
   
    public void setGrade(float grade) {
        Grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public double getBalance() {
        return Balance;
    }

    public float getGrade() {
        return Grade;
    }
    
    public String getName() {
        return name;
    }
    public double get_EMPLOYEE_ID_() {
        return _EMPLOYEE_ID_;
    }
    public Employees() {
        this._EMPLOYEE_ID_=(double)(random() * 1000000);
    }
}