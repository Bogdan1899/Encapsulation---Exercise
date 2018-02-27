package pizzaCalories.ingredients.dough.doughTypes;

import pizzaCalories.interfaces.Modifiable;

public class Chewy implements Modifiable {

    private static final double CHEWY_MODIFIER = 1.1;

    public Chewy() {
    }

    @Override
    public double getModifier() {
        return CHEWY_MODIFIER;
    }
}
