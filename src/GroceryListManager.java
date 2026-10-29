
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, GroceryItem> groceryList = new HashMap<>();

    // stores the details of each grocery item
    private static class GroceryItem {
        double cost;
        String category;
        int quantity;

        public GroceryItem(double cost, String category, int quantity) {
            this.cost = cost;
            this.category = category;
            this.quantity = quantity;
        }
    }

    // Task 1 and 2: add an item with its cost
    public void addItem(String item, double cost) {
        addItem(item, cost, "Other", 1);
    }

    // Task 3: add an item with its cost and category
    public void addItem(String item, double cost, String category) {
        addItem(item, cost, category, 1);
    }

    // Task 4: add an item with its cost, category, and quantity
    public void addItem(String item, double cost, String category, int quantity) {
        if (cost < 0) {
            System.out.println("Cost cannot be negative.");
        } else if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
        } else {
            groceryList.put(item, new GroceryItem(cost, category, quantity));
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // shows every item
    public void displayList() {
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem groceryItem = entry.getValue();

            System.out.println(entry.getKey()
                    + ": €" + String.format("%.2f", groceryItem.cost)
                    + ", Category: " + groceryItem.category
                    + ", Quantity: " + groceryItem.quantity);
        }
    }

    // calculates the total cost of all items, including their quantities
    public double calculateTotalCost() {
        double total = 0;

        for (GroceryItem item : groceryList.values()) {
            total += item.cost * item.quantity;
        }

        return total;
    }

    // Task 3: shows items belonging to a category
    public void displayByCategory(String category) {
        boolean found = false;

        System.out.println("Items in " + category + ":");

        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();

            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(entry.getKey()
                        + ": €" + String.format("%.2f", item.cost)
                        + ", Quantity: " + item.quantity);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    // Task 4: updates an item's quantity
    public void updateQuantity(String item, int newQuantity) {
        if (!groceryList.containsKey(item)) {
            System.out.println(item + " is not in the list.");
        } else if (newQuantity < 0) {
            System.out.println("Quantity cannot be negative.");
        } else {
            groceryList.get(item).quantity = newQuantity;
        }
    }

    // Task 4: shows only items with a positive quantity
    public void displayAvailableItems() {
        System.out.println("Available items:");

        boolean found = false;

        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();

            if (item.quantity > 0) {
                System.out.println(entry.getKey()
                        + " - Quantity: " + item.quantity
                        + ", Cost: €" + String.format("%.2f", item.cost)
                        + ", Category: " + item.category);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No available items.");
        }
    }


    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        //add items
        manager.addItem("Apples", 2.50, "Fruits", 5);
        manager.addItem("Milk", 1.80, "Dairy", 2);
        manager.addItem("Bread", 2.20, "Bakery", 3);
        manager.addItem("Bananas", 1.50, "Fruits", 4);
        manager.addItem("Cheese", 3.40, "Dairy", 1);

        //total cost
        System.out.println("Total cost:");
        System.out.println(manager.calculateTotalCost());

        //categories
        System.out.println("\nFruits:");
        manager.displayByCategory("Fruits");

        //quantity update
        System.out.println("\nUpdating Milk quantity to 5...");
        manager.updateQuantity("Milk", 5);

        //available items
        manager.updateQuantity("Bread", 0);
        System.out.println("\nAvailable items:");
        manager.displayAvailableItems();

        //updated total cost
        System.out.println("\nUpdated total cost:");
        System.out.println(manager.calculateTotalCost());
    }

}
