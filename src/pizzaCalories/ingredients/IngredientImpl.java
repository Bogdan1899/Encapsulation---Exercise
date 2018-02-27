package pizzaCalories.ingredients;

import pizzaCalories.interfaces.Ingredient;

public abstract class IngredientImpl implements Ingredient {

    private static final int CALORIES_PER_GRAM = 2;

    protected double weight;

    protected IngredientImpl(double weight) {
        this.setWeight(weight);
    }

    @Override
    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    @Override
    public double calculateCalories() {
        return CALORIES_PER_GRAM * this.getWeight();
    }
}
