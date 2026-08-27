import java.util.*;
import Persons.*;
import store.*;
public class MainActivity {
    public static void main(String[] args) {
        ArrayList<Employees> employee = new ArrayList<>();
        ArrayList<Products> productsList = new ArrayList<>();
        MyStore store = new MyStore(employee, productsList);
        //store.employeesControlPanel();
        store.employeesControlPanel();
        store.productsControlPanel();
        
    }
}