package pizzaCalories.ingredients.dough;

import pizzaCalories.ingredients.IngredientImpl;
import pizzaCalories.ingredients.dough.doughTypes.*;
import pizzaCalories.interfaces.Modifiable;

public class Dough extends IngredientImpl{

    private Modifiable doughType;

    private Modifiable taste;

    public Dough(double weight, String doughType, String taste) {
        super(weight);
        this.setDoughType(doughType);
        this.setTaste(taste);
    }

    public Modifiable getDoughType() {
        return doughType;
    }

    private void setDoughType(String doughType) {
        switch (doughType.toLowerCase()) {
            case "white":
                this.doughType = new White();
                break;
            case "wholegrain":
                this.doughType = new Wholegrain();
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public Modifiable getTaste() {
        return taste;
    }

    private void setTaste(String taste) {
        switch (taste.toLowerCase()) {
            case "chewy":
                this.taste = new Chewy();
                break;
            case "crispy":
                this.taste = new Crispy();
                break;
            case "homemade":
                this.taste = new Homemade();
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    @Override
    public double calculateCalories() {
        return super.calculateCalories() * this.getDoughType().getModifier() * this.getTaste().getModifier();
    }
}
