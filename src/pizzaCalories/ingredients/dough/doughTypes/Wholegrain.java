package pizzaCalories.ingredients.dough.doughTypes;

import pizzaCalories.interfaces.Modifiable;

public class Wholegrain implements Modifiable {

    private static final double WHOLEGRAIN_MODIFIER = 1.0;

    public Wholegrain() {
    }

    @Override
    public double getModifier() {
        return WHOLEGRAIN_MODIFIER;
    }
}
