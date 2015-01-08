package foodbank.food;

public class Coffee extends FoodItem {
    
    private final String name = "Coffee";
    
    public Coffee(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Grind() {
        System.out.println("grinding ...");
    }
}