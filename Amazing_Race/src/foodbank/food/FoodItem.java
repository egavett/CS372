package foodbank.food;

public class FoodItem {
    private final int weight, volume, expDate;
    private final String name = "Generic Item";
    
    public FoodItem(int weight, int volume, int expDate) {
        this.weight = weight;
        this.volume = volume;
        this.expDate = expDate;
    }

    public int getWeight(){ 
        return weight; 
    }

    public int getVolume(){
        return volume; 
    }
    
    public int getExpDate(){
        return expDate;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String info = name + ": Weight - " + weight + " | Volume - " + volume + " | Expiration Date - " + expDate;
        return info;
    }
    
}