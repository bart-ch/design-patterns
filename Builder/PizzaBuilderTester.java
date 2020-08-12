package BuilderArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-12.
 */
public class PizzaBuilderTester {

    public static void main(String[] args) {

        AbstractBuilder italianPizzaBuilder = new PizzaBuilder();
        italianPizzaBuilder.addDough("italian");
        italianPizzaBuilder.addSauce("Marinara");
        italianPizzaBuilder.addCheese("Reggiano");
        italianPizzaBuilder.addMeat("chorizo");
        Pizza italianPizza = italianPizzaBuilder.makePizza();

        AbstractBuilder americanPizzaBuilder = new PizzaBuilder();
        americanPizzaBuilder.addDough("american");
        americanPizzaBuilder.addSauce("plum tomato");
        americanPizzaBuilder.addCheese("Mozzarella");
        americanPizzaBuilder.addMeat("ham");
        americanPizzaBuilder.addMushrooms("champaignon");
        Pizza americanPizza = americanPizzaBuilder.makePizza();

        System.out.println("Italian " + italianPizza);
        System.out.println("\nAmerican " + americanPizza);
    }
}
