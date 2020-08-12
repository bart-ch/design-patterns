package BuilderArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-12.
 */
public class PizzaBuilder implements AbstractBuilder {
    Pizza pizza = new Pizza();

    public void addDough(String dough) {
        pizza.dough = dough;
    }

    public void addCheese(String cheese) {
        pizza.cheese = cheese;
    }

    public void addMeat(String meat) {
        pizza.meat = meat;
    }

    public void addMushrooms(String mushrooms) {
        pizza.mushrooms = mushrooms;
    }

    public void addSauce(String sauce) {
        pizza.sauce = sauce;
    }

    public Pizza makePizza() {
        return pizza;
    }
}
