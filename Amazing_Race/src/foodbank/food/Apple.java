package foodbank.food;

public class Apple extends FoodItem {
    
    private final String name = "Apple";
    public Apple(int weight, int volume, int expDate) {
        super(weight, volume, expDate);
    }

    public void Slice() {
        System.out.println("First step towards Apple Pie!");
    }
}