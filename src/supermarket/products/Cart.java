package supermarket.products;

import java.util.ArrayList;

public class Cart {
    public static void main(String[] args) {
        ArrayList<GroceryProduct> carts = new ArrayList<>();
        GroceryProduct oranges = new GroceryProduct("orange", 120, 12);
        carts.add(oranges);
        DairyProduct milk = new DairyProduct("Dutch Lady", 90, 20, Fat.FULLCREAM);
        carts.add(milk);
        Beverage juice = new Beverage("juice", 56, 12, SugarLevel.LIGHT);
        carts.add(juice);

        double totalPrice = 0;
        for (GroceryProduct product: carts) {
            totalPrice += product.getActualPrice();
        }
        System.out.println("The total price is: " + totalPrice + " VND");
    }
}
