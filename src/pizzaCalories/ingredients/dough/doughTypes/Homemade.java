package pizzaCalories.ingredients.dough.doughTypes;

import pizzaCalories.interfaces.Modifiable;

public class Homemade implements Modifiable {

    private static final double HOMEMADE_MODIFIER = 1.0;

    public Homemade() {
    }

    @Override
    public double getModifier() {
        return HOMEMADE_MODIFIER;
    }
}
