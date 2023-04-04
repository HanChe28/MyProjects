import java.util.Scanner;

public class GroceryBilling {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        boolean continueShopping = true;

        while (continueShopping) {
            System.out.print("Enter the item name: ");
            String itemName = input.nextLine();
            System.out.print("Enter the item price: ");
            double itemPrice = input.nextDouble();
            System.out.print("Enter the quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); // consume the newline character

            double itemCost = itemPrice * quantity;
            totalCost += itemCost;

            System.out.println("Item: " + itemName);
            System.out.println("Price: " + itemPrice);
            System.out.println("Quantity: " + quantity);
            System.out.println("Cost: " + itemCost);

            System.out.print("Do you want to continue shopping? (Y/N): ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                continueShopping = false;
            }
        }

        System.out.println("Total cost: " + totalCost);
    }

}
