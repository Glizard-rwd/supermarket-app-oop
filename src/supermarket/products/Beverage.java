package supermarket.products;

public class Beverage extends GroceryProduct {
    private SugarLevel sugarLevel;
    public Beverage(String name, double price, double discount, SugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;
    }
    // display info
    public String display() {
        return super.display() + "Sugar level: " + sugarLevel;
    }
    // getter and setter
    public SugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(SugarLevel sugarLevel) {
        this.sugarLevel = sugarLevel;
    }
}
