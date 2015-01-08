package foodbank.food;

public class Carrot extends FoodItem {
    
    private final String name = "Carrot";
    public Carrot(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Peel() {
        System.out.println("Peeling...");
    }
}