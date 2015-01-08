package foodbank.food;

public class Soup extends FoodItem {
    
    private final String name = "Soup";
    public Soup(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Heat() {
        System.out.println("Mmm mmm good");
    }
}