package BuilderArtykul;

/**
 * Created by "Bartosz Chodyla" on 2020-08-12.
 */
public interface AbstractBuilder {
    public void addDough(String dough);
    public void addCheese(String cheese);
    public void addMeat(String meat);
    public void addMushrooms(String mushrooms);
    public void addSauce(String sauce);
    public Pizza makePizza();
}
