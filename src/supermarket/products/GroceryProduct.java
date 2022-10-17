package supermarket.products;

public class GroceryProduct {
    private String name;
    private double price;
    private double discount;

    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    // display info
    public String display() {
        return "Name: " + name + "\nPrice: " + price +  "\nDiscount: " + discount + "%";
    }

    // get actual price
    public double getActualPrice() {
        return price - (price*discount / 100);
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
