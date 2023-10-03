
package OOP_Java.lesson_1;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<HotDrinks> listProduct = new ArrayList<>();

        listProduct.add(new HotDrinks("coffe", 40, 2, 34));
        listProduct.add(new HotDrinks("cocao", 20, 3, 40));
        listProduct.add(new HotDrinks("tea", 42, 1, 44));
        listProduct.add(new HotDrinks("Chtoto", 30, 2, 32));
     
        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(listProduct);
        System.out.println(vendingMachine.getProduct("coffe"));
        System.out.println(vendingMachine.getProduct("tea", 42, 1, 44));
        System.out.println(vendingMachine.getProduct("coffe", 40, 2, 34));
        
    }
    
}

