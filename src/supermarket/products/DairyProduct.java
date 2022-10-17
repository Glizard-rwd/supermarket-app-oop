package supermarket.products;

public class DairyProduct extends GroceryProduct {
    private Fat fat;
    public DairyProduct(String name, double price, double discount, Fat fat) {
        super(name, price, discount);
        this.fat = fat;
    }

    // display info
    public String display() {
        return super.display() + "Fat: " + fat;
    }

    // getter and setter
    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

}
