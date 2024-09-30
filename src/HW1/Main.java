package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        HotWater hotWater1 = new HotWater("Чай", 1.50, 80);
        HotWater hotWater2 = new HotWater("Кофе", 5.00, 90);
        HotWater hotWater3 = new HotWater("Горячий шоколад", 2.00, 85);

        products.add(hotWater1);
        products.add(hotWater2);
        products.add(hotWater3);

        HotWaterVendingMachine hotWaterVendingMachine = new HotWaterVendingMachine(products);

        try {
            HotWater selectedDrink = hotWaterVendingMachine.getProduct("Кофе", 75, 90);
            System.out.println(selectedDrink);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            HotWater selectedDrink = hotWaterVendingMachine.getProduct("Чай", 75, 80);
            System.out.println(selectedDrink);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
