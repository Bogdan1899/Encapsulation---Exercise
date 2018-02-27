package pizzaCalories.ingredients.toppings;

import pizzaCalories.ingredients.Topping;

public class Veggies extends Topping{

    private static final String NAME = "Veggies";

    private static final double VEGGIES_MODIFIER = 0.8;

    public Veggies(int weight) {
        super(weight, VEGGIES_MODIFIER, NAME);
    }
}
