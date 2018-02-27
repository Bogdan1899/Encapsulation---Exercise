package pizzaCalories.ingredients.toppings;

import pizzaCalories.ingredients.Topping;

public class Sauce extends Topping{

    private static final String NAME = "Sauce";

    private static final double SAUCE_MODIFIER = 0.9;

    public Sauce(int weight) {
        super(weight, SAUCE_MODIFIER, NAME);
    }
}
