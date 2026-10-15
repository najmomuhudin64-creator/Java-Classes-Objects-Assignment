public class Equipment {
    String id;
    String name;
    int quantity;

    public Equipment(String id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("Equipment ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Available Quantity: " + quantity);
    }

    public void borrow() {
        if (quantity == 0) {
            System.out.println("Sorry, " + name + " is not available now.");
        } else {
            quantity = quantity - 1;
            System.out.println("Equipment Borrowed Successfully!");
            System.out.println("Remaining Quantity: " + quantity);
        }
    }

    public void giveBack() {
        quantity = quantity + 1;
        System.out.println("Equipment Returned Successfully!");
        System.out.println("Available Quantity: " + quantity);
    }
}