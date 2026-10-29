
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, GroceryItem> groceryList = new HashMap<>();

    // stores the cost and category of an item
    private static class GroceryItem {
        double cost;
        String category;

        public GroceryItem(double cost, String category) {
            this.cost = cost;
            this.category = category;
        }
    }

    // Task 1 and 2: add an item with its cost
    public void addItem(String item, double cost) {
        addItem(item, cost, "Other");
    }

    // Task 3: add an item with its cost and category
    public void addItem(String item, double cost, String category) {
        if (cost < 0) {
            System.out.println("Cost cannot be negative.");
        } else {
            groceryList.put(item, new GroceryItem(cost, category));
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

    public void displayList() {
        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem groceryItem = entry.getValue();

            System.out.println(entry.getKey()
                    + ": €" + String.format("%.2f", groceryItem.cost)
                    + " (" + groceryItem.category + ")");
        }
    }

    public double calculateTotalCost() {
        double total = 0;

        for (GroceryItem item : groceryList.values()) {
            total += item.cost;
        }

        return total;
    }

    // Task 3: show items belonging to a category
    public void displayByCategory(String category) {
        boolean found = false;

        System.out.println("Items in " + category + ":");

        for (Map.Entry<String, GroceryItem> entry : groceryList.entrySet()) {
            GroceryItem item = entry.getValue();

            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(entry.getKey()
                        + ": €" + String.format("%.2f", item.cost));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No items found in this category.");
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.50, "Fruits");
        manager.addItem("Milk", 1.80, "Dairy");
        manager.addItem("Bread", 2.20, "Bakery");
        manager.addItem("Bananas", 1.50, "Fruits");
        manager.addItem("Cheese", 3.40, "Dairy");

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        manager.displayByCategory("Fruits");

        System.out.println();
        manager.displayByCategory("Dairy");

        System.out.println();
        System.out.println("Total cost: €"
                + String.format("%.2f", manager.calculateTotalCost()));
    }
}
