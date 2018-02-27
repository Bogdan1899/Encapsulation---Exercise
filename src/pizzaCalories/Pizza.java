package pizzaCalories;

import pizzaCalories.ingredients.Topping;
import pizzaCalories.ingredients.dough.Dough;


public class Pizza {

    private String name;

    private Dough dough;

    private Topping[] toppings;

    private double calories;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() < 1 || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }

        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Topping[] getToppings() {
        return toppings;
    }

    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.toppings = new Topping[numberOfToppings];
    }

    public double getCalories() {
        this.setCalories();
        return calories;
    }

    public void setCalories() {
        double totalCalories = this.getDough().calculateCalories();

        for (Topping topping : toppings) {
            totalCalories += topping.calculateCalories();
        }

        this.calories = totalCalories;
    }
}
