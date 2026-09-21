public class Item {
    // this is the base class for all items which has a item name and a item price
    private String name;
    private double price;

    // this is the constructor for the Item class which takes in a item name and item price
    public Item(String name, double price) {
        // this is the check to ensure that the price is greater than zero
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.name = name;
        this.price = price;
    }

    // this is the getter method for the item name and item price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // this is the method to calculate the total price for a given quantity of items
    // it also a method  that can be overridden by subclasses to apply discounts or other pricing rules
    public double calculateTotal(int quantity) {
        // this is the check to ensure that the quantity is not negative
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        return price * quantity;
        
    }
}
