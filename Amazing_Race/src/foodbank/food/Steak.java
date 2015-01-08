package foodbank.food;

public class Steak extends FoodItem {
    
    private final String name = "Steak";
    public Steak(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Grill() {
        System.out.println("Mmmm... Meat....");
    }
}