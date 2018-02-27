package pizzaCalories;

import pizzaCalories.ingredients.Topping;
import pizzaCalories.ingredients.dough.Dough;
import pizzaCalories.ingredients.toppings.Cheese;
import pizzaCalories.ingredients.toppings.Meat;
import pizzaCalories.ingredients.toppings.Sauce;
import pizzaCalories.ingredients.toppings.Veggies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaCalories {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] inputArgs = bfr.readLine().split(" ");
            String pizzaName = inputArgs[1];
            int numberOfToppings = Integer.parseInt(inputArgs[2]);

            inputArgs = bfr.readLine().split(" ");
            String doughType = inputArgs[1];
            String doughTaste = inputArgs[2];
            int doughWeight = Integer.parseInt(inputArgs[3]);
            Pizza pizza = new Pizza(pizzaName, numberOfToppings);
            Dough dough = new Dough(doughWeight, doughType, doughTaste);
            pizza.setDough(dough);

            for (int i = 0; i < numberOfToppings; i++) {
                inputArgs = bfr.readLine().split(" ");

                String toppingName = inputArgs[1];
                int weight = Integer.parseInt(inputArgs[2]);
                Topping topping;

                switch (toppingName.toLowerCase()){
                    case "veggies":
                        topping = new Veggies(weight);
                        break;
                    case "meat":
                        topping = new Meat(weight);
                        break;
                    case "sauce":
                        topping = new Sauce(weight);
                        break;
                    case "cheese":
                        topping = new Cheese(weight);
                        break;
                    default:
                        throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingName));
                }

                pizza.getToppings()[i] = topping;
            }

            System.out.printf("%s - %.2f Calories.", pizza.getName(), pizza.getCalories());
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
