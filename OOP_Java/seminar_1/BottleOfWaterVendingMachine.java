package OOP_Java.seminar_1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VandingMachine {

    List<BottleOfWater> productList = null;

    public BottleOfWaterVendingMachine(List<BottleOfWater> productList) {
        this.productList = productList;
    }

    public List<BottleOfWater> getProductList() {
        return productList;
    }

    public void setProductList(List<BottleOfWater> productList) {
        this.productList = productList;
    }


    public BottleOfWater getProduct(String name, int volume) {
        for (BottleOfWater bottleOfWater : productList) {
            if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                return bottleOfWater;
            }
        }
        return null;

    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;

    }

    public void addBottleOfWater (BottleOfWater bottleOfWater){
        this.productList.add(bottleOfWater);
    }
}
