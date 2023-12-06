import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(0.00, 0);
        // Create instances of Store to represent different items
        Store mask = new Store(1, " Mask ", 199.90, 37);
        Discount knife = new Discount(2, " Knife ", 200.00, 23);
        Store blood = new Store(3, " Fake blood ", 59.95, 14);

        boolean isRunning = true;
        // loop continues until the customer chooses to go to the checkout counter
        while (isRunning) {
            System.out.println("Welcome, WELCOME!!! Make your choice");
            mask.info();
            knife.info();
            blood.info();
            System.out.println("4 = Go to checkout counter");
            int answer = scanner.nextInt();
            //Used a switch statement to handle the customer's choice instead of multiple if-else statements
            switch (answer) {
                case 1 -> processItem(customer, mask);
                case 2 -> processItem(customer, knife);
                case 3->processItem(customer, blood);
                case 4-> {
                    customer.customerInfo();
                    isRunning = false;
                }
                // used a default case to handle an invalid choice and provide appropriate feedback to the user.
                default-> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    //  Extracted item processing logic into a separate method to process the selected item and update customer and item details

    private static void processItem(Customer customer, Store item) {
        customer.checkout(item.getItemPrice(), item.getStockBalance());
        item.setStockBalance(item.getStockBalance() - 1);
    }
}