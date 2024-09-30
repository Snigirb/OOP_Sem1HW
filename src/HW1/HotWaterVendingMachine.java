package HW1;

import java.util.List;

public class HotWaterVendingMachine implements VendingMachine {
    private final List<Product> products;

    public HotWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name){
        for(Product product: products){
            if(product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotWater getProduct(String name, int volume, int temperature){
        for(Product product: products){
            if(product instanceof HotWater){
                if(product.getName().equalsIgnoreCase(name) && ((HotWater) product).getTemperature() == temperature){
                    return (HotWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }
}