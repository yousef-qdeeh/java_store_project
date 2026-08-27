package store;
import Persons.*;
import java.util.*;

public class MyStore {
    private double CurrentPrice;
    private  int serialID=0;
    private  double employeeID=0;
    private static Scanner in=new Scanner(System.in);
    private  Employees saller=null;
    private  Products product=null;
    private ArrayList<Employees> employee;
    private ArrayList<Products> productsList;
    private double salledProductQuantity;

    public void ReadEmployeesInfo(){
        System.out.println("Enter the number of employees: ");
        int number=in.nextInt();
        for(int i=0;i<number;i++){
            this.employee.add(new Employees());
        }
        for(int i=0;i<this.employee.size();i++){
            System.out.println("Enter the name of employee number "+(i+1)+": ");
                this.employee.get(i).setName(in.next());
             System.out.println("Enter the age of person number " +(i+1) +" : ");
                this.employee.get(i).setAge(in.nextInt());
             System.out.println("Enter the Grade of person number " + (i+1) + " : ");
                this.employee.get(i).setGrade(in.nextFloat());
             System.out.println("Enter the Balance of person number " + (i+1) + " : ");
                 this.employee.get(i).setBalance(in.nextDouble());
        }
    }

    public void PrintInfo(){
        if(this.employee.isEmpty()){
            System.out.println("No DataBase  found! Please Read New Data First ");
            return;
        }
        System.out.println("______________________________________________________________________________________");
        System.out.println();
        for(int i=0;i<this.employee.size();i++){
            System.out.println("Employee number " +(i+1)+" name is " + this.employee.get(i).getName());
            System.out.println("Employee number " +(i+1) +" Age is "+this.employee.get(i).getAge());
            System.out.println("Employee number " + (i+1) + " Balance is " + this.employee.get(i).getBalance());
            System.out.println("Employee number " + (i+1) + " Grade is " + this.employee.get(i).getGrade());
            System.out.println("Employee number " + (i+1) + " EmployeeID is " + this.employee.get(i).get_EMPLOYEE_ID_());
        }
        System.out.println("");
        System.out.println("_________________________________________________________________________________________");
    }

    public void employeesControlPanel(){
        char input='A';
        do{
            System.out.println("Chooce from this choices ! ");
            System.out.println("To Change any data From Current Data put (A)");
            System.out.println("To Print Current Data put (B)");
            System.out.println("To Read Data From zero put (C)");
            System.out.println("To remove All Data put (D)");
             input=in.next().charAt(0);
        switch(input){
            case 'A':
                if (employee.isEmpty()) {
                System.out.println("No DataBase  found! Please Read New Data First ");

                break;
            }
                ChangeCustomValue();
                PrintInfo();
                break;

            case 'B':
                PrintInfo();
                break;

            case 'C':
                this.employee.clear();
                ReadEmployeesInfo();
                PrintInfo();
                break;
            case 'D':
                   this.employee.clear();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        }while(input!='E');
    }
//
    public void ChangeCustomValue(){
        for(int i=0;i<this.employee.size();i++){
            System.out.println("");
            System.out.println("_________________________________________________________________________________________");
            System.out.println();
            System.out.println("Change Custom Value layout ");
            System.out.println("If you want to change the name of employee number " + (i+1) + " put (A)");
            System.out.println("If you want to change the age of employee number " + (i+1) + " put (B)");
            System.out.println("If you want to change the grade of employee number " + (i+1) + " put (C)");
            System.out.println("If you want to change the balance of employee number " + (i+1) + " put (D)");
            System.out.println("If you want to skip this employee put (E)");
            System.out.println("Enter your choice: ");
            System.out.println("");
            System.out.println("_________________________________________________________________________________________");
            System.out.println();
            char input=in.next().charAt(0);
            switch(input){
                case 'A':
                    System.out.println("Enter the new name of employee number " + (i+1) + ": ");
                    this.employee.get(i).setName(in.next());
                    
                   break;
                case 'B':
                    System.out.println("Enter the new age of employee number " + (i+1) + ": ");
                    this.employee.get(i).setAge(in.nextInt());
                    break;
                case 'C':
                    System.out.println("Enter the new grade of employee number " + (i+1) + ": ");
                    this.employee.get(i).setGrade(in.nextFloat());
                   break;
                case 'D':
                    System.out.println("Enter the new balance of employee number " + (i+1) + ": ");
                    this.employee.get(i).setBalance(in.nextDouble());
                  break;
                case 'E':
                   break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    public void ReadProductsInfo(){
        System.out.println("Enter the number of products: ");
        int number=in.nextInt();
        for(int i=0;i<number;i++){
            this.productsList.add(new Products());
        }
        for(int i=0;i<this.productsList.size();i++){
            System.out.println("Enter the name of product number "+(i+1)+": ");
                this.productsList.get(i).setName(in.next());
             System.out.println("Enter the price of product number " +(i+1) +" : ");
                this.productsList.get(i).setPrice(in.nextDouble());
             System.out.println("Enter the quantity of product number " + (i+1) + " : ");
                this.productsList.get(i).setQuantity(in.nextInt());
        }
    }

    public void printProductsInfo(){
        if(this.productsList.isEmpty()){
            System.out.println("No DataBase  found! Please Read New Data First ");
            return;
        }
        for(int i=0;i<this.productsList.size();i++){
            System.out.println("_________________________________________________________________________________________");
            System.out.println();
            System.out.println("Product number " +(i+1)+" name is " + this.productsList.get(i).getName());
            System.out.println("Product number " +(i+1) +" price is "+this.productsList.get(i).getPrice());
            System.out.println("Product number " + (i+1) + " quantity is " + this.productsList.get(i).getQuantity());
            System.out.println("Product number " + (i+1) + " SerialID is " + this.productsList.get(i).getSerialID());  
            System.out.println();
            System.out.println("__________________________________________________________________________________________");
        }
    }

    public void productsControlPanel(){
        char input='A';
        do {
            System.out.println("");
            System.out.println("_______________________________________________________________________________-");
            System.out.println();
            System.out.println("Welcome to the Products Control Panel !");
            System.out.println("Please choose from the following options: ");
            System.out.println("Show products information (A)");
            System.out.println("Add new Product (B)");
            System.out.println("Pay Product (C)");
            System.out.println("Search Product with SerialID (D)");
            System.out.println("Add All Product From zero (I)");
            System.out.println("remove All Product (R)");
            System.out.println("Remove specific Product with SerialID (S)");
            System.out.println("");
            System.out.println("_______________________________________________________________________________-");
            System.out.println();
            System.out.println("Enter choice : ");
            input=in.next().charAt(0);
            switch(input){
                case 'A':
                    printProductsInfo();
                    break;
                case 'B':
                    addNewProductInExistingList();
                    ViewNewProducts();
                    break;
                case 'C':
                    this.saller=null;
                    this.product=null;
                    System.out.println("Enter Employee id : ");
                    this.employeeID=in.nextDouble();
                    System.out.println("Enter Product Serial key : ");
                    serialID=in.nextInt();
                    System.out.println("Enter quantity : ");
                    this.salledProductQuantity=in.nextDouble();
                    //This is check is employee is valid start'


                    for(int i=0;i<this.employee.size();i++){
                        if(this.employeeID==this.employee.get(i).get_EMPLOYEE_ID_()){
                            this.saller=this.employee.get(i);
                            break;
                        }
                    }

                    if(this.saller==null){
                        System.out.println("sorry , no anny employ with this ID !");
                        break;
                    }

                    //    //This is check is employee is valid end


                    for(int i=0;i<this.productsList.size();i++){
                        if(this.serialID==this.productsList.get(i).getSerialID()){
                            this.product=this.productsList.get(i);
                            break;
                        }
                    }
                    if(this.product==null){
                         System.out.println("sorry , no anny Product  with this Serial number !");
                        break;
                    }

                    if(this.product!=null && this.saller!=null){
                        if(this.saller.getBalance()>this.product.getTotalPrice(this.salledProductQuantity)){
                            if(this.product.getQuantity()>=this.salledProductQuantity){
                                this.saller.setBalance(this.saller.getBalance()-this.product.getTotalPrice(this.salledProductQuantity));
                               this.product.setQuantity((int)(this.product.getQuantity()-this.salledProductQuantity));
                               
                                 // ---- طباعة الفاتورة ----
                                 System.out.println();
                                 System.out.println("=============================================");
                                 System.out.println("               payment ");
                                 System.out.println("=============================================");
                                 System.out.println("Employee name         : " + this.saller.getName());
                                 System.out.println("Employee ID        : " + this.saller.get_EMPLOYEE_ID_());
                                 System.out.println("---------------------------------------------");
                                 System.out.println("Product name         : " + this.product.getName());
                                 System.out.println("Product Serial ID       : " + this.product.getSerialID());
                                 System.out.println("Product Price         : " + this.product.getPrice());
                                 System.out.println("Total Price   : " + this.salledProductQuantity);
                                 System.out.println("Total paid    : " + this.product.getTotalPrice(this.salledProductQuantity));
                                 System.out.println("---------------------------------------------");
                                 System.out.println("remain balance   : " + this.saller.getBalance());
                                 System.out.println("remaining products quantity    : " + this.product.getQuantity());
                                 System.out.println("=============================================");
                                 System.out.println("          Product paid Succesfully ✅");
                                 System.out.println("=============================================");
                                 System.out.println();
                            }else{
                                System.out.println("The product quantity less than you requested ! ");
                            }
                            
                        }else{
                            System.out.println("you havent engh mony ");
                        }
                        
                    }
                    break;
                case 'I':
                    ReadProductsInfo();
                    break;
                case 'R':
                    this.productsList.clear();
                    break;
                case 'S':
                    System.out.println();
                    System.out.println("Enter the SerialID of the product you want to remove: ");
                    serialID=in.nextInt();
                    for(int i=0;i<this.productsList.size();i++){
                        if(this.productsList.get(i).getSerialID()==serialID){
                            removeSpecificProduct(i);
                            System.out.println("Product with SerialID " + serialID + " has been removed.");
                            break;
                        }
                    }
                    break;
                default:
                    break;
             }
        } while(input!='E');
    }

    private void removeSpecificProduct(int i) {
        this.productsList.remove(i);
    }

    public void addNewProductInExistingList(){
        System.out.println("Enter the number of products you want to add: ");
        int number=in.nextInt();
        if(this.productsList.isEmpty()){
            System.out.println("No DataBase  found! Please Read New Data First ");
            return;
        }
        int oldSize=this.productsList.size();
        int newSize=oldSize+number;
        for(int i=oldSize;i<newSize;i++){
            this.productsList.add(new Products());
        }
        for(int i=oldSize;i<this.productsList.size();i++){
            System.out.println("Enter the name of product number "+(i)+": ");
                this.productsList.get(i).setName(in.next());
             System.out.println("Enter the price of product number " +(i) +" : ");
                this.productsList.get(i).setPrice(in.nextDouble());
             System.out.println("Enter the quantity of product number " + (i) + " : ");
                this.productsList.get(i).setQuantity(in.nextInt());
        }
        
    }

    public void ViewNewProducts(){
        for(int i=0;i<this.productsList.size();i++){
            System.out.println("_________________________________________________________________________________________");
            System.out.println();
            System.out.println("Product number " + (i+1) + " SerialID " + this.productsList.get(i).getSerialID());
            System.out.println("Product number " + (i+1) + " name " + this.productsList.get(i).getName());
            System.out.println("Product number " + (i+1) + " price " + this.productsList.get(i).getPrice());
            System.out.println("Product number " + (i+1) + " quantity " + this.productsList.get(i).getQuantity());
            System.out.println();
            System.out.println("__________________________________________________________________________________________");
        }
    }

    public MyStore(ArrayList<Employees> employee) {
        this.employee = employee;
    }
    
    public MyStore(ArrayList<Employees> employee, ArrayList<Products> productsList) {
        this.employee = employee;
        this.productsList = productsList;
    }

}