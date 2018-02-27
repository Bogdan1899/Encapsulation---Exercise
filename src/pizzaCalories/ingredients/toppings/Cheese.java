package pizzaCalories.ingredients.toppings;

import pizzaCalories.ingredients.Topping;

public class Cheese extends Topping{

    private static final String NAME = "Cheese";

    private static final double CHEESE_MODIFIER = 1.1;

    public Cheese(int weight) {
        super(weight, CHEESE_MODIFIER, NAME);
    }
}
