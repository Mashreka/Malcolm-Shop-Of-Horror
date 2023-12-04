import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer(0.00, 0);

        Store mask = new Store(1, " Mask ", 199.90, 37);
        Discount knife = new Discount(2, " Knife ", 200.00, 23);
        Store blood = new Store(3, " Fake blood ", 59.95, 14);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Welcome, WELCOME!!! Make your choice");
            mask.info();
            knife.info();
            blood.info();
            System.out.println("4 = Go to checkout counter");
            int answer = scanner.nextInt();

            if (answer == 1) {
                customer.checkout(mask.getItemPrice(), mask.getStockBalance());
                mask.setStockBalance(mask.getStockBalance() - 1);
            } else if (answer == 2) {
                customer.checkout(knife.getItemPrice(), knife.getStockBalance());
                knife.setStockBalance(knife.getStockBalance() - 1);
            } else if (answer == 3) {
                customer.checkout(blood.getItemPrice(), blood.getStockBalance());
                blood.setStockBalance(blood.getStockBalance() - 1);
            } else if (answer == 4) {
                customer.customerInfo();
                isRunning = false;
            }
        }
    }
}