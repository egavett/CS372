package foodbank.main;

import java.util.Random;
import foodbank.food.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        FoodContainer fc = new FoodContainer();
        int c = rnd.nextInt(50) + 20;
        for (int i=0; i<c; i++) {
            if (rnd.nextBoolean())
                fc.addItem(new Soup(rnd.nextInt(30) + 10, rnd.nextInt(50) + 10, i + 5 ));
            else
                fc.addItem(new Coffee(rnd.nextInt(50) + 10, rnd.nextInt(150) + 10, i));
        }
        System.out.printf("Total number of items: %d\n", fc.getCount());
        System.out.printf("\tTotal weight: %d\n", fc.getWeight());
        System.out.printf("\tTotal volume: %d\n", fc.getVolume());
    }
}