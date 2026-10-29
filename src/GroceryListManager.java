
import java.util.HashMap;
import java.util.Map;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // adds an item and its cost
    public void addItem(String item, double cost) {
        if (cost < 0) {
            System.out.println("Cost cannot be negative.");
        } else {
            groceryList.put(item, cost);
        }
    }

    // removes an item
    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    // shows all items and their costs
    public void displayList() {
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey() + ": €"
                    + String.format("%.2f", entry.getValue()));
        }
    }

    // checks if an item exists
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // calculates the total cost
    public double calculateTotalCost() {
        double total = 0;

        for (double cost : groceryList.values()) {
            total += cost;
        }

        return total;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 2.50);
        manager.addItem("Milk", 1.80);
        manager.addItem("Bread", 2.20);

        System.out.println("Grocery List:");
        manager.displayList();

        System.out.println();
        System.out.println("Is Milk in the grocery list? "
                + manager.checkItem("Milk"));

        System.out.println();
        System.out.println("Total cost: €"
                + String.format("%.2f", manager.calculateTotalCost()));

        System.out.println();
        System.out.println("Removing Milk from the list...");
        manager.removeItem("Milk");

        System.out.println();
        System.out.println("Updated Grocery List:");
        manager.displayList();

        System.out.println();
        System.out.println("Updated total cost: €"
                + String.format("%.2f", manager.calculateTotalCost()));
    }
}
