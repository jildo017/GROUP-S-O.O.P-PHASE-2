public class FlatDiscountItem extends Item {
    // this is the minimum quantity needed for discount
    private int threshold;
    // and this is the amount to deduct
    private double flatAmount;

    // then here is the constructor for this class, which takes in the name, price,
    // threshold, and flatAmount
    public FlatDiscountItem(String name, double price, int threshold, double flatAmount) {

        // this is the call parent constructor for the name and price
        super(name, price);

        this.threshold = threshold;
        this.flatAmount = flatAmount;
    }

    // this is the overridden method to calculate the total price with the discount
    // applied
    @Override
    public double calculateTotal(int quantity) {
        // first, we call the parent class's calculateTotal method to get the subtotal
        double subtotal = super.calculateTotal(quantity);
        // then we check if the quantity is greater than or equal to the threshold for
        // the discount
        if (quantity >= threshold) {
            subtotal = Math.max(0, subtotal - flatAmount);
        }
        return subtotal;
    }
}
