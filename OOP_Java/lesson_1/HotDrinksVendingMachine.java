package OOP_Java.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VandingMachine {

    List<HotDrinks> prodList = new ArrayList<>();

    public HotDrinksVendingMachine(List<HotDrinks> prodList) {
        this.prodList = prodList;
    }

    public List<HotDrinks> getProdList() {
        return prodList;
    }

    public void setProdList(List<HotDrinks> prodList) {
        this.prodList = prodList;
    }

    public HotDrinks getProduct(String name, double price, int volume, int temperature) {
        for (HotDrinks hotDrinks : prodList) {
            if (hotDrinks.getName().equals(name) && hotDrinks.getPrice() == (price)  && hotDrinks.getVolume() == (volume) &&
                    hotDrinks.getTemperature() == (temperature)) {
                return hotDrinks;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : prodList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addHotDrinks(HotDrinks hotDrinks) {
        prodList.add(hotDrinks);
    }

}
