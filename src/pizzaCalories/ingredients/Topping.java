package pizzaCalories.ingredients;

import pizzaCalories.interfaces.Modifiable;

public abstract class Topping extends IngredientImpl implements Modifiable {

    private String toppingName;

    private double modifier;

    protected Topping(double weight, double modifier, String toppingName) {
        super(weight);
        this.setToppingName(toppingName);
        this.setModifier(modifier);
    }

    public String getToppingName() {
        return toppingName;
    }

    private void setToppingName(String toppingName) {

        this.toppingName = toppingName;
    }

    public double getModifier() {
        return modifier;
    }

    private void setModifier(double modifier) {
        this.modifier = modifier;
    }

    @Override
    protected void setWeight(double weight) {
        if (weight < 1 || weight > 50){
            throw new IllegalArgumentException(this.getToppingName() + " weight should be in the range [1..50]");
        }

        super.weight = weight;
    }

    @Override
    public double calculateCalories() {
        return super.calculateCalories() * this.getModifier();
    }
}
