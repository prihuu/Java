import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // adds an item to the grocery list
    public void addItem(String item) {
        if (!groceryList.contains(item)) {
            groceryList.add(item);
        } else {
            System.out.println(item + " is already in the list.");
        }
    }

    // removes an item from the grocery list
    public void removeItem(String item) {
        if (groceryList.contains(item)) {
            groceryList.remove(item);
        } else {
            System.out.println(item + " is not in the list.");
        }
    }

    // shows all items in the grocery list
    public void displayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // checks if an item is in the grocery list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // add items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        // show the original list
        System.out.println("Grocery List:");
        manager.displayList();

        // check if Milk is in the list
        System.out.println();
        System.out.println("Is \"Milk\" in the grocery list? "
                + manager.checkItem("Milk"));

        // remove Milk
        System.out.println();
        System.out.println("Removing \"Milk\" from the list...");
        manager.removeItem("Milk");

        // display the updated list
        System.out.println();
        System.out.println("Updated Grocery List:");
        manager.displayList();
    }
}
