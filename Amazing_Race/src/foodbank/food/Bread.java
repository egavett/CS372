package foodbank.food;

public class Bread extends FoodItem {
    
    private final String name = "Bread";
    public Bread(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Toast() {
        System.out.println("Toasting...");
    }
}