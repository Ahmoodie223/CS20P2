package Mastery;

public class Foods {
  
    private double price;
    private int fat;
    private int carbs;
    private int fiber;

    // Constructor to initialize food properties
    public Foods(double price, int fat, int carbs, int fiber) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    // Getter methods
    public double getPrice() {
        return price;
    }

    public int getFat() {
        return fat;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getFiber() {
        return fiber;
    }
}

