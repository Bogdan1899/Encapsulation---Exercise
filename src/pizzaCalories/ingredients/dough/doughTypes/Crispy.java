package pizzaCalories.ingredients.dough.doughTypes;

import pizzaCalories.interfaces.Modifiable;

public class Crispy implements Modifiable {

    private static final double CRISPY_MODIFIER = 0.9;

    public Crispy() {
    }

    @Override
    public double getModifier() {
        return CRISPY_MODIFIER;
    }
}
