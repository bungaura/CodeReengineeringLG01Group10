import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	private List<Item> items;

    // constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // add item to cart
    public void addItem(Item item) {
        items.add(item);
    }

    public static void main(String[] args) {
        double totalPrice = 0;

        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item name (or 'exit' to quit):");
            String itemName = scanner.nextLine();
            if (itemName.equals("exit")) {
                break;
            }
            System.out.println("Enter item price:");
            double itemPrice = Double.parseDouble(scanner.nextLine());
            Item item = new Item(itemName, itemPrice);
            cart.addItem(item);

            totalPrice = totalPrice + itemPrice;
        }

        scanner.close();
        System.out.println("Total price: " + totalPrice);
    }
}
