package pizzaCalories.ingredients.toppings;

import pizzaCalories.ingredients.Topping;

public class Meat extends Topping{

    private static final String NAME = "Meat";

    private static final double MEAT_MODIFIER = 1.2;

    public Meat(int weight) {
        super(weight, MEAT_MODIFIER, NAME);
    }
}
