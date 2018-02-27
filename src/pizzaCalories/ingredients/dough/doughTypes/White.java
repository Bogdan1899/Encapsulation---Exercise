package pizzaCalories.ingredients.dough.doughTypes;

import pizzaCalories.interfaces.Modifiable;

public class White implements Modifiable {

    private static final double WHITE_MODIFIER = 1.5;

    public White() {
    }

    @Override
    public double getModifier() {
        return WHITE_MODIFIER;
    }
}
