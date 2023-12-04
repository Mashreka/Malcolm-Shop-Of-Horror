public class Customer {
    private double customerTotal = 0;
    int shoppingBag = 0;

    Customer(double customerTotal, int shoppingBag) {
        this.customerTotal = customerTotal;
        this.shoppingBag = shoppingBag;
    }

    void checkout(double itemPrice, int stockBalance) {
        if (stockBalance > 0) {
            customerTotal = getCustomerTotal() + itemPrice;
            shoppingBag++;
        }
    }

    void customerInfo() {
        System.out.println("You have a total of " + shoppingBag + " items in your shopping bag, The total cost was " + customerTotal + "SEK");
    }

    double getCustomerTotal() {
        return customerTotal;
    }

    void setCustomerTotal() {
        this.customerTotal = customerTotal;
    }

}
